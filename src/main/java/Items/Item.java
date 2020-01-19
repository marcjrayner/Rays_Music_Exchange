package Items;

public abstract class Item {

    private double boughtPrice;
    private double sellPrice;
    private String name;

    public Item(double boughtPrice, double sellPrice, String name) {
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
        this.name = name;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getName() {
        return name;
    }

}
