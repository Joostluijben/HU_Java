/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les6.opdracht2
 */
package zelf.les10.inputoutput;

import java.util.ArrayList;
import java.io.*;
/**
 * 
 */
public class FacebookAccount implements Serializable{
	private String naam;
	private ArrayList<Vriend> vrienden = new ArrayList<Vriend>();
	
	
	public FacebookAccount(String nm) {
		naam = nm;
	}
	
	public String getnaam() {
		return naam;
	}
	
	public void voegVriendToe(Vriend nwV) {
		if (vrienden.contains(nwV)) {
			System.out.println("Bestaat al");
		}
		else {
			vrienden.add(nwV);
		}
	}
	
	public boolean verwijderVriend(Vriend exV) {
		boolean verwijderd;
		if (vrienden.contains(exV)) {
			vrienden.remove(exV);
			verwijderd = true;
		}
		else {
			verwijderd = false;
		}
		return verwijderd;
	}
	
	public boolean isVriendMet(Vriend v) {
		if (vrienden.contains(v)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int aantalVrienden() {
		return vrienden.size();
	}
	
	public String toString() {
		return "Mike heeft" + vrienden.size() + ": " + vrienden;
	}
}
