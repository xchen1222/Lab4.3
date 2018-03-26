

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 

public class FastClicker extends Application { //JavaFX application defines the user interface container by means of a stage and a scene. 
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) { //The JavaFX Stage class is the top-level JavaFX container.
        primaryStage.setTitle("CLICK FASTER!");
        Button btn = new Button();
        btn.setText("CLICK");
        Text txt = new Text(10,0, "AaaAAaaaaaAA");
        
        
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	int x = 0 ; 
            @Override
            public void handle(ActionEvent event) {
                x++;
            	System.out.println("Nigerian Prince!" + " Pressed " + x + " times");
            } 
        });
        
        timeStep = System.nanoTime() + 1000000000L ; 
        new AnimationTimer() {
        	
        }
       
    
        

        
        StackPane root = new StackPane(); //this example, the root node is a StackPane object, which is a resizable layout node.
        root.getChildren().add(btn); //child node, a button control with text, plus an event handler to print a message when the button is pressed.
        
        primaryStage.setScene(new Scene(root, 200, 200)); //The JavaFX Scene class is the container for all content.
        primaryStage.show();
    }
    
    
    
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}