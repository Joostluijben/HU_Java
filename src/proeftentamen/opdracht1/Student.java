/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht proeftentamen.opdracht1
 */
package proeftentamen.opdracht1;

/**
 * 
 */
public class Student {
	private String naam;
	private int leeftijd;
	private Opleiding mijnOpleiding;
	
	public Student(String nm, int lft) {
		naam = nm;
		leeftijd = lft;
	}

	public Opleiding getOpleiding(Opleiding opl) {
		return mijnOpleiding;
	}

	public void setOpleiding(Opleiding opl) {
		mijnOpleiding = opl;
	}

	public String toString() {
		String s = "Student " + naam + " (" + leeftijd + " jaar) volgt ";
		if (mijnOpleiding == null) {
			s += "nog geen opleiding";
		}
		else {
			s += "de opleiding " + mijnOpleiding;	
		}
		return s;
	}
}
