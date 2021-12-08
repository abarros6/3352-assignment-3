package models;

public class Comment {
    private String innerText;

    public String getText() {
        return innerText;
    }

    public void setText(String input) {
        this.innerText = input;
    }
}
