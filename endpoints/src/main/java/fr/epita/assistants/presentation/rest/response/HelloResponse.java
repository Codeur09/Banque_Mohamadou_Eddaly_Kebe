package fr.epita.assistants.presentation.rest.response;

public class HelloResponse {
    private final String content;

    public HelloResponse(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
