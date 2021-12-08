package models;

public class EmbeddedContent extends Content {

    public EmbeddedContent(String content) {
        super(content);
    }

    public String getEmbeddedContent() {
        return content;
    }

    public void setEmbeddedContent(String val) {
        this.content = val;
    }

}
