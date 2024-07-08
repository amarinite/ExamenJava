package products;

import java.util.Date;

public abstract class Product {
    private int id;
    private static int nextId = 0;
    private String name;
    private String brand;
    private int price;
    private int stock;
    private Date boughtAt;
    private int salePercentage;
    private boolean isAtSale;

    public Product(String name, String brand, int price, int stock, int salePercentage) {
        this.id = ++nextId;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.stock = stock;
        this.salePercentage = salePercentage;
        this.boughtAt = new Date();
        this.isAtSale = false;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return  this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSalePercentage() {
        return this.salePercentage;
    }

    public Date getBoughtAt() {
        return this.boughtAt;
    }

    public boolean getIsAtSale() {
        return this.isAtSale;
    }

    public void setProductAsInSale() {
        this.isAtSale = true;
    }
}
