package management;

import exceptions.ProductDoesntExistException;
import exceptions.ProductDoesntHaveWarrantyException;
import menu.Input;
import products.*;

import java.util.*;

public class ProductManager {

    private static Beauty shampoo = new Beauty("Magic Hair", "Garnier", 12, 40, 13, true, BeautySeason.spring);
    private static Beauty makeup = new Beauty("Magic Make-Up", "Garnier", 10, 0, 34, false, BeautySeason.winter);
    private static Clothes shoe = new Clothes("Vans 1233", "Vans", 30, 23, 15,
            "42", "Leather", "Shoe");
    private static Clothes sweater = new Clothes("Fancy sweater", "Zara", 50, 13,
            24, "M", "Cotton", "Sweater");
    private static ElecComponent camera = new ElecComponent("Camera", "Sony", 200, 20, 23,
            "1920x1080", ElecComponentBattery.BATTERY_3000);
    private static Appliance fridge = new Appliance("Fancy fridge", "Bosch", 800, 15, 21,
            200, 20);

    ArrayList<Product> products = new ArrayList<>();

    public static void createProduct() {
        int option = 0;
        String name;
        String brand;
        double price;
        int stock;
        int salePercentage;
        boolean vegan;
        BeautySeason beautySeason;

        System.out.println("What kind of product do you wish to add?\n" +
                "1. Clothes.\n" +
                "2. Beauty.\n" +
                "3. Appliance.\n" +
                "4. Electric Component");
        option = Input.readInt("Select an option:");

        if (option > 5 | option < 1) {
            System.out.println("Please choose a valid option.");
            createProduct();
        }

        name = Input.readString("Enter a name: ");
        brand = Input.readString("Enter a brand: ");
        price = Input.readInt("Enter a price: ");
        stock = Input.readInt("Enter a stock for the product: ");
        salePercentage = Input.readInt("Enter a sale percentage: ");

        switch (option) {
            case 1:
                break;
            case 2:
                vegan = Input.readYesNo("Is it vegan? Answer 'y' or 'n': ");
                // beautySeason = Input.readString("Enter a season (Summer, Autumn, Winter or Spring: )");
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

    public static void removeProduct(Product product, ArrayList<Product> products)  throws ProductDoesntExistException {
        if(products.contains(product)) {
            products.remove(product);
        } else {
            throw new ProductDoesntExistException("This product doesn't exist.");
        }
    }

    public static String listProducts(ArrayList<Product> products) {
        if (products.isEmpty()) {
            return "No products to show.";
        }
        String productsList = "";
        for(Product p : products) {
            productsList += p.getId() + ". " + p.getName();
        }

        return productsList;
    }

    public ArrayList<Product> sortProductsCheapestFirst(ArrayList<Product> products) {
        products.sort(new ProductsComparator());
        return products;

    }


    public static class ProductsComparator implements Comparator<Product> {
        @Override
        public int compare(Product r1, Product r2) {
            return r1.getPrice() - r2.getPrice();
        }
    }


    public static ArrayList<Product> getSaleProducts(Product[] products) {
        // sé que es un xurro però no he tingut temps d'elaborar la idea :(
            return (ArrayList<Product>) Arrays.stream(products)
                    .filter(product -> product.getIsAtSale() == true);

    }

    public static String warrantyExpiresAt(Product product) throws ProductDoesntHaveWarrantyException {
        if(product instanceof Appliance | product instanceof ElecComponent) {
            int monthsLeft = 0;
            // falta la part de calcular els mesos ambs els dates
            return "The warranty expires in " + monthsLeft + " months.";
        } else {
            throw new ProductDoesntHaveWarrantyException("This product doesn't have a warranty");
        }
    }

    public static void applyDiscount(Product product) {
        product.setPrice(product.getPrice() * (product.getSalePercentage() / 100));
        product.setProductAsInSale();
    }
}
