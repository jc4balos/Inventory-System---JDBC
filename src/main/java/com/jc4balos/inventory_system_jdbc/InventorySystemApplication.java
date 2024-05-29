package com.jc4balos.inventory_system_jdbc;

import com.jc4balos.inventory_system_jdbc.service.UserService;

public class InventorySystemApplication {
    public static void main(String[] args) {
        UserService.updateUserName("null11223", 2);
    }
}