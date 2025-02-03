package se.lexicon.model;

public class Burger extends FoodItem {
    //Fields
    private String meatType; //Enumeration
    private boolean hasCheese = false;
    private boolean hasLettuce = false;

    public Burger(String name, double price, String meatType, boolean hasCheese, boolean hasLettuce) {
        super(name, price);
        this.meatType = meatType;
        this.hasCheese = hasCheese;
        this.hasLettuce = hasLettuce;
    }

    public Burger(String name, double price, String meatType) {
        super(name, price);
        this.meatType = meatType;
    }

    /*
     * Overriding a Method from the Parent Class:
     *
     * -Method overriding allows a subclass to provide it's own implementation
     *  of a method that is already provided by the parent class.
     * -The method in the subclass should have
     * ✅ The same method name
     * ✅ The same return type
     * ✅ The same parameter list
     * ✅ A different implementation (logic)
     * */


    @Override
    public String getDescription() {
        return super.getDescription() + ", Meat Type: " + meatType + ", Cheese: " + hasCheese + ", Lettuce: " + hasLettuce;
    }

    //Override toString Method's of Object class
    @Override
    public String toString() {
        return "Burger{" +
                "meatType='" + meatType + '\'' +
                ", hasCheese=" + hasCheese +
                ", hasLettuce=" + hasLettuce +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }

}
