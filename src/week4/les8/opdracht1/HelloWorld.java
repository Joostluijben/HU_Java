/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week4.les8.opdracht1
 */
package week4.les8.opdracht1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.stage.*;

/**
 * 
 */
public class HelloWorld extends Application implements EventHandler<ActionEvent>{
	
	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button();
		btn.setText("Say 'Hello World'");
		btn.setOnAction(this);
		
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		
		Scene scene = new Scene(root, 300, 250);
		
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(scene);
		primaryStage.show();
		StackPane aa = new StackPane();
	}
	
	public void handle(ActionEvent event) {
		System.out.println("Hello World!");
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
