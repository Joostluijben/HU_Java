/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les6.practium2
 */
package week3.les6.practicum2;

import java.time.LocalDate;
import java.lang.Math;

/**
 * 
 */
public class Game {
	private String naam;
	private int releaseJaar;
	private double nieuwPrijs;
	private double prijs;
	
	public Game(String nm, int rJ, double nwprs) {
		naam = nm;
		releaseJaar = rJ;
		nieuwPrijs = nwprs;
	}
	
	public String getNaam() {
		return naam;
	}
	
	

	public double huidigeWaarde() {
		double yearDifference = LocalDate.now().getYear() - releaseJaar;
		prijs = Math.round((nieuwPrijs * Math.pow(0.7, yearDifference)) * 100d) / 100d;
		return prijs;
	}
	
	public boolean equals(Object andereObject) {
		boolean gelijkeObjecten = false;
		if (andereObject instanceof Game) {
			Game andereGame = (Game) andereObject;
			
			if (this.naam.equals(andereGame.naam) &&
				this.releaseJaar== andereGame.releaseJaar && 
				this.nieuwPrijs == andereGame.nieuwPrijs) {
				gelijkeObjecten = true;
			}
		}
		return gelijkeObjecten;
	}
	
	public String toString() {
		return naam + " uitgegeven in " + releaseJaar + "; nieuwprijs: " +
				nieuwPrijs + " nu voor: €" + prijs;
	}
}
