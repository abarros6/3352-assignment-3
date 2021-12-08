package views;

public class ContentView extends models.Observer{

    private controllers.LessonsController controller;
    private models.EmbeddedContent embeddedModel;
    private models.Text textModel;
    private models.Link linkModel;

    public ContentView() {

    }

    public void show() {

    }

    public void update(){
        this.show();
    }
}
