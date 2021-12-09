package models;

public class Reply extends Comment { //represents the reply type of comment to be added for the lessons tool
    private Comment parentComment; //parent of the comment reply chain
    private String innerText;

    public void setParent(Comment parent) { //setter for the parent of the comment chain
        this.parentComment = parent;
    }

    public Comment getParent() { //getter for the parent of the comment chain
        return this.parentComment;
    }

    public String getText() { //getter for the text content of this model
        return innerText;
    }

    public void setText(String input) { //setter for the text content of this model
        this.innerText = input;
    }
}
