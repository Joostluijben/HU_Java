/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les6.opdracht2
 */
package week3.les6.opdracht2;

import java.util.ArrayList;
/**
 * 
 */
public class FacebookAccount{
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
