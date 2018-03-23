

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
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
        Button btn2 = new Button();
        btn2.setText("CLICK2");
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	int x = 0 ; 
            @Override
            public void handle(ActionEvent event) {
                x++;
            	System.out.println("Hello World!" + " Pressed " + x + " times");
            }
           
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
        	int x = 0 ; 
            @Override
            public void handle(ActionEvent event) {
                x++;
            	System.out.println("Hello World!" + " Pressed " + x + " times");
            }
           
        });
        GridPane grid = new GridPane() ; 
        
        Button btn3 = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 2);
        
        StackPane root = new StackPane(); //this example, the root node is a StackPane object, which is a resizable layout node.
        root.getChildren().add(btn); //child node, a button control with text, plus an event handler to print a message when the button is pressed.
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        primaryStage.setScene(new Scene(root, 200, 200)); //The JavaFX Scene class is the container for all content.
        primaryStage.show();
    }
    
    
    
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}