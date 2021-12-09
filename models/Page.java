package models;

public class Page extends Subject{ //represents page model for the lessons tool
    private Content content;
    
    public Content getPageContent() {  //getter for the page content of this model
        return content; 
    }

    public void setPageContent(Content val) {  //setter for the page content of this model
        this.content = val;
    }
}
