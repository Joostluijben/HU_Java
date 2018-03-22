/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week4.les7.practicum1
 */
package week4.les7.practicum1;

import java.util.ArrayList;

/**
 * 
 */
public class BedrijfsInventaris {
	private String bedrijfsnaam;
	private double budget;
	private ArrayList alleGoederen = new ArrayList<Goed>();
	
	public BedrijfsInventaris(String nm, double bud) {
		bedrijfsnaam = nm;
		budget = bud;
	}
	
	public void schafAan(Goed g) {
		if (!alleGoederen.contains(g)) {
			alleGoederen.add(g);
		}
	}
	
	public String toString() {
		String s = "HU met inventaris:\n";
		for (Object g : alleGoederen) {
			s += g + "\n";
		}
		return s;
	}
}
