/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package week2.les3.practicum1;

public class Huis {
	private String adres;
	private int bouwjaar;
	private Persoon huisbaas;
	
	public Huis(String adr, int bwjr) {
		adres = adr;
		bouwjaar = bwjr;
	}
	
	public void setHuisbaas(Persoon hb) {
		huisbaas = hb;
	}
	
	public Persoon getHuisbaas() {
		return huisbaas;
	}
	
	public String toString() {
		return "Huis " + adres + " is gebouwd in " + bouwjaar + " en heeft huisbaas " 
				+ huisbaas;
	}
}
