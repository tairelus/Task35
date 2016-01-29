package bjs.task35;

/**
 * Created by U-1 on 29.01.2016.
 */
public enum Apples {
    JONATHAN(10), GOLDEN(9), WINESAP(15), CORTLAND(8);

    /**Price of the each type of apples in cents per kilogram*/
    private int price;

    /**
     * Private constructor
     * @param price Price in cents per kilogram
     */
    private Apples(int price) {
        this.price = price;
    };

    /**
     * Returns price of current type of apples
     * @return
     */
    public int getPrice() {
        return this.price;
    }
}
