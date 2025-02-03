package se.lexicon;

import se.lexicon.model.Burger;
import se.lexicon.model.Fries;
import se.lexicon.model.Size;

public class Main {
    public static void main(String[] args) {
        var beefBurger = new Burger("Beef Burger", 12.99, "Beef", true, true);
        var chickenBurger = new Burger("Cheese Burger", 9.99, "Chicken", true, true);
        System.out.println(beefBurger.getDescription());
        System.out.println(chickenBurger.getDescription());
        System.out.println(beefBurger.toString());
        System.out.println();

        var smallFries = new Fries(Size.SMALL, true, false);
        var largeFries = new Fries(Size.LARGE);
        var mediumFries = new Fries();
        System.out.println(smallFries.getDescription());
        System.out.println(mediumFries.toString());
        System.out.println(largeFries.getDescription());
    }
}

