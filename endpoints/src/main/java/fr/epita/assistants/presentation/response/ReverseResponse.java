package fr.epita.assistants.presentation.rest.response;

public class ReverseResponse {

    private String original;
    private String reversed;

    public ReverseResponse() {
    }

    public ReverseResponse(String original, String reversed) {
        this.original = original;
        this.reversed = reversed;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getReversed() {
        return reversed;
    }

    public void setReversed(String reversed) {
        this.reversed = reversed;
    }
}

