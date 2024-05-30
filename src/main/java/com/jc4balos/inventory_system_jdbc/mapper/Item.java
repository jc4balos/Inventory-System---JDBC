package com.jc4balos.inventory_system_jdbc.mapper;

public class Item {

    public Integer itemId;
    public String itemName;
    public Integer itemQty;
    public Integer unitId;
    public String itemDescription;

    public Item(Integer itemIdParam, String itemNameParam, Integer itemQtyParam, Integer unitIdParam,
            String itemDescriptionParam) {
        this.itemId = itemIdParam;
        this.itemName = itemNameParam;
        this.itemQty = itemQtyParam;
        this.unitId = unitIdParam;
        this.itemDescription = itemDescriptionParam;

    }

}