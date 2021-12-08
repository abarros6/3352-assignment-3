package views;

public class CommentView extends models.Observer {
    private controllers.LessonsController controller;
    private models.Comment model;

    public void show() {

    }

    public models.Comment getModel(){
        return this.model;
    }

    public void setModel(models.Comment model) {
        this.model = model;
        this.model.attach(this);
    }


    public void update(){
        this.show();
    }
}
