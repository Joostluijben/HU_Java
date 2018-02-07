/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package week2.les4.practicum3;

public class Main {

	public static void main(String[] args) {
		Klas klant = new Klas("V1Z");
		Leerling leerling = new Leerling("Hans");
		klant.voegLeerlingToe(leerling);
		leerling = new Leerling("Jan");
		klant.voegLeerlingToe(leerling);
		leerling = new Leerling("Wim");
		klant.voegLeerlingToe(leerling);
		System.out.println(klant);
		klant.wijzigCijfer("Hans", 7.6);
		klant.wijzigCijfer("Klaas", 7.6);
		System.out.println(klant.toString());
		System.out.println("Aantal leerlingen: " + klant.aantalLeerlingen()); 

	}

}
