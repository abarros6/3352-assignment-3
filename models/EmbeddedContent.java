package models;

public class EmbeddedContent extends Content {

    public EmbeddedContent(String content) { //link represents the embedded content 
        super(content);
    }

    public String getEmbeddedContent() { //getter for the embedded content of this model
        return content;
    }

    public void setEmbeddedContent(String val) { //getter for the embedded content of this model
        this.content = val;
    }

}
