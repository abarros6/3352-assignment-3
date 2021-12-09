package models;
import java.util.ArrayList;

public abstract class Subject { //abstract class to represent the subject of MVC architecture
    ArrayList<Observer> observers = new ArrayList<>(); //internal arraylist to hold the observers

    public void attach(Observer o){ //attach the new observer and add them to the internal arraylist record
        this.observers.add(o);
    }

    public void detach(Observer o){ //detach the given observer and remove them from the internal arraylist record
        this.observers.remove(o);
    }

    public void notifyObservers() { //iterate through the current observers update the views corresponding to changes in the models
        for (Observer o : observers){
            o.update();
        }
    }
}
