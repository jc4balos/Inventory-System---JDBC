package com.jc4balos.inventory_system_jdbc;

import com.jc4balos.inventory_system_jdbc.service.ItemService;

public class InventorySystemApplication {
    public static void main(String[] args) {
        try {

            ItemService.addQty(2, 10);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}