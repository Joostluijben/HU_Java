/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht zelfstudie.week2.hotel
 */
package zelfstudie.week2.hotel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 * 
 */
public class Hotel {
	private String naam;
	private ArrayList<Boeking> alleBoekingen = new ArrayList<Boeking>();
	private ArrayList<Kamer> alleKamers = new ArrayList<Kamer>();
	private ArrayList<KamerType> alleKamerTypen = new ArrayList<KamerType>();
	
	public Hotel(String nm) {
		alleKamers.add(new Kamer(1, new KamerType("Standaard", 2, 100.0), false));
		alleKamers.add(new Kamer(2, new KamerType("DeLuxe", 2, 100.0), false));
		alleKamerTypen.add(new KamerType("Standaard", 2, 100.0));
		alleKamerTypen.add(new KamerType("DeLuxe", 1, 50.0));
		naam = nm;
	}
	
	public ArrayList<KamerType> getKamerTypen() {
		return alleKamerTypen;
	}
	
	public int voegBoekingToe(LocalDate van, LocalDate tot, String nm, String adr, KamerType kt) {
		Kamer k = zoekKamer(zoekVrijeKamer(kt));
		alleBoekingen.add(new Boeking(LocalDate.now(), tot, van, new Klant(nm, adr), kt, k));
		return k.getKamerNummer();
	}
	
	private Kamer zoekKamer(int kamernummer) {
		Kamer k = null;
		
		for (Kamer kamr : alleKamers) {
			if(kamr.getKamerNummer() == kamernummer) {
				k = kamr;
			}
		}
		return k;
	}
	
	private int zoekVrijeKamer(KamerType kt) {
		int kamerNummer = -1;
		for (Kamer kamerZoek : alleKamers) {
			if (kamerZoek.getKamerType().equals(kt)) {
				kamerNummer = kamerZoek.getKamerNummer();
			}
		}
		return kamerNummer;
	}
	
	public String toString() {
		String s = null;
		if (alleBoekingen != null && alleKamers != null && alleKamerTypen != null) {
			s = "";
			for (Boeking boeking : alleBoekingen) {
				s += "Boeking: " + boeking + "\n";
			}
			s += "Aantal kamers: " + alleKamers.size() + " \n";
			s += "Aantal kamertypen: " + alleKamerTypen.size() + "\n";
		}
		return s;
	}
}
