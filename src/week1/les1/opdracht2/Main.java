/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package week1.les1.opdracht2;

public class Main {

	public static void main(String[] args) {
		String naam1 = "Jan";
		String adres1 = "Nijenoord 1";
		String plaats1 = "Utrecht";
		String naam2 = "Wim";
		String adres2 = "Oudenoord 34";
		String plaats2 = "Utrecht";
	    String newLine = System.getProperty("line.separator");
		System.out.println("De gegevens van nr 1 zijn: ");
		System.out.println(naam1 + newLine + adres1 + newLine + plaats1 + newLine);
		System.out.println("De gegevens van nr 2 zijn:");
		System.out.println(naam2 + newLine + adres2 + newLine + plaats2);
	}

}
