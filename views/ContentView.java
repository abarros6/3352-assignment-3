package views;

public class ContentView extends models.Observer {

    private controllers.LessonsController controller; //local instances of the model and controller
    private models.Content model;

    public ContentView(models.Content model, controllers.LessonsController controller) { //constructor for the contentView
        this.setModel(model);

        this.setController(controller);
    }

    public ContentView()
    {}

    public void update() { //update used show modifications based on the models or any other request
        this.show();
    }

    public void onContentUpdate() { //every time content is updated from the user, the controller needs to update the model to push the changes
        String newContentInfo = "";
        this.controller.updateModel(newContentInfo);
    }

    public void show() {
        //display new content or refresh here
    }

    public models.Content getModel() { //used to return the model associated with this view
        return this.model;
    }

    public void setModel(models.Content model) { //set the model of this view with a new model
        if (this.model != null) { //comparison for any exisiting models to be detached in order to attack a new one
            this.model.detach(this);
        }

        this.model = model;
        this.model.attach(this);
    }

    public controllers.LessonsController getController() { //return the controller associated with this view
        return this.controller;
    }

    public void setController(controllers.LessonsController controller) { //set the controller for this view
        this.controller = controller;
    }
}
