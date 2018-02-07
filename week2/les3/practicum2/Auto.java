/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package week2.les3.practicum2;

public class Auto {
	private String type;
	private double prijsPerDag;
	
	public Auto(String tp, double prPd) {
		type = tp;
		prijsPerDag = prPd;
	}
	
	public void setPrijs(double prPd) {
		prijsPerDag = prPd;
	}
	
	public double getPrijsPerDag() {
		return prijsPerDag;
	}
	
	public String toString() {
		return type + " met prijs per dag: " + prijsPerDag;
	}

}
