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
public class Gebouw {
	private int lengte;
	private int breedte;
	private int aantalVerdiepingen;
	public int laatsteRenovatie;
	
	public Gebouw() {
		
	}
	
	public Gebouw(int l, int b, int aV) {
		lengte = l;
		breedte = b;
		aantalVerdiepingen = aV;
	}
	
	public int oppervlakte() {
		return lengte * breedte;
		
	}
	
	public void renoveer(int jaarBuiten) {
		laatsteRenovatie = jaarBuiten;
	}
	
	public int berekenHuur() {
		return oppervlakte() * 75;
	}
	
	public String toString() {
		return laatsteRenovatie + "";
	}
}
