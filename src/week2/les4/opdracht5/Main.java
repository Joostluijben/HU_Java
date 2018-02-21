/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package week2.les4.opdracht5;

public class Main {

	public static void main(String[] args) {
		Eigenaar eigenaar1 = new Eigenaar("Willem de Moller");
		System.out.println(eigenaar1);
		eigenaar1.setBeestje( new Huisdier("Nero", "Dobermann") );
		System.out.println(eigenaar1);
		System.out.println();
		Eigenaar eigenaar2 = new Eigenaar("Pluk");
		System.out.println(eigenaar2);
		eigenaar2.setBeestje(new Huisdier("Zaza", "kakkerlak") );
		System.out.println(eigenaar2);
		System.out.println();
		System.out.println(eigenaar1.getBeestje());
		System.out.println(eigenaar2.getBeestje());
		System.out.println(eigenaar2.getHuisdieren());		
	}

}
