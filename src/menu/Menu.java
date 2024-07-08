package menu;

import static management.ProductManager.createProduct;
import static management.ProductManager.removeProduct;

public class Menu {
    public void displayMenu() {
        int option = 0;

        do {
            System.out.println("Welcome to El Corte Irlandes: ");
            System.out.println("1. Create a product");
            System.out.println("2. Delete a product.");
            System.out.println("3. Show all products (cheapest first).");
            System.out.println("4. Check warranty from a product.");
            System.out.println("5. Apply discount to product.");
            System.out.println("6. List all products in sale.");
            System.out.println("7. Check stock from a product.");
            System.out.println("8. Add stock to a product.");
            System.out.println("9. Remove stock from a product.");
            System.out.println("0. Exit.");

            option = Input.readInt("Please select an option: ");

            switch (option) {
                case 1:
                    createProduct();
                    break;
                case 2:
                    // removeProduct();
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please enter a valid option.");
                    break;
            }

        } while (option != 0);
    }
}
