/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht proeftentamen.opdracht2
 */
package proeftentamen.opdracht2;

/**
 * 
 */
public abstract class Voertuig{
	private String type;
	protected int maximumSnelheid;
	protected int huidigeSnelheid;

	public Voertuig(String tp, int mS) {
		type = tp;
		maximumSnelheid = mS;
	}
	
	public abstract void snelheidVerhogen();
	
	public abstract void snelheidVerlagen();
	
	public String getType() {
		return type;
	}

	public String toString() {
		return "";
	}
}