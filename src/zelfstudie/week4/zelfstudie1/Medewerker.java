/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week4.zelfstudie1
 */
package zelfstudie.week4.zelfstudie1;
import java.time.LocalDate;

/**
 * 
 */
public class Medewerker {
	private String naam;
	private int telefoonnumer;
	private String functie;
	private LocalDate beschikbaarheid;
	
	public Medewerker(String nm, int tn, String fn) {
		naam = nm;
		telefoonnumer = tn;
		functie = fn;
	}
	
	public void voltooien(Activiteit at) {
		
	}
}
