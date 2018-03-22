package zelfstudie.week2.hotel;
import java.time.LocalDate;
/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht zelfstudie.week2.hotel
 */
public class Main {
	public static void main(String[] args) {
		
		
		
		Hotel h = new Hotel("Avondrood");
		LocalDate van = LocalDate.of(2015, 6, 18);
		LocalDate tot = LocalDate.of(2015, 6, 23);
		KamerType kt = h.getKamerTypen().get(0); // eerste type in lijst
		int nr = h.voegBoekingToe(van, tot, "Jaap de Vries", "Plein 9", kt);
		System.out.println("Tweede Boeking"); 
	    kt = h.getKamerTypen().get(1); // tweede type in lijst
	    nr = h.voegBoekingToe(van, tot, "Kees Meijer", "Dalton 200, Utrecht", kt);
		if (nr != -1) {
			System.out.println("Boeking krijgt kamernummer: " + nr);
		} else {
			System.out.println("Er is helaas geen kamer beschikbaar");
		}
		System.out.println(h.toString());
	}
}