package se.lexicon.model;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;
import java.util.Arrays;

public class OrderItems implements iOrderItems {
    private String orderId;
    private LocalDateTime orderDateTime;
    private FoodItem[] orderItems;

    public OrderItems(){
        this.orderId = UUID.randomUUID().toString();
        this.orderDateTime = LocalDateTime.now();
        this.orderItems = new FoodItem[0];
    }

    @Override
    public void addItem(FoodItem item) {
        Objects.requireNonNull(item, "Item is not valid");
        FoodItem[] newItems = new FoodItem[orderItems.length + 1]; // [null]
        System.arraycopy(orderItems, 0, newItems, 0, orderItems.length); // [null, null]
        newItems[newItems.length - 1] = item; // [null, item]
        orderItems = newItems;

//        if(orderItems.length >= MAX_ITEMS){
//            System.out.println("Order is full");
//        }

    }

    @Override
    public void removeItem(FoodItem item) {

    }

    @Override
    public FoodItem[] getItems() {
        return Arrays.copyOf(orderItems, orderItems.length);
    }



    public void displayInvoice(){
        System.out.println("Invoice\n");
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDateTime + "\n");
        for(FoodItem foodItem : orderItems){
            System.out.println(foodItem.getDescription());
        }
    }



    //methods to manipulate items

}
