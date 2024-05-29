package com.jc4balos.inventory_system_jdbc.mapper;

public class Item {

    public Integer itemId;
    public String itemName;
    public Integer itemQty;
    public String itemUnit;
    public String itemDescription;

    Item(Integer itemIdParam, String itemNameParam, Integer itemQtyParam, String itemUnitParam,
            String itemDescriptionParam) {
        this.itemId = itemIdParam;
        this.itemName = itemNameParam;
        this.itemQty = itemQtyParam;
        this.itemUnit = itemUnitParam;
        this.itemDescription = itemDescriptionParam;

    }

}