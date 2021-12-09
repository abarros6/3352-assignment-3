package views;

public class CommentView extends models.Observer {

    private controllers.LessonsController controller;
    private models.Comment model;


    public CommentView(models.Comment model, controllers.LessonsController controller) {
        this.setModel(model);

        this.setController(controller);
    }

    public void update(){
        this.show();
    }

    public void onCommentUpdate(){
        String newCommentInfo = "";
        this.controller.updateModel(newCommentInfo);
    }

    public void show() {

    }

    public models.Comment getModel(){
        return this.model;
    }

    public void setModel(models.Comment model) {
        if (this.model != null){
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
