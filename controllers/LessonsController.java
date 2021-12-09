package controllers;

public class LessonsController {
    models.Content model;
    views.ContentView view;

    public LessonsController(models.Content model, views.ContentView view){
        this.model = model;
        this.view = view;

        view.show();
    }

    public void updateModel(String newContent) {

        model.setContent(newContent);
        
        view.show();
    }
}
