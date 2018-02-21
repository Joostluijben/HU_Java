/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package week2.les4.opdracht5;

import java.util.ArrayList;

public class Eigenaar {
	private String naam;
	private int giroNummer;
	private ArrayList<Huisdier> huisdieren = new ArrayList<Huisdier>();
	private Huisdier huisdier;
	
	public Eigenaar(String nm) {
		naam = nm;
	}
	
	public void setBeestje(Huisdier hd) {
		huisdier = hd;
		huisdieren.add(hd);
	}
	
	public Huisdier getBeestje() {
		return huisdier;
	}
	
	public ArrayList<Huisdier> getHuisdieren() {
		return huisdieren;
	}
	
	public String toString() {
		return naam + " heeft giro " + giroNummer + ". En is het baasje van " + huisdier;
	}
}
