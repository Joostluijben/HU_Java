/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package zelfstudie.week1.zelfstudie;

import java.lang.Math;

public class Main {
	
	public static void main(String[] args) {
		for (int i=1; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println();
		int count = 0;
		while (count < 11) {
			System.out.println(count++);
		}
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			System.out.println(Math.random());
		}
		System.out.println();
		int addition = 0;
		for(int i = 1; i <= 39; i++) {
			addition += i;
			
		}
		System.out.println(addition);
		System.out.println();
		
		for (int i = 0; i < 4; i++) {
			String s = "s";
			if ((i % 2) == 0) {
				System.out.println(s);
			}
			else {
				System.out.println(s += s);
			}
		}
	}
	
}
