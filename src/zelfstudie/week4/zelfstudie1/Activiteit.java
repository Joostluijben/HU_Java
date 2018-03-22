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
public class Activiteit {
	private String naam;
	private LocalDate startdatum;
	private LocalDate einddatum;
	private Medewerker medewerker;
	
	public Activiteit(String nm, LocalDate sd, LocalDate ed) {
		naam = nm;
		startdatum = sd;
		einddatum = ed;
	}
	
}
