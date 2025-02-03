package se.lexicon.model;

import java.util.Objects;

public abstract class FoodItem{
    private String name;
    private final double price;

    public FoodItem(String name, double price) {
        this.setName(name);
        this.price = price;
    }

    public void setName(String name){
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name is not valid");
        }
        Objects.requireNonNull(name, "Name is not valid");
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    protected String getDescription(){
        return "Item: " + name + ", Price: " + price;
    }

    public abstract double calculateTax();
}
