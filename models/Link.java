package models;

public class Link extends Content {

    public Link(String content) {
        super(content);
    }

    public String getLink() {
        return content;
    }

    public void setLink(String val) {
        this.content = val;
    }

}
