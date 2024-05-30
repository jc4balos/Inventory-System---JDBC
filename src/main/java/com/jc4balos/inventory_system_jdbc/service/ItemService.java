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
        con.close();
    }
}
