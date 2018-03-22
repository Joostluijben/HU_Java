/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week5.les9.practicum0
 */
package week5.les9.practicum0;

/**
 * 
 */
public class Utils {
	private static int aantalEuroBedragen; 
	
	public static String euroBedrag(double bedrag) {
		return euroBedrag(bedrag, 10);
	}
	
	
	public static String euroBedrag(double bedrag, int precisie) {
		double precisieFormat = (double)precisie * 10;
		double roundedBedrag = Math.round(bedrag * precisieFormat) / precisieFormat;
		aantalEuroBedragen++;
		return "€ " + Double.toString(roundedBedrag);
	}
	
	public int getAantalEuroBedragen() {
		return aantalEuroBedragen;
	}
	
	public static void main(String[] args) {
		System.out.println(Utils.euroBedrag(3.11314));	
		System.out.println(Utils.euroBedrag(3.11314, 1));
		System.out.println(Utils.aantalEuroBedragen);
	}
}
