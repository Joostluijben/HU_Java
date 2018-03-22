/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week1.les2.practicum1
 */
package week1.les2.practicum1;

/**
 * 
 */
public class Zwembad {
	private double breedte;
	private double lengte;
	private double diepte;
	private double inhoud;
	
	public Zwembad(double br, double ln, double dp) {
		breedte = br;
		lengte = ln;
		diepte = dp;
	}
	
	public Zwembad( ) {
		
	}
	
	public double getBreedte() {
		return breedte;
	}
	
	public double getLengte() {
		return lengte;
	}
	
	public double getDiepte() {
		return diepte;
	}
	
	public void setBreedte(double br) {
		breedte = br;
	}
	
	public void setLengte(double ln) {
		lengte = ln;
	}
	
	public void setDiepte(double dp) {
		diepte = dp;
	}
	
	public double inhoud() {
		inhoud = lengte * breedte * diepte;
		return inhoud;
	}
	
	public String toString() {
		return "Dit zwembad is " + breedte + " meter breed, " + lengte +
				" meter lang en " + diepte + " meter diep";
	}
}
