package com.pillartechnology.discountservice.service;

import com.pillartechnology.discountservice.domain.DiscountType;
import com.pillartechnology.discountservice.domain.ItemType;

import java.time.LocalDate;
import java.util.Collections;

public class SingleItemDiscount implements Discount {

    private DiscountType discountType;
    private Double discountAmount;
    private LocalDate discountDate;
    private Item item;
    private ItemType itemType;
    private final Integer MINIMUM_ITEM_LIMIT = 1;

    public SingleItemDiscount(DiscountType discountType, Double discountAmount, Item item) {
        this.discountType = discountType;
        this.discountAmount = discountAmount;
        this.item = item;
    }

    public SingleItemDiscount(DiscountType discountType, Double discountAmount, ItemType itemType) {
        this.discountType = discountType;
        this.discountAmount = discountAmount;
        this.itemType = itemType;
    }

    public SingleItemDiscount(DiscountType discountType, Double discountAmount, Item item, LocalDate discountDate) {
        this.discountType = discountType;
        this.discountAmount = discountAmount;
        this.discountDate = discountDate;
        this.item = item;
    }

    public SingleItemDiscount(DiscountType discountType, Double discountAmount, ItemType itemType, LocalDate discountDate) {
        this.discountType = discountType;
        this.discountAmount = discountAmount;
        this.discountDate = discountDate;
        this.itemType = itemType;
    }

    @Override
    public DiscountType getDiscountType() {
        return this.discountType;
    }

    @Override
    public Double getDiscountAmount() {
        return this.discountAmount;
    }

    @Override
    public Item getItem() {
        return item;
    }

    @Override
    public ItemType getItemType() {
        return itemType;
    }

    public boolean validate(Items items) {
        return (isAmountOfSpecificItemsInCartDiscount(items) || isAmountOfSpecificItemTypeInCartDiscount(items)) &&
                doesDateApply();
    }

    @Override
    public LocalDate getDiscountDate() {
        return null;
    }

    @Override
    public Integer getDiscountItemLimit() {
        return null;
    }

    private boolean isAmountOfSpecificItemsInCartDiscount(Items items) {
        return this.item != null && Collections.frequency(items, this.item) >= MINIMUM_ITEM_LIMIT;
    }

    private boolean isAmountOfSpecificItemTypeInCartDiscount(Items items) {
        return this.itemType != null && items.stream().filter(item -> this.itemType.equals(item.getItemType())).count
                () >= MINIMUM_ITEM_LIMIT;
    }

    private boolean doesDateApply(){
        return  this.discountDate == null || this.discountDate.equals(LocalDate.now());
    }
}
