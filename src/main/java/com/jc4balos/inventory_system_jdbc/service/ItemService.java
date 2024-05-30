package com.jc4balos.inventory_system_jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jc4balos.inventory_system_jdbc.config.DBConnection;
import com.jc4balos.inventory_system_jdbc.mapper.Item;

public class ItemService {

    public static void additem(Item item) throws SQLException {
        Connection con = DBConnection.connect();
        String sql = "INSERT INTO items SET item_name=?, item_qty=?, unit_id=?, item_description=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, item.itemName);
        pstmt.setInt(2, item.itemQty);
        pstmt.setInt(3, item.unitId);
        pstmt.setString(4, item.itemDescription);
        pstmt.executeUpdate();
        System.out.println("Item Adding is success");
        con.close();
    }

    public static void removeItem(int itemId) throws SQLException {
        Connection con = DBConnection.connect();
        String sql = "DELETE FROM items WHERE item_id=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, itemId);
        pstmt.executeUpdate();
        System.out.println("Item Deleted");
        con.close();
    }

    public static void modifyItemName(int itemId, String itemName) throws SQLException {
        Connection con = DBConnection.connect();
        String sql = "UPDATE items SET item_name=? WHERE item_id=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, itemName);
        pstmt.setInt(2, itemId);
        pstmt.executeUpdate();
        System.out.println("Successful modification of item name");
        con.close();
    }

    public static void modifyDescription(int itemId, String itemDescription) throws SQLException {
        Connection con = DBConnection.connect();
        String sql = "UPDATE items SET item_description=? WHERE item_id=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, itemDescription);
        pstmt.setInt(2, itemId);
        pstmt.executeUpdate();
        System.out.println("Successful modification of item description");
        con.close();
    }
}
