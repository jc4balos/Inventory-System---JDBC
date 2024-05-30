package com.jc4balos.inventory_system_jdbc;

import com.jc4balos.inventory_system_jdbc.mapper.Item;
import com.jc4balos.inventory_system_jdbc.service.ItemService;

public class InventorySystemApplication {
    public static void main(String[] args) {
        try {

            Item item = new Item(null, "ballpern", 3, 2, "lagi lagi nalang");
            ItemService.additem(item);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}