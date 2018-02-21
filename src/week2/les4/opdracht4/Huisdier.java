/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package week2.les4.opdracht4;

public class Huisdier {
	private String naam;
	private String ras;
	private double gewicht;
	public Huisdier(String nm, String r) {
		naam = nm;
		ras = r;
		gewicht = 0.0;
	}
	
	public void setGewicht(double gw) {
		gewicht = gw;
	}
	
	public String getNaam() {
		return naam;
	}
	public String getRas() {
		return ras;
	}
	public String toString() {
		return getNaam() + " " + getRas() + ", weegt " + gewicht + " kg.";
	}
}
