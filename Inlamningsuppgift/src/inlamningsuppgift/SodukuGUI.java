package inlamningsuppgift;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class SodukuGUI extends Application{
public void start(Stage stage) throws Exception {
		
		TilePane root = new TilePane();
		root.setPrefColumns(9);
		root.setPrefRows(9);
		final int SIZE = 40;
		for (int i = 0; i < 9; i++) {
		      for (int k = 0; k < 9; k++) {
		          TextField tf = new TextField();
		          tf.setPrefSize(SIZE, SIZE);
		          tf.setStyle("-fx-background-color: #ffffff;"
		        		  + "-fx-border-color: #867979");
		          switch(i){
		          case 0: tf.setStyle("-fx-background-color: #ff9900;"
		        		  + "-fx-border-color: #867979");
		          switch(k){
	        	  case 3: tf.setStyle("-fx-background-color: #ffffff;"
	        		  + "-fx-border-color: #867979"); 
	        	  break;
	        	  case 4: tf.setStyle("-fx-background-color: #ffffff;"
		        		  + "-fx-border-color: #867979"); 
	        	  break; 
	        	  case 5: tf.setStyle("-fx-background-color: #ffffff;"
		        		  + "-fx-border-color: #867979"); 
		        	  break;
	          }
	          
		          break;
		          case 1: tf.setStyle("-fx-background-color: #ff9900;"
		        		  + "-fx-border-color: #867979");
		          switch(k){
	        	  case 3: tf.setStyle("-fx-background-color: #ffffff;"
	        		  + "-fx-border-color: #867979"); 
	        	  break;
	        	  case 4: tf.setStyle("-fx-background-color: #ffffff;"
		        		  + "-fx-border-color: #867979"); 
	        	  break; 
	        	  case 5: tf.setStyle("-fx-background-color: #ffffff;"
		        		  + "-fx-border-color: #867979"); 
		        	  break;
	          }
		          break;
		        
		          case 2: tf.setStyle("-fx-background-color: #ff9900;"
		        		  + "-fx-border-color: #867979");
		          switch(k){
	        	  case 3: tf.setStyle("-fx-background-color: #ffffff;"
	        		  + "-fx-border-color: #867979"); 
	        	  break;
	        	  case 4: tf.setStyle("-fx-background-color: #ffffff;"
		        		  + "-fx-border-color: #867979"); 
	        	  break; 
	        	  case 5: tf.setStyle("-fx-background-color: #ffffff;"
		        		  + "-fx-border-color: #867979"); 
		        	  break;
	          }
		          break;
		          case 6: tf.setStyle("-fx-background-color: #ff9900;"
		        		  + "-fx-border-color: #867979");
		          switch(k){
	        	  case 3: tf.setStyle("-fx-background-color: #ffffff;"
	        		  + "-fx-border-color: #867979"); 
	        	  break;
	        	  case 4: tf.setStyle("-fx-background-color: #ffffff;"
		        		  + "-fx-border-color: #867979"); 
	        	  break; 
	        	  case 5: tf.setStyle("-fx-background-color: #ffffff;"
		        		  + "-fx-border-color: #867979"); 
		        	  break;
	          }
		          break;
		          case 7: tf.setStyle("-fx-background-color: #ff9900;"
		        		  + "-fx-border-color: #867979");
		          switch(k){
	        	  case 3: tf.setStyle("-fx-background-color: #ffffff;"
	        		  + "-fx-border-color: #867979"); 
	        	  break;
	        	  case 4: tf.setStyle("-fx-background-color: #ffffff;"
		        		  + "-fx-border-color: #867979"); 
	        	  break; 
	        	  case 5: tf.setStyle("-fx-background-color: #ffffff;"
		        		  + "-fx-border-color: #867979"); 
		        	  break;
	          }
		          break;
		          case 8: tf.setStyle("-fx-background-color: #ff9900;"
		        		  + "-fx-border-color: #867979");
		          switch(k){
	        	  case 3: tf.setStyle("-fx-background-color: #ffffff;"
	        		  + "-fx-border-color: #867979"); 
	        	  break;
	        	  case 4: tf.setStyle("-fx-background-color: #ffffff;"
		        		  + "-fx-border-color: #867979"); 
	        	  break; 
	        	  case 5: tf.setStyle("-fx-background-color: #ffffff;"
		        		  + "-fx-border-color: #867979"); 
		        	  break;
	          }
		          break;	          
		          }
		          switch(k){
	        	  case 3: if(i == 3 || i == 4 || i == 5){tf.setStyle("-fx-background-color: #ff9900;"
	        		  + "-fx-border-color: #867979");} 
	        	  break;
	        	  case 4: if(i == 3 || i == 4 || i == 5){tf.setStyle("-fx-background-color: #ff9900;"
		        		  + "-fx-border-color: #867979");}
	        	  break; 
	        	  case 5: if(i == 3 || i == 4 || i == 5){tf.setStyle("-fx-background-color: #ff9900;"
		        		  + "-fx-border-color: #867979");}
	        	  break;
	          }
		          root.getChildren().add(tf);
		      }
		}
		stage.setResizable(false);
		stage.setScene(new Scene(root, 360, 360));
		stage.setTitle("Sudoku");
		stage.show();
		
	}
	
}


