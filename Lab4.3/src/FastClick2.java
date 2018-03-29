
	
import javafx.animation.AnimationTimer;
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


public class FastClick2 extends Application {
	 boolean scoring = true ;  
	 long timeStep = 0 ; 
	
	
	@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("2Fast2Click");
      
        
        
        
        
        GridPane grid = new GridPane() ; 
        grid.setAlignment(Pos.CENTER) ;
        grid.setHgap(10) ; 
        grid.setVgap(10) ; 
        grid.setPadding(new Insets(25,25,25,25));
        
        Text scenetitle = new Text("CLICK ME HARDER DADDY");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL,20)) ; 
        grid.add(scenetitle,0,0,2,1); 
      
        
        Button btn = new Button("ME");
        
        btn.setMinSize(250.0, 250.0);
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.CENTER);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4); 
        
        
        timeStep = System.currentTimeMillis()  ; 
        new AnimationTimer() {
        	public void handle(long now)
        	{
        		if (now > timeStep) 
        		{
        			timeStep = now ;
        			scoring = !scoring;
        		}
        		if (!scoring)
        		{
        			btn.setText("Scammer");
        		}
        		else {
        			btn.setText("STOP");
        		}
        		//txt.setText("Score:" + Integer.toString(score));
        	}
        }.start();
      
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	int score = 0;  
            @Override
            public void handle(ActionEvent e) {
            	
            	
            	if (scoring) {
            		score++;
            	}
            	else {
            		score+=0; 
            	}
            
                actiontarget.setFill(Color.BLACK) ;
                actiontarget.setText("Score: " + score + "\nTIMELEFT: " + timeStep) ;
                actiontarget.setFont(Font.font("Tahoma", FontWeight.NORMAL,20)); 
                System.out.println(score);
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