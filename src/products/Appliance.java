package products;

import java.util.Date;

public class Appliance extends Product {
    private int powerConsumption;
    private Date manufacturedAt;
    private int capacity;
    private static final int warranty = 9;

    public Appliance(String name, String brand, int price, int stock, int salePercentage, int powerConsumption,
                     int capacity) {
        super(name, brand, price, stock, salePercentage);
        this.powerConsumption = powerConsumption;
        this.manufacturedAt = new Date();
        this.capacity = capacity;
    }

    public static int getWarranty() {
        return warranty;
    }
}
