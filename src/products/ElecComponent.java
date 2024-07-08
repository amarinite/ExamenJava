package products;

public class ElecComponent extends Product {

    private String imageResolution;
    private ElecComponentBattery elecComponentBattery;
    private static final int warranty = 18;

    public ElecComponent(String name, String brand, int price, int stock, int salePercentage,
                         String imageResolution, ElecComponentBattery elecComponentBattery) {
        super(name, brand, price, stock, salePercentage);
        this.imageResolution = imageResolution;
        this.elecComponentBattery = elecComponentBattery;
    }

    public static int getWarranty() {
        return warranty;
    }
}
