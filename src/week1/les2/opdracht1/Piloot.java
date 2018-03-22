/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week1.les2.opdracht1
 */
package week1.les2.opdracht1;

/**
 * 
 */
public class Piloot {
	private String naam;
	private int vlieguren;
	private double salaris;
	
	public Piloot(String nm) {
		naam = nm;
	}
	
	public void setSalaris(double sl) {
		salaris = sl;
	}
	
	public void verhoogVliegurenMet(int ur) {
		vlieguren += ur;
	}
	
	public int getVlieguren() {
		return vlieguren;
	}
	
	public double getSalaris() {
		return salaris;
	}
	
	public String toString() {
		return naam + " heeft " + vlieguren + " vlieguren gemaakt en verdient " + salaris;
	}
	
}
