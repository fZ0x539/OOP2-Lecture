package se.lexicon;

import se.lexicon.model.Burger;
import se.lexicon.model.Fries;
import se.lexicon.model.OrderItems;
import se.lexicon.model.Size;

public class Main {
    public static void main(String[] args) {
        var cheeseBurger = new Burger("Cheese Burger", 12.99, "Beef", true, true);
        var chickenBurger = new Burger("Cheese Burger", 9.99, "Chicken", true, true);

        var smallFries = new Fries(Size.SMALL, true, false);
        var largeFries = new Fries(Size.LARGE);
        var mediumFries = new Fries();


        var orderItems1 = new OrderItems();
        orderItems1.addItem(cheeseBurger);
        orderItems1.addItem(chickenBurger);
        orderItems1.addItem(smallFries);
        System.out.println(orderItems1.calculateTotalPrice());
        orderItems1.displayInvoice();
    }
}

