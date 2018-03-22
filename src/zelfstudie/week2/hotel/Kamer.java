/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht zelfstudie.week2.hotel
 */
package zelfstudie.week2.hotel;

/**
 * 
 */
public class Kamer {
	private int kamerNummer;
	private KamerType kamerType;
	private boolean extraBed;
	
	public Kamer(int kM, KamerType kT, boolean eB) {
		kamerNummer = kM;
		kamerType = kT;
		extraBed = eB;
	}
	
	public KamerType getKamerType() {
		return kamerType;
	}
	
	public int getKamerNummer() {
		return kamerNummer;
	}
	
	public String toString() {
		String s = "Kamernummer: " + kamerNummer + ". Type: " + kamerType;
		s += ". Extra bed: " + extraBed;
		return s;
	}

}
