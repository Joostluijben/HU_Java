/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package week2.les3.opdracht2;

public class Huisdier {
	private String naam;
	private String ras;
	private double gewicht;
	public Huisdier(String nm, String r) {
		naam = nm;
		ras = r;
		gewicht = 0.0;
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
