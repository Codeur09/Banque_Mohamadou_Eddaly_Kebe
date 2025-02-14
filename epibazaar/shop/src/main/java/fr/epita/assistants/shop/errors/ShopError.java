package fr.epita.assistants.shop.errors;

public class ShopError extends RuntimeException {
    public ShopError(String message) {
        super(message);
    }
}