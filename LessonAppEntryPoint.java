import views.ContentView;
import models.Content;

public class LessonAppEntryPoint {
    public static void main(String[] main){
        
        models.Content m = new models.Content();
        views.ContentView v = new views.ContentView();

        controllers.LessonsController c = new controllers.LessonsController(m,v);
    }
}
