/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package week1.les2.practicum2;

public class Voetbalclub {
	private int aantalGewonnen;
	private int aantalVerloren;
	private int aantalGelijk;
	private String club;
	public Voetbalclub(String cb) {
		club = cb;
	}
	
	public void verwerkResultaat(char ch) {
		 if (ch == 'w')
		 aantalGewonnen = aantalGewonnen + 1;
		 if (ch == 'g')
		 aantalGelijk = aantalGelijk + 1;
		 if (ch == 'v')
		 aantalVerloren = aantalVerloren + 1;
		 }
	
	private int aantalGespeeld() {
		return aantalGewonnen + aantalVerloren + aantalGelijk;
	}
	
	private int aantalPunten() {
		return aantalGewonnen * 3 + aantalGelijk;
	}
	
	
	public String toString() {
		return club + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " +
	aantalVerloren + " " +aantalPunten();
	}
	
}
