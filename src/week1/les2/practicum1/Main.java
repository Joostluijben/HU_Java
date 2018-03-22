/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week1.les2.practicum1
 */
package week1.les2.practicum1;

/**
 * 
 */
public class Main {
	 public static void main(String[] arg) {
	 Zwembad zwembad1 = new Zwembad(2.0, 5.5, 1.5);
	 System.out.println("BREEDTE: " + zwembad1.getBreedte());
	 System.out.println("LENGTE: " + zwembad1.getLengte());
	 System.out.println("DIEPTE: " + zwembad1.getDiepte());
	 System.out.println("BEREKENDE INHOUD: " + zwembad1.inhoud());
	 System.out.println();
	 Zwembad zwembad2 = new Zwembad( );
	 zwembad2.setBreedte(2.5);
	 zwembad2.setLengte(100.0);
	 zwembad2.setDiepte(2.0);
	 double inhoud = zwembad2.inhoud();
	 System.out.println("GEGEVENS ZWEMBAD: "+zwembad2.toString());
	 System.out.println("BEREKENDE INHOUD: " + zwembad2.inhoud());
	 }
	}
