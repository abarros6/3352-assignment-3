package models;

public class Page extends Subject{
    private Content content;
    
    public Content getPageContent() {
        return content;
    }

    public void setPageContent(Content val) {
        this.content = val;
    }
}
