/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht zelf.les10.inputoutput
 */
package zelf.les10.inputoutput;

import java.io.*;
import java.util.*;
/**
 * 
 */
public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ArrayList<Vriend> vrienden = new ArrayList<Vriend>();
		vrienden.add(new Vriend("Frans","Theunis", "Frans.theunis@gmail.com"));
		FileOutputStream fos = new FileOutputStream("vrienden.obj", true);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(vrienden);
		oos.close();
		FileInputStream fis = new FileInputStream("vrienden.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		ArrayList<Vriend> niewVrienden = (ArrayList<Vriend>)obj;
		ois.close();
		for(Vriend v : niewVrienden) {
			System.out.println(v);
		}
	}
}
