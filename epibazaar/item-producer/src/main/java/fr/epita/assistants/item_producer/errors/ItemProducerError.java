package fr.epita.assistants.item_producer.errors;

public class ItemProducerError extends RuntimeException {
    public ItemProducerError(String message) {
        super(message);
    }
}