/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week5.les10.practicum3
 */
package week5.les10.practicum3;
import java.io.*;
import java.util.Scanner;
/**
 * 
 */
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geef de dollar naar euro koers op: ");
		double rate = Double.parseDouble(sc.nextLine());
		
		FileReader fr1 = new FileReader("prices_usd.txt");
		BufferedReader br1 = new BufferedReader(fr1);
		
		FileWriter fw1 = new FileWriter("prices_euro.txt");
		PrintWriter pw1 = new PrintWriter(fw1);
		
		String line = br1.readLine();
		while (line != null) {
			String values[] = line.split(" : ");
			double newRate = Double.parseDouble(values[1]) * rate;
			pw1.println(values[0] + " : " + Double.toString(newRate));
			line = br1.readLine();
		}
		pw1.close();
		br1.close();
	}
}
