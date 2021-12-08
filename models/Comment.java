package models;

public class Comment extends Subject{
    private String innerText;

    public String getText() {
        return innerText;
    }

    public void setText(String input) {
        this.innerText = input;
    }
}
