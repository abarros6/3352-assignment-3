package models;

import java.util.ArrayList;

public class Page {
    private Content content;
    ArrayList<Observer> observer = new ArrayList<>();

    public void attach(Observer o){
        this.observer.add(o);
    }

    public void detach(Observer o){
        this.observer.remove(o);
    }

    public Content getPageContent() {
        return content;
    }

    public void setPageContent(Content val) {
        this.content = val;
    }
}
