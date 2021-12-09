package controllers;

public class LessonsController {
    models.Content model;
    views.ContentView view;

    public LessonsController(models.Content model, views.ContentView view){
        this.model = model;
        this.view = view;

        view.show();
    }

    public void updateModel(String courseNameNumber) {

        model.setContent(courseNameNumber);
        
        view.show();
    }
}
