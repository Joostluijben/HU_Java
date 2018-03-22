/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package week2.les3.practicum2;

public class Main {
	 public static void main(String[] args) {
	 AutoHuur autoHuurder1 = new AutoHuur();
	 System.out.println("Eerste autohuur:\n" + autoHuurder1 + "\n");
	 Klant klant = new Klant("Mijnheer de Vries");
	 klant.setKorting(10.0);
	 autoHuurder1.setHuurder(klant);
	 Auto a1 = new Auto("Peugeot 207", 50);
	 autoHuurder1.setGehuurdeAuto(a1);
	 autoHuurder1.setAantalDagen(4);
	 System.out.println("Eerste autohuur:\n" + autoHuurder1 + "\n");
	 AutoHuur autoHuurder2 = new AutoHuur();
	 Auto a2 = new Auto("Ferrari", 3500);
	 autoHuurder2.setGehuurdeAuto(a2);
	 autoHuurder2.setHuurder(klant);
	 autoHuurder2.setAantalDagen(1);
	 System.out.println("Tweede autohuur:\n" + autoHuurder2 + "\n");
	 System.out.println("Gehuurd: " + autoHuurder1.getGehuurdeAuto());
	 System.out.println("Gehuurd: " + autoHuurder2.getGehuurdeAuto());
	 }
}