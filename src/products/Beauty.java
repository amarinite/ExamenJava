package products;

public class Beauty extends Product {
    private boolean vegan;
    private BeautySeason beautySeason;

    public Beauty(String name, String brand, int price, int stock, int salePercentage, boolean vegan, BeautySeason beautySeason) {
        super(name, brand, price, stock, salePercentage);
        this.vegan = vegan;
        this.beautySeason = beautySeason;
    }

}
