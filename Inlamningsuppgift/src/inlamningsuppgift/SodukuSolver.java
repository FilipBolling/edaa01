package inlamningsuppgift;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class SodukuSolver extends Application{
	
	public static void main(String[] args){
		launch(args);
		Sudoku s = new Sudoku();
		//s.setSquare(1, 2, 2);
		//s.setSquare(9, 8, 8);
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
		
		TilePane root = new TilePane();
		root.setPrefColumns(9);
		root.setPrefRows(9);
		for (int i = 0; i < 9; i++) {
		      for (int k = 0; k < 9; k++) {
		          Label label = new Label();
		          label.setPrefSize(25, 25);
		          label.setStyle("-fx-background-color: #000000;");		          
		          root.getChildren().add(label);
		      }
		}
		stage.setResizable(false);
		stage.setResizable(false);
		stage.setScene(new Scene(root, 225, 250));
		stage.setTitle("Sudoku");
		stage.show();
		
	}
	
}


