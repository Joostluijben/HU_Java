/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht proeftentamen.opdracht3
 */
package proeftentamen.opdracht3;

import java.io.*;

/**
 * 
 */
public class LvmManager {
	public LvmManager IvmInladen (String bestandsnaam) {
		LvmManager lvM = null;
		try {
			FileInputStream fis = new FileInputStream(bestandsnaam);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			if (obj != null) {
				lvM = (LvmManager)obj;
			}
		} catch (IOException ioe) {
			System.out.println("bestand niet gevonden");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("klasse niet gevonden");
		}
		
		return lvM;
	}
}
