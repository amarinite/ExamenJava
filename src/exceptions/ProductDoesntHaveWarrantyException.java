package exceptions;

public class ProductDoesntHaveWarrantyException extends Exception {
    public ProductDoesntHaveWarrantyException(String message) {
        super(message);
    }
}
