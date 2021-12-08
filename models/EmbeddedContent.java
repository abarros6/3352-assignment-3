package models;

public class EmbeddedContent extends Content {

    private String embed;

    public String getTextValue() {
        return embed;
    }

    public void setTextValue(String val) {
        this.embed = val;
    }

}
