/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week4.les8.opdracht1
 */
package week4.les8.opdracht2;

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
		
		Label label = new Label("Hoi");
		
		
		VBox root = new VBox();
		btn.setPrefWidth(200);
		label.setPrefWidth(200);
		root.getChildren().addAll(btn, label);
		
		
		
		Scene scene = new Scene(root, 300, 250);
		
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void handle(ActionEvent event) {
		System.out.println("Hello World!");
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
