/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package week2.les3.opdracht1;

public class Eigenaar {
	private String naam;
	private int giroNummer;
	
	public Eigenaar(String nm) {
		naam = nm;
	}
	
	public void setGiroNr(int nr) { 
		giroNummer = nr; 
	}
	
	public int getGiroNr() { 
		return giroNummer; 
	}
	
	public String getNaam() { 
		return naam; 
	}
	
	public String toString() {
		return naam + " heeft giro " + giroNummer;
	}
}
