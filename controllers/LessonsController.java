package controllers;

public class LessonsController { //represents the controller for the Lessons application
    models.Content model;
    views.ContentView view;

    public LessonsController(models.Content model, views.ContentView view){ //constructor to initialize the controller with the associated model and view
        this.model = model;
        this.view = view;

        view.show(); //used to refresh or show the view
    }

    public void updateModel(String newContent) { //update the model when the user provides an input or change

        model.setContent(newContent); //set the inner element of the model for based on the user's input
        
        view.show(); //refresh or update the view based on the model changes.
    }
}
