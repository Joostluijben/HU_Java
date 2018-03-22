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
public class Computer implements Goed{
	private String type;
	private String MacAdres;
	private double aanschafPrijs;
	private int productieJaar;
	
	public Computer(String typ, String adr, double pr, int jr) {
		type = typ;
		MacAdres = adr;
		aanschafPrijs = pr;
		productieJaar = jr;
	}
	
	public double huidigeWaarde() {
		double jaarVerschil = LocalDate.now().getYear() - productieJaar;
		return Math.round((aanschafPrijs * Math.pow(0.6, jaarVerschil)) * 100d) / 100d;
	}
	
	public boolean equals(Object obj) {
		boolean gelijkeObjecten = false;
		if (obj instanceof Computer) {
			Computer andereComputer =  (Computer) obj;
			if (this.MacAdres.equals(andereComputer.MacAdres) &&
				this.type.equals(andereComputer.type) &&
				this.aanschafPrijs == andereComputer.aanschafPrijs && 
				this.productieJaar == andereComputer.productieJaar) {
				gelijkeObjecten = true;
			}
		}
		
		return gelijkeObjecten;
	}
	
	public String toString() {
		return "Computer: " + type + " heeft een waarde van: €" + huidigeWaarde();
	}
	
}
