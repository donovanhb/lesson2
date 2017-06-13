import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;

/**
 * Write a description of class gui1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gui1
{
   public static void main(String args[])
   {
       launchFX();    
   }
   private static void launchFX()
   {
       new JFXPanel();
       Platform.runLater(() -> initialiseGUI());
    }
    
   private static void initialiseGUI()
   {
       Stage stage = new Stage ();
       stage.setTitle("hello world");
       stage.setResizable(false);
       Pane rootPane = new Pane();
       stage.setScene(new Scene(rootPane));
       stage.setWidth(1024);
       stage.setHeight(768);
       stage.show();
       
       Button btn = new Button();
       btn.setText("click me");
       btn.setLayoutX(350);
       btn.setLayoutY(50);
       btn.setOnAction((ActionEvent ae) -> printHello());
       rootPane.getChildren().add(btn);
    }
    
   private static void printHello(){
       System.out.println("hello World");
   }
}
