package com.jc4balos.inventory_system_jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jc4balos.inventory_system_jdbc.config.DBConnection;
import com.jc4balos.inventory_system_jdbc.mapper.User;

public class UserService {
    public static void addUser(User user) {
        try {
            Connection con = DBConnection.connect();
            String sql = "INSERT INTO users SET user_name=?, pass_word=?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, user.userName);
            pstmt.setString(2, user.passWord);
            pstmt.executeUpdate();
            con.close();
            System.out.println("Added " + user.userName);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<User> getAllUsers() {
        try {
            Connection con = DBConnection.connect();
            String sql = "SELECT * FROM users";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            List<User> users = new ArrayList<>();
            while (rs.next()) {
                User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3));
                users.add(user);
            }
            con.close();
            return users;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;

        }

    }

    public static void updateUserName(String userName, Integer userId) {
        try {
            Connection con = DBConnection.connect();
            String sql = "UPDATE users SET user_name=? WHERE user_id=?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, userName);
            pstmt.setInt(2, userId);
            pstmt.executeUpdate();
            con.close();
            System.out.println("Username updated to " + userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
