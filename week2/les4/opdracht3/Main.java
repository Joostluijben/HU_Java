package week2.les4.opdracht3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<Double>();
		double sum = 0;
		while (true) {
			
			System.out.println("Voer een positief getal in: ");
				Scanner scanner = new Scanner(System.in);
				String invoer = scanner.nextLine();
				double getal = Integer.parseInt(invoer);
				if (getal != 0 && getal >= 0) {
					list.add(getal);
				}
				else {
					System.out.println("Stop");
					break;
				}
		}
		for (int i = 0; i < list.size(); i++) {
			sum += (double)list.get(i);
			System.out.println(list.get(i));
		}
		double average = sum / list.size();
		System.out.println("Het gemiddelde is: " + average);
	}

}
