/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht zelfstudie.week2.hotel
 */
package zelfstudie.week2.hotel;

/**
 * 
 */
public class Klant {
	private String naam;
	private String adres;
	public Klant(String nm, String adr) {
		naam = nm;
		adres = adr;
	}
	
	public String toString() {
		String s = "Op naam van " + naam + ". Deze persoon woont op " + adres;
		return s;
	}
}
