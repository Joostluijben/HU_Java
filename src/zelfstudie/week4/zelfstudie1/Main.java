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
public class Main {
	public static void main(String[] args) {
		Klus k1 = new Klus("k1", "badkamer renoveren");
		Activiteit a1 = new Activiteit("slopen oude badkamer", LocalDate.of(2015, 6, 18), LocalDate.of(2017, 6, 18));
		Activiteit a2 = new Activiteit("uitfrezen leidingen", LocalDate.of(2016, 6, 18), LocalDate.of(2017, 6, 18));
		
	}
}
