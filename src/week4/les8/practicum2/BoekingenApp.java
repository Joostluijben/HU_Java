/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week4.les8.opdracht2
 */
package week4.les8.practicum2;

import javafx.stage.*;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.geometry.*;

/**
 * 
 */
public class BoekingenApp extends Application implements EventHandler<ActionEvent>{
	@Override
	public void start(Stage myPrimaryStage) {
		FlowPane flow = new FlowPane();
		
		flow.setPadding(new Insets(10));
		HBox hb1 = new HBox();
		
		Label gegevensLabel = new Label("Voer gegevens in!\n");
		hb1.getChildren().add(gegevensLabel);
		
		HBox hb2 = new HBox();
		Label naamLabel = new Label("naam:");
		TextField naamVeld = new TextField();
		naamLabel.setPrefWidth(150);
		hb2.getChildren().addAll(naamLabel, naamVeld);
		
		HBox hb3 = new HBox();
		Label adresLabel = new Label("adres");
		TextField adresVeld = new TextField();
		adresLabel.setPrefWidth(150);
		hb3.getChildren().addAll(adresLabel, adresVeld);
		
		HBox hb4 = new HBox();
		Label aankomstLabel = new Label("aankomstdatum");
		DatePicker aankomstDate = new DatePicker();
		aankomstDate.setPrefWidth(174);
		hb4.setSpacing(42);
		hb4.getChildren().addAll(aankomstLabel, aankomstDate);
		
		HBox hb5 = new HBox();
		Label vertrekLabel = new Label("vertrekdatum");
		DatePicker vertrekDate = new DatePicker();
		vertrekDate.setPrefWidth(174);
		hb5.setSpacing(59);
		hb5.getChildren().addAll(vertrekLabel, vertrekDate);
		
		HBox hb6 = new HBox();
		Label typeLabel = new Label("kamertype");
		ComboBox<String> cb1 = new ComboBox<String>();
		cb1.setPrefWidth(174);
		cb1.getItems().addAll("Standaard", "DeLuxe");
		hb6.setSpacing(80);
		hb6.getChildren().addAll(typeLabel, cb1);
		
		HBox hb7 = new HBox();
		Button resetB = new Button();
		Button boekB = new Button();
		resetB.setText("reset");
		boekB.setText("boek");
		hb7.getChildren().addAll(resetB, boekB);
		hb7.setSpacing(20);
		
		FlowPane.setMargin(hb7, new Insets(0, 0, 0, 200));
		flow.setVgap(10);
		flow.getChildren().addAll(hb1, hb2, hb3, hb4, hb5, hb6, hb7);
		
		Scene scene = new Scene(flow, 350, 250);
		myPrimaryStage.setTitle("Tweepersoonsboekingen");
		myPrimaryStage.setScene(scene);
		myPrimaryStage.show();
		
	}
	@Override
	public void handle(ActionEvent event) {
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
