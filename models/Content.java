package models;

public abstract class Content extends Subject { //abstract class to represent content model for the application 

    protected String content; //internal content represented as a string

    public Content(){} //empty constructor

    public Content(String content) { //constructor to initialize the inherited content type
        this.content = content;
    }

    public String getContent() { //getter for the link content of this model
        return content;
    }

    public void setContent(String input) { //setter for the link content of this model
        this.content = input;
    }

}