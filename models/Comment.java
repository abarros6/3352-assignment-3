package models;

public class Comment extends Subject{ //represents the comment to be added for the lessons tool
    private String innerText; //represents the inner text of the comment

    public String getText() { //setter for the text content of this model
        return innerText;
    }

    public void setText(String input) { //setter for the text content of this model
        this.innerText = input;
    }
}
