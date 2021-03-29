import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/*The main method in the controlling class of a Java application controls the flow of the program.
The main method can also access other classes along with the variables and methods of those classes
and of objects instantiated from those classes.*/

public class Main extends Application
{ //define the controlling class
  //define main method
  public static void main(String[] args)
  {
    launch();
    //start;

    //MyClassName NewClass = new MyClassName(); //instantiation of 'NewClass' object of type 'MyClassName'
    //new GUI(); //calling GUI class
    
    //calling methods
    //NewClass.Hello(); 
    
    
  }
  @Override
  public void start(Stage primaryStage)
  {
    primaryStage.setTitle("Hello World! But Gui :)");

    Button button = new Button(); //parameters take button name
    button.setText("Hello World!");

    StackPane layout = new StackPane();
    layout.getChildren().add(button);

    Scene scene = new Scene(layout, 300, 250);
    primaryStage.setScene(scene);
    primaryStage.show();
  
  }
}//End Hello1 class.  No semicolon at end of Java class.
