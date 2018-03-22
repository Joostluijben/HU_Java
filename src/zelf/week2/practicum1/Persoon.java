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
public class Persoon {
	private String naam;
	private int leeftijd;

	public Persoon(String nm, int lft) {
		naam = nm;
		leeftijd = lft;
	}

	public String toString() {
		String s = naam + "; " + "leeftijd " + leeftijd + " jaar";
		return s;
	}
}