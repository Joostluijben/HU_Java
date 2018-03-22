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
public abstract class Voertuig implements Goed{
	private String type;
	protected double nieuwPrijs;
	protected int bouwjaar;
	
	public Voertuig(String tp, double pr, int jr) {
		type = tp;
		nieuwPrijs = pr;
		bouwjaar = jr;
	}
	
	public boolean equals(Object obj) {
		boolean gelijkeObjecten = false;
		
		if (obj instanceof Voertuig) {
			Voertuig andereVoertuig = (Voertuig) obj;
			if (this.type.equals(andereVoertuig.type) &&
				this.nieuwPrijs == andereVoertuig.nieuwPrijs &&
				this.bouwjaar == andereVoertuig.bouwjaar) {
				gelijkeObjecten = true;
			}
		}
		
		return gelijkeObjecten;
	}
	
	public double huidigeWaarde(double percentage) {
		double jaarVerschil = LocalDate.now().getYear() - bouwjaar;
		return Math.round((nieuwPrijs * Math.pow(percentage, jaarVerschil)) * 100d) / 100d;
	}
	
	public String toString() {
		String s ="Voertuig: " + type + " met bouwjaar " + bouwjaar;
		s += " heeft een waarde van: €" + huidigeWaarde();
		return s;
	}
}
