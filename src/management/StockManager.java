package management;

import products.Product;

public class StockManager {

    public static int checkProductStock(Product product) {
        return product.getStock();
    }

    public static void addStockToProduct(Product product, int stockToAdd) {
        product.setStock(product.getStock() + stockToAdd);
    }

    public static void removeStockFromProduct(Product product, int stockToRemove) {
        product.setStock(product.getStock() - stockToRemove);
    }
}
