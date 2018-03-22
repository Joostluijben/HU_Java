/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week5.les10.opdracht1
 */
package week5.les10.opdracht1;
import java.io.*;

/**
 * 
 */
public class Main {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("invoer.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String regel = br.readLine();
		
		int aantalGetal = 0;
		double sum = 0;
		while (regel != null) {
			aantalGetal++;
			double getal = Double.parseDouble(regel);
			sum += getal;
			System.out.println(getal);
			regel = br.readLine();
		}
		System.out.println("Aantal getallen: " +aantalGetal);
		System.out.println("Gemiddeld: " + sum / aantalGetal);
	}
}
