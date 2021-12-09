package models;

public abstract class Content extends Subject {

    protected String content;

    public Content(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String input) {
        this.content = input;
    }

}