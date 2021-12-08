package models;

public class Text extends Content {

    public Text(String content) {
        super(content);
    }

    public String getText() {
        return content;
    }

    public void setText(String val) {
        this.content = val;
    }

}
