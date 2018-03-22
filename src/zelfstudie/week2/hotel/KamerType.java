/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht zelfstudie.week2.hotel
 */
package zelfstudie.week2.hotel;

import java.util.ArrayList;

/**
 * 
 */
public class KamerType {
	private String kamerType;
	private int aantalBed;
	private double price;
	
	public KamerType(String kT, int aB, double pr) {
		kamerType = kT;
		aantalBed = aB;
		price = pr;
	}
	
	public boolean equals(Object andereObject) {
		boolean gelijkeObjecten = false;
		
		if (andereObject instanceof KamerType) {
			KamerType andereKamer = (KamerType) andereObject;
			
			if (this.kamerType.equals(andereKamer.kamerType)) {
				gelijkeObjecten = true;
			}
		}
		return gelijkeObjecten;
	}
	
	public String toString() {
		return kamerType;
	}
}
