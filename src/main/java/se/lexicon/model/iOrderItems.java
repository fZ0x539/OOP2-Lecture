package se.lexicon.model;

public interface iOrderItems {

    int MAX_ITEMS = 10;

    void addItem(FoodItem item);

    void removeItem(FoodItem item);

    FoodItem[] getItems();

    default double calculateTotalPrice(){
        double total = 0;
        for (FoodItem item : getItems()) {
            total += item.getPrice();
        }
        return total;
    }

}
