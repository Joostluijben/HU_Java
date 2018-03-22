/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week4.les7.practicum1
 */
package week4.les7.practicum1;

import java.time.LocalDate;

import week5.les9.practicum0.Utils;

/**
 * 
 */
public class Auto extends Voertuig{
	private String kenteken;
	
	public Auto(String tp, double pr, int jr, String kt) {
		super(tp, pr, jr);
		kenteken = kt;
	}
	public double huidigeWaarde() {
		return super.huidigeWaarde(0.7);
		//double jaarVerschil = LocalDate.now().getYear() - bouwjaar;
		//return Math.round((nieuwPrijs * Math.pow(0.7, jaarVerschil)) * 100d) / 100d;
	}
	
	public boolean equals(Object obj) {
		boolean resultaat = super.equals(obj);
		if (obj instanceof Auto) {
			Auto andereAuto = (Auto)obj;
			if (andereAuto.kenteken.equals(kenteken)) {
				resultaat = true;
			}
		}
		return resultaat;
	}
}
