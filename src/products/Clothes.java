package products;

public class Clothes extends Product {
    private String size;
    private String fabric;
    private String type;

    public Clothes(String name, String brand, int price, int stock, int salePercentage, String size, String fabric, String type) {
        super(name, brand, price, stock, salePercentage);
        this.size = size;
        this.fabric = fabric;
        this.type = type;
    }

}
