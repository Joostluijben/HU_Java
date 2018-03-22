/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week2.les4.opdracht4
 */
package week2.les4.opdracht4;
import java.util.*;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {
		ArrayList<Huisdier> huisdieren = new ArrayList<Huisdier>();
		Huisdier huisdier1 = new Huisdier("Poes", "kat");
		Huisdier huisdier2 = new Huisdier("Ko", "konijn");
		huisdier1.setGewicht(15.0);
		huisdier2.setGewicht(8.0);
		huisdieren.add(huisdier1);
		huisdieren.add(huisdier2);
		huisdieren.add(new Huisdier("Dotje", "konijn"));
		System.out.println("Er zijn " + huisdieren.size() + " huisdieren");
		for (Huisdier huisdier : huisdieren){
			System.out.println(huisdier);
		}
		System.out.println();
		huisdieren.add(0, new Huisdier("Bessie", "lama"));
		huisdieren.set(2, new Huisdier("Piet", "dromedaris"));
		for (int i = 0; i < huisdieren.size(); i++) {
			System.out.println(huisdieren.get(i));
		}
	}
}
