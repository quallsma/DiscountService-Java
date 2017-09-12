package com.pillartechnology.discountservice.service;

import com.pillartechnology.discountservice.domain.DiscountType;
import com.pillartechnology.discountservice.domain.ItemType;
import com.pillartechnology.discountservice.service.AllCartDiscount;
import com.pillartechnology.discountservice.service.Cart;
import com.pillartechnology.discountservice.service.Discount;
import com.pillartechnology.discountservice.service.Item;
import com.pillartechnology.discountservice.service.Items;
import com.pillartechnology.discountservice.service.SingleItemDiscount;
import org.junit.*;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class CartTest {

    /*private Cart cart;
    private Discount discount;
    private Items items;

    private Item electronicItem = new Item("Electric", ItemType.Electronic, 10.0d);
    private Item clothingItem = new Item("Clothes", ItemType.Clothing, 10.0d);
    private Item bookItem = new Item("Book", ItemType.Book, 10.0d);

    @Before
    public void setup(){
        items = new Items();

        items.add(electronicItem);
        items.add(clothingItem);
        items.add(bookItem);

        cart = new Cart(items);
    }

    @Test
    public void getPriceFromCartWhenItemsAreAdded(){
        assertEquals(30.0d, cart.getAmountBeforeDiscount(), 0);
    }

    @Test
    public void getPriceOfCartWhenCartIsDiscountedByADollarAmountForTheDay(){
        discount = new AllCartDiscount(DiscountType.Dollar, 20d, LocalDate.now());

        cart.applyDiscount(discount);
        assertEquals(10.0d, cart.getAmountAfterDiscount(), 0);
    }

    @Test
    public void getPriceFromCartWhenCartIsDiscountedTheDay(){
        discount = new AllCartDiscount(DiscountType.Percentage, .20d, LocalDate.now());

        cart.applyDiscount(discount);
        assertEquals(24.0d, cart.getAmountAfterDiscount(), 0);
    }

    @Test
    public void getPriceFromCartWhenCartIsDiscountedTotalAmountOfItemsInCart(){
        discount = new AllCartDiscount(DiscountType.Percentage, .20d, 2);

        cart.applyDiscount(discount);
        assertEquals(24.0d, cart.getAmountAfterDiscount(), 0);
    }

    @Test
    public void getPriceFromCartWhenCartIsDiscountedCertainAmountOfOneParticularItemInCart(){
        discount = new AllCartDiscount(DiscountType.Percentage, .20d, 1, bookItem);

        cart.applyDiscount(discount);
        assertEquals(24.0d, cart.getAmountAfterDiscount(), 0);
    }

    @Test
    public void getPriceFromCartWhenCartIsDiscountedCertainAmountOfOneParticularItemTypeInCart(){
        discount = new AllCartDiscount(DiscountType.Percentage, .20d, 1, ItemType.Book);

        cart.applyDiscount(discount);
        assertEquals(24.0d, cart.getAmountAfterDiscount(), 0);
    }

    @Test
    public void getPriceOfCartWhenSpecialDiscountIsAppliedForAnItem() {
        discount = new SingleItemDiscount(DiscountType.Percentage, .25d, bookItem);

        cart.applyDiscount(discount);
        assertEquals(27.5d, cart.getAmountAfterDiscount(), 0);
    }

    @Test
    public void getPriceOfCartWhenSpecialDollarDiscountIsAppliedForAnItem() {
        discount = new SingleItemDiscount(DiscountType.Dollar, 5d, bookItem);

        cart.applyDiscount(discount);
        assertEquals(25d, cart.getAmountAfterDiscount(), 0);
    }

    @Test
    public void getPriceOfCartWhenSpecialDiscountIsAppliedToSpecificTypeOfItem() {
        discount = new SingleItemDiscount(DiscountType.Percentage, .25d, ItemType.Book);

        cart.applyDiscount(discount);
        assertEquals(27.5d, cart.getAmountAfterDiscount(), 0);
    }

    @Test
    public void getPriceOfCartWhenSpecialDiscountIsAppliedToSpecificItemForTheDay() {
        discount = new SingleItemDiscount(DiscountType.Percentage, .25d, bookItem, LocalDate.now());

        cart.applyDiscount(discount);
        assertEquals(27.5d, cart.getAmountAfterDiscount(), 0);
    }

    @Test
    public void getPriceOfCartWhenSpecialDiscountIsAppliedToSpecificItemTypeForTheDay() {
        discount = new SingleItemDiscount(DiscountType.Percentage, .25d, ItemType.Book, LocalDate.now());

        cart.applyDiscount(discount);
        assertEquals(27.5d, cart.getAmountAfterDiscount(), 0);
    }*/
}