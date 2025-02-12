package fr.epita.assistants.presentation.request;

public class ReverseRequest {
    private String content;

    public ReverseRequest() {
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
