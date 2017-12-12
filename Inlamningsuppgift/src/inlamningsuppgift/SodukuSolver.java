// TODO: toggle SetSquare för GUI, add Solve button, (add randomize?)

package inlamningsuppgift;

import java.util.Iterator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SodukuSolver extends Application{
	 Sudoku s = new Sudoku();
	public static void main(String[] args){
		launch(args);
		Sudoku s = new Sudoku();
//		s.setSquare(1, 2, 2);
//		s.setSquare(9, 8, 8);
		s.solve();
		for(int r = 0; r < 9; r++){
			for(int c = 0; c < 9; c++){
				System.out.print(s.getSquare(r, c) + "      ");
			}
			System.out.println("\n");
		}
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		TilePane tiles = new TilePane();
		tiles.setPrefColumns(9);
		tiles.setPrefRows(9);
		final int SIZE = 40;
		for (int i = 0; i < 9; i++) {
		      for (int k = 0; k < 9; k++) {
		          OneNumberTextField tf = new OneNumberTextField();
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
		          tiles.getChildren().add(tf);
		      }
		}
		
		BorderPane box = new BorderPane();
		Button solveB = new Button();
		solveB.setText("Solve");
		solveB.setOnAction((event) -> {
			Iterator i = tiles.getChildren().iterator();
			int j = 0;
			int k = 0;
			while(i.hasNext()){
				if(k % 9 == 0 && k!=0){
					j++;
					k=0;
				}
				OneNumberTextField f = (OneNumberTextField) i.next();
				if(!f.getText().equals("")){
				s.setSquare(Integer.parseInt(f.getText()), j, k);
				
				}
//			System.out.println(f.getText());
//			System.out.print(Integer.parseInt(f.getText()))
				k++;}
			if(s.solve(0,0)){
				Iterator i1 = tiles.getChildren().iterator();
				for(int j1=0;j1<9;j1++){
					for(int k1=0;k1<9;k1++){
						OneNumberTextField f1 = (OneNumberTextField) i1.next();
						f1.setText(String.valueOf(s.getSquare(j1,k1)));
					}
				}
				
			}
		});
		
		Button clearB = new Button();
		clearB.setText("Clear");
		clearB.setOnAction((event) ->{
			Iterator i = tiles.getChildren().iterator();
			while(i.hasNext()){
				OneNumberTextField f = (OneNumberTextField) i.next();
				f.clear();
			};
		});
		
		box.setLeft(solveB);
		box.setRight(clearB);
		VBox root = new VBox();
		root.getChildren().add(tiles);
		root.getChildren().add(box);
		stage.setResizable(false);
		stage.setScene(new Scene(root, 348, 380));
		stage.setTitle("Sudoku");
		stage.show();
		
	}
	
}


