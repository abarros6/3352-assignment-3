package views;

public class ContentView extends models.Observer {

    private controllers.LessonsController controller;
    private models.Content model;

    public ContentView(models.Content model, controllers.LessonsController controller) {
        this.setModel(model);

        this.setController(controller);
    }

    public void update() {
        this.show();
    }

    public void onContentUpdate() {
        String newContentInfo = "";
        this.controller.updateModel(newContentInfo);
    }

    public void show() {

    }

    public models.Content getModel() {
        return this.model;
    }

    public void setModel(models.Content model) {
        if (this.model != null) {
            this.model.detach(this);
        }

        this.model = model;
        this.model.attach(this);
    }

    public controllers.LessonsController getController() {
        return this.controller;
    }

    public void setController(controllers.LessonsController controller) {
        this.controller = controller;
    }
}
