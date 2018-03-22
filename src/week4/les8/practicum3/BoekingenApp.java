/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week4.les8.opdracht2
 */
package week4.les8.practicum3;

import javafx.stage.*;
import zelfstudie.week2.hotel.Hotel;
import zelfstudie.week2.hotel.KamerType;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.*;

/**
 * 
 */
public class BoekingenApp extends Application implements EventHandler<ActionEvent>{
	
	private Hotel hotel = new Hotel("Avondrust");
	private Label status;
	private TextField naam = null;
	private TextField adres = null;
	private DatePicker aankomstdatum = null;
	private DatePicker vertrekdatum = null;
	private ComboBox<KamerType> kamertype = null;
	
	@Override
	public void start(Stage myPrimaryStage) {
		FlowPane flow = new FlowPane();
		
		flow.setPadding(new Insets(10));
		HBox hb1 = new HBox();
		
		Label gegevensLabel = new Label("Voer gegevens in!\n");
		status = gegevensLabel;
		hb1.getChildren().add(gegevensLabel);
		
		HBox hb2 = new HBox();
		Label naamLabel = new Label("naam:");
		TextField naamVeld = new TextField();
		naam = naamVeld;
		naamLabel.setPrefWidth(150);
		hb2.getChildren().addAll(naamLabel, naamVeld);
		
		HBox hb3 = new HBox();
		Label adresLabel = new Label("adres");
		TextField adresVeld = new TextField();
		adres = adresVeld;
		adresLabel.setPrefWidth(150);
		hb3.getChildren().addAll(adresLabel, adresVeld);
		
		HBox hb4 = new HBox();
		Label aankomstLabel = new Label("aankomstdatum");
		DatePicker aankomstDate = new DatePicker();
		aankomstDate.setValue(LocalDate.now());
		aankomstdatum = aankomstDate;
		aankomstDate.setPrefWidth(174);
		hb4.setSpacing(42);
		hb4.getChildren().addAll(aankomstLabel, aankomstDate);
		
		HBox hb5 = new HBox();
		Label vertrekLabel = new Label("vertrekdatum");
		DatePicker vertrekDate = new DatePicker();
		vertrekDate.setValue(LocalDate.now().plusDays(1));
		vertrekdatum = vertrekDate;
		vertrekDate.setPrefWidth(174);
		hb5.setSpacing(59);
		hb5.getChildren().addAll(vertrekLabel, vertrekDate);
		
		HBox hb6 = new HBox();
		Label typeLabel = new Label("kamertype");
		ComboBox<KamerType> cb1 = new ComboBox<KamerType>();
		kamertype = cb1;
		cb1.setPrefWidth(174);
		cb1.getItems().addAll(FXCollections.observableArrayList(hotel.getKamerTypen()));
		kamertype = cb1;
		hb6.setSpacing(80);
		hb6.getChildren().addAll(typeLabel, cb1);
		
		HBox hb7 = new HBox();
		Button resetB = new Button();
		Button boekB = new Button();
		resetB.setText("reset");
		boekB.setText("boek");
		boekB.setOnAction(this);
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
		try {
			
		
			if (naam != null && adres != null && aankomstdatum != null &&
				vertrekdatum != null && kamertype != null) {
				hotel.voegBoekingToe(vertrekdatum.getValue(), aankomstdatum.getValue(), naam.getText(), adres.getText(), (KamerType) kamertype.getValue());
				status.setText("Boeking succesvol!");
				System.out.println(hotel.toString());
				naam.clear();
				adres.clear();
				aankomstdatum.setValue(null);
				vertrekdatum.setValue(null);
				kamertype.setValue(null);
			}
			else {
				status.setText("Boeking mislukt!");
			}
		} catch(Exception e) {
			status.setText("Boeking mislukt!");
		}
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
