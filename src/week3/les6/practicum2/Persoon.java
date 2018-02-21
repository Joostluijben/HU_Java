/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les6.practium2
 */
package week3.les6.practicum2;

import java.util.ArrayList;
/**
 * 
 */
public class Persoon {
	private String naam;
	private double budget;
	private ArrayList<Game> games = new ArrayList<Game>();
	
	public Persoon(String nm, double bud) {
		naam = nm;
		budget = bud;
	}
	
	public boolean koop(Game g) {
		boolean gekocht = false;
		if ((!games.contains(g)) && !(budget - g.huidigeWaarde() <= 0)) {
			budget -= g.huidigeWaarde();
			games.add(g);
			gekocht = true;
		}
		return gekocht;
	}
	
	
	public boolean verkoop(Game g, Persoon koper) {
		boolean verkocht = false;
		if (games.contains(g) && (koper.budget - g.huidigeWaarde() > 0)
			&& (!koper.games.contains(g))){
			games.remove(g);
			koper.games.add(g);
			koper.budget -= g.huidigeWaarde();
			budget =+ g.huidigeWaarde();
			verkocht = true;
		}
		return verkocht;
	}
	
	public String toString() {
		return naam + " heeft een budget van " + budget + " en bezit de volgende games:\n" + games;
	}
	
}
