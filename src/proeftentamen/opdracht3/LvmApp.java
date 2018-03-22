/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht proeftentamen.opdracht3
 */
package proeftentamen.opdracht3;

import java.io.*;
import java.util.List;

/**
 * 
 */
import javafx.*;
import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class LvmApp extends Application implements EventHandler<ActionEvent> {
 	private Button inladen = new Button("LVM inladen");
 	private Label meldingen = new Label("Kies een actie!");
	private ListView<Vliegtuig> lijst = new ListView<Vliegtuig>();
 	private TextField bestandsnaam = new TextField();
 	private LvmManager manager = new LvmManager();
 	
 	@Override
	public void start(Stage stage) { 
		FlowPane root = new FlowPane();
		HBox hb1 = new HBox();
		hb1.getChildren().add(meldingen);
		
		HBox hb2 = new HBox();
		VBox vb1 = new VBox();
		vb1.setSpacing(20);
		inladen.setOnAction(this);
		vb1.getChildren().addAll(bestandsnaam, inladen);
		hb2.getChildren().addAll(lijst, vb1);

		//HBox hb3 = new HBox();
		//hb3.getChildren().add(inladen);
		root.getChildren().addAll(hb1, hb2);
		
		Scene scene = new Scene(root);
		stage.setTitle("LVMApp 1.8");
		stage.setScene(scene);
		stage.show();
	}
 	
 	@Override
	public void handle(ActionEvent event) {
 		try {
	 		manager.IvmInladen(bestandsnaam.getText());
		} catch (NullPointerException npe) {
			meldingen.setText("Object bestaat niet");
		}
	 }

	public void refreshVliegtuigenLijst(List<Vliegtuig> vliegtuigen) {
		 lijst.getItems().clear();
		 lijst.getItems().addAll(vliegtuigen);
	 }
 
	public static void main(String[] args) { 
		Application.launch(args); 
	}

}
