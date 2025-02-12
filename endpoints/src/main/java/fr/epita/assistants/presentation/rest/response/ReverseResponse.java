package fr.epita.assistants.presentation.rest.response;

public class ReverseResponse {
    private final String original;
    private final String reversed;

    public ReverseResponse(String original, String reversed) {
        this.original = original;
        this.reversed = reversed;
    }

    public String getOriginal() {
        return original;
    }

    public String getReversed() {
        return reversed;
    }
}
