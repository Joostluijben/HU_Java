/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les6.opdracht2
 */
package zelf.les10.inputoutput;
import java.io.*;

/**
 * 
 */
public class Vriend implements Serializable{
	private String voornaam;
	private String achternaam;
	private String email;
	
	public Vriend(String vnm, String anm, String em) {
		voornaam = vnm;
		achternaam = anm;
		email = em;
	}
	
	public boolean equals(Object andereObject) {
		boolean gelijkeObjecten = false;
		if (andereObject instanceof Vriend) {
			Vriend andereVriend = (Vriend) andereObject;
			
			if(this.voornaam.equals(andereVriend.voornaam) &&
			   this.achternaam.equals(andereVriend.achternaam) && 
			   this.email.equals(andereVriend.email)) {
				gelijkeObjecten = true;
			}
		}
		return gelijkeObjecten;
	}
	
	public String toString() {
		return voornaam + " " +  achternaam + ", email: " + email;
	}
}
