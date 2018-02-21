/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les6.practium2
 */
package week3.les6.practicum2;

/**
 * 
 */
import java.time.LocalDate;
public class Main {
	public static void main(String[] args) {
		int releaseJaar1 = LocalDate.now().getYear() - 1; // 1 jaar geleden
		int releaseJaar2 = LocalDate.now().getYear() - 2; // 2 jaar geleden
		Game game1 = new Game("Just Cause 3", releaseJaar1, 49.98);
		Game game2 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);
		Game g3 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);
		Persoon persoon1 = new Persoon("Eric", 200);
		Persoon persoon2 = new Persoon("Hans", 55);
		Persoon persoon3 = new Persoon("Arno", 185);
		System.out.println("persoon1 koopt game1:" + (persoon1.koop(game1) ? "" : " niet") + " gelukt");
		System.out.println("persoon1 koopt game2:" + (persoon1.koop(game2) ? "" : " niet") + " gelukt");
		System.out.println("persoon1 koopt g3:" + (persoon1.koop(g3) ? "" : " niet") + " gelukt");
		System.out.println("persoon2 koopt game2:" + (persoon2.koop(game2) ? "" : " niet") + " gelukt");
		System.out.println("persoon2 koopt game1:" + (persoon2.koop(game1) ? "" : " niet") + " gelukt");
		System.out.println("persoon3 koopt g3:" + (persoon3.koop(g3) ? "" : " niet") + " gelukt");
		System.out.println("\np1: " +persoon1+ "\n\np2: " +persoon2+ "\n\np3: " +persoon3+ "\n");
		System.out.println("persoon1 verkoopt game1 aan persoon3:"+(persoon1.verkoop(game1, persoon3) ? "" : " niet")+" gelukt");
		System.out.println("persoon2 verkoopt game2 aan persoon3:"+(persoon2.verkoop(game2, persoon3) ? "" : " niet")+" gelukt");
		System.out.println("persoon2 verkoopt game1 aan persoon1:"+(persoon2.verkoop(game1, persoon1) ? "" : " niet")+" gelukt");
		System.out.println("\np1: " +persoon1+ "\n\np2: " +persoon2+ "\n\np3: " +persoon3+ "\n");
	 }
}
