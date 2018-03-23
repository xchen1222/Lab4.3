
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class LoginBase extends Application {
	
	@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        
        GridPane grid = new GridPane() ; 
        grid.setAlignment(Pos.CENTER) ;
        grid.setHgap(10) ; 
        grid.setVgap(10) ; 
        grid.setPadding(new Insets(25,25,25,25));
        
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL,20)) ; 
        grid.add(scenetitle,0,0,2,1); 
        
       /* Label userName = new Label("User Name:") ; 
        grid.add(userName,0,1) ; 
        
        TextField userTextField = new TextField() ;
        grid.add(userTextField,1,1) ; 
        
        Label pw = new Label("Password:") ; 
        grid.add(pw,0,2) ;
        
        PasswordField pwBox = new PasswordField(); 
        grid.add(pwBox,1,2) ;  */
        
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4); 
        
        Button btn2 = new Button("Sign in");
        HBox hbBtn2 = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn2);
        grid.add(hbBtn2, 0, 4);
        
        Button btn3 = new Button("Sign in");
        HBox hbBtn3 = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn3);
        grid.add(hbBtn3, 0, 3);
        
        Button btn4 = new Button("Sign in");
        HBox hbBtn4 = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn4);
        grid.add(hbBtn4, 0, 3);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
                System.out.println("button1 pressed");
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
       	 
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
                System.out.println("button2 pressed");
            }
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {
       	 
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
                System.out.println("button3 pressed");
            }
        });
        Scene S1 = new Scene (grid,500,500);
        primaryStage.setScene(S1);
        
        
        
        
        primaryStage.show();
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}