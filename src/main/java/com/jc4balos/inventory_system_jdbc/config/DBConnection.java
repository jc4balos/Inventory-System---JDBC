package com.jc4balos.inventory_system_jdbc.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static String url = "jdbc:mysql://localhost:3306/inventory_db";
    private static String username = "root";
    private static String password = "";

    public static Connection connect() throws SQLException {

        Connection con = DriverManager.getConnection(url, username, password);
        if (con != null) {
            System.out.println("Database connection esatablished!");
        } else {
            System.out.println("Database connection failed!");
        }
        return con;

    }
}
