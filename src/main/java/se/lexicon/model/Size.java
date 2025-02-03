package se.lexicon.model;

public enum Size {
    SMALL("Small Fries", 9.99),
    MEDIUM("Medium Fries", 11.99),
    LARGE("Large Fries", 12.99);

    private double price;
    private String title;

    Size(String title, double price) {
        this.title = title;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
