package se.lexicon.model;


public class Fries extends FoodItem{

    private boolean isSweetPotato = false;
    private boolean isSalty = false;
    private Size size; // SMALL, MEDIUM, LARGE

    public Fries(Size size, boolean isSalty, boolean isSweetPotato) {
        this(size);
        this.isSalty = isSalty;
        this.isSweetPotato = isSweetPotato;
    }

    public Fries(Size size){
        super(size.getTitle(), size.getPrice());
        this.size = size;
    }

    public Fries(){
        super(Size.MEDIUM.getTitle(), Size.MEDIUM.getPrice());
        this.size = Size.MEDIUM;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", Size: " + size.getTitle() + ", Salty: " + isSalty + ", Sweet Potato: " + isSweetPotato;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.2;
    }

    @Override
    public String toString() {
        return "Fries {" +
                "isSweetPotato=" + isSweetPotato +
                ", isSalty=" + isSalty +
                ", size=" + size +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", priceWithoutTax=" + (getPrice() - calculateTax()) +
                '}';
    }
}
