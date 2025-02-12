package fr.epita.assistants.presentation.rest.request;

public class ReverseRequest {
    private String content;

    public ReverseRequest() {
        // Constructeur par défaut
    }

    public ReverseRequest(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
