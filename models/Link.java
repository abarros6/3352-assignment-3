package models;

public class Link extends Content { //link represents the embedded type of content with its url

    public Link(String content) { //constructor to initialize the link content type
        super(content);
    }

    public String getLink() { //getter for the link content of this model
        return content;
    }

    public void setLink(String val) { //setter for the link content of this model
        this.content = val;
    }

}
