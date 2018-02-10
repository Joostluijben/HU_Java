/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package week2.les3.practicum1;

public class Main {

	public static void main(String[] args) {
		Huis huis1 = new Huis("Nijenoord 1", 1970);
		Persoon persoon1 = new Persoon("Ronald Plasterk", 52);
		huis1.setHuisbaas(persoon1);
		System.out.println(huis1);
		System.out.println();
		
		Huis huis2 = new Huis("Vredenburg", 1991);
		Persoon persoon2 = new Persoon("Annie Brouwers", 59);
		huis2.setHuisbaas(persoon2);
		System.out.println(huis2);
		
		System.out.println();
		System.out.println("Huisbaas 1: " + huis1.getHuisbaas());
		System.out.println("Huisbaas 2: " + huis2.getHuisbaas());
	}

}
