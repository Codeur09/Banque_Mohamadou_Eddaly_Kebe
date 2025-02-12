package fr.epita.assistants.presentation.response;

public class HelloResponse {
    private String content;

    public HelloResponse() {
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
