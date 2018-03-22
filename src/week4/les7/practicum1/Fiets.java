/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week4.les7.practicum1
 */
package week4.les7.practicum1;

import java.time.LocalDate;

/**
 * 
 */
public class Fiets extends Voertuig{
	private int framenummer;
	
	public Fiets(String tp, double pr, int jr, int fnr) {
		super(tp, pr, jr);
		framenummer = fnr;
	}
	
	public double huidigeWaarde() {
		return super.huidigeWaarde(0.9);
		//double jaarVerschil = LocalDate.now().getYear() - bouwjaar;
		//return Math.round((nieuwPrijs * Math.pow(0.9, jaarVerschil)) * 100d) / 100d;
	}
	
	public boolean equals(Object obj) {
		boolean resultaat = super.equals(obj);
		if (obj instanceof Fiets) {
			Fiets andereFiets = (Fiets)obj;
			if (andereFiets.framenummer == framenummer) {
				resultaat = true;
			}
		}
		return super.equals(obj);
	}
}
