/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week4.les7.opdracht1
 */
package week4.les7.opdracht1;

/**
 * 
 */
public class Huis extends Gebouw{
	public boolean isGeisoleerd;
	public int laatsteRenovatie;
	
	public Huis() {
		
	}
	
	public Huis(boolean isG) {
		isGeisoleerd = isG;
	}
	
	public Huis(int l, int b, int aV) {
		super(l, b, aV);
	}
	
	public Huis(int l, int b, int aV, boolean isG) {
		super(l, b, aV);
		isGeisoleerd = isG;
	}
	
	public void isoleer() {
		isGeisoleerd = true;
	}
	
	public void renoveer(int binnen) {
		laatsteRenovatie = binnen;
	}
	
	public void renoveer(int binnen, int buiten) {
		laatsteRenovatie = binnen;
		super.laatsteRenovatie = buiten;
	}
	
	public int berekenHuur() {
		return super.oppervlakte() * 100;
	}
	
	public String toString() {
		return laatsteRenovatie + "";
	}
}
