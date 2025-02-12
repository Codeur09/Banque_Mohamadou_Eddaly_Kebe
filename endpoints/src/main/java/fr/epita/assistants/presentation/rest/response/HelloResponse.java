package fr.epita.assistants.presentation.rest.response;

public class HelloResponse {
    private String content;

    public HelloResponse() {
        // Constructeur par défaut
    }

    public HelloResponse(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
