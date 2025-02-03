package se.lexicon;

import se.lexicon.model.Burger;

public class Main {
    public static void main(String[] args) {
        var beefBurger = new Burger("Beef Burger", 12.99, "Beef", true, true);
        var chickenBurger = new Burger("Cheese Burger", 9.99, "Chicken", true, true);
        System.out.println(beefBurger.getDescription());
        System.out.println(chickenBurger.getDescription());
        System.out.println(beefBurger.toString());
    }
}

