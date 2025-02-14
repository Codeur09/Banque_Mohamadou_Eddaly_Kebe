package fr.epita.assistants.inventory.errors;

public class InventoryError extends RuntimeException {
    public InventoryError(String message) {
        super(message);
    }
}