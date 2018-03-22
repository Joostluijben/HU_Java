/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht zelfstudie.week2.hotel
 */
package zelfstudie.week2.hotel;
import java.time.LocalDate;
import java.util.Date;

/**
 * 
 */
public class Boeking {
	private LocalDate boekdatum;
	private LocalDate aankomstdatum;
	private LocalDate vertrekdatum;
	private Klant klant;
	private Kamer kamer;
	private KamerType kamerType; //nog welhalen
	
	public Boeking(LocalDate bd, LocalDate ad, LocalDate vd, Klant kl, KamerType kt, Kamer km) {
		boekdatum = bd;
		aankomstdatum = ad;
		vertrekdatum = vd;
		klant = kl;
		kamerType = kt;
		kamer = km;
	}
	
	public String toString() {
		String s = "Van " + vertrekdatum + " tot " + aankomstdatum;
		s += ". De datum van boeking is " + boekdatum + "\n met kamertype: " + kamerType;
		s += ". " + klant;
		return s;
	}
}
