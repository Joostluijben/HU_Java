/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht zelf.week2.practicum1
 */
package zelf.week2.practicum1;

/**
 * 
 */
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
		String s = adres + "is gebouwd in " + bouwjaar + "\nen heeft huisbaas " + huisbaas;
		return s;
	}
}