/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package week2.les3.opdracht1;

public class Main {

	public static void main(String[] args) {
		Huisdier huisdier1 = new Huisdier("Nero", "Dobermann");
		Eigenaar eigenaar1 = new Eigenaar("Willem de Moller");
		
		System.out.println(huisdier1);
		huisdier1.setBaasje(eigenaar1);
		System.out.println(huisdier1);
		System.out.println();
		
		Huisdier huisdier2 = new Huisdier("Zaza", "kakkerlak");
		Eigenaar eigenaar2 = new Eigenaar("Pluk");
		System.out.println(huisdier2);
		huisdier2.setBaasje(eigenaar2);
		System.out.println(huisdier2);

	}

}
