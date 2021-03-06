package com.pillartechnology.discountservice.service;

import com.pillartechnology.discountservice.domain.ItemType;
import com.pillartechnology.discountservice.util.CalculateDiscountHelper;

public class Item {
    private final String name;
    private final ItemType itemType;
    private final Double itemPriceBeforeDiscount;
    private Double itemPriceAfterDiscount = Double.MIN_VALUE;

    public Item(String name, ItemType itemType, Double itemPrice) {
        this.name = name;
        this.itemType = itemType;
        this.itemPriceBeforeDiscount = itemPrice;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public Double getItemPriceBeforeDiscount() {
        return itemPriceBeforeDiscount;
    }

    public Double getItemPriceAfterDiscount() {
        return itemPriceAfterDiscount;
    }

    public Double getItemPrice() {
        return this.itemPriceAfterDiscount > Double.MIN_VALUE ? this.itemPriceAfterDiscount : this.itemPriceBeforeDiscount;
    }

    public void applyDiscountToItem(Discount discount){
        this.itemPriceAfterDiscount = CalculateDiscountHelper.calculateDiscount(discount.getDiscountType(), this
                .itemPriceBeforeDiscount, discount.getDiscountAmount());
    }

    public boolean validateDiscount(Discount discount) {
        return isItemValid(discount.getItem()) || isItemTypeValid(discount.getItemType());
    }

    private boolean isItemValid(Item discountItem){
        return discountItem != null && this.equals(discountItem);
    }

    private boolean isItemTypeValid(ItemType discountItemType){
        return discountItemType != null && this.itemType.equals(discountItemType);
    }
}
