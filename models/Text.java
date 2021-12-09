package models;

public class Text extends Content { //represents the text type of content to be added for the lessons tool

    public Text(String content) { //constructor initializing the text content
        super(content);
    }

    public String getText() { //getter for the text content of this model
        return content;
    }

    public void setText(String val) { //setter for the text content of this model
        this.content = val;
    }

}
