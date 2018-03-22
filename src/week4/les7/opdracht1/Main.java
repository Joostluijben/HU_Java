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
public class Main {
	//a. wel toegestaan
	//b. wel toegestaan
	//c. niet toegestaan
	//d. wel toegstaan
	//e. wel toegestaan
	//f. wel toegestaan FOUT
	//g. binnenrenovatie = 1985, buitenrenovatie = 1985 FOUT binnen=0
	//h. binnnen =1990, buitenrenovatie = 0 FOUT buiten =0
	//i. binnen = 1995 buiten =1995 FOUT buiten = 0
	//j. binnen = 2000 buiten = 2005
	//k. niet toegestaan
	//l. huis
	//m. gebouw
	//n. huis
	//o. huis
	public static void main(String[] args) {
		Gebouw g;
		Huis h = new Huis(10, 7, 1);
		g = h;
		g = new Huis();
		//h = g;
		h = (Huis)g;
		if (g instanceof Huis) {
			h = (Huis)g;
		}
		//h.super.laatsteRenovatie = 1980;
		g.laatsteRenovatie = 1985;
		System.out.println(h.laatsteRenovatie);
		System.out.println(g.laatsteRenovatie);
		h.laatsteRenovatie = 1990;
		System.out.println(h.laatsteRenovatie);
		System.out.println(g.laatsteRenovatie);
		((Huis)g).laatsteRenovatie = 1995;
		System.out.println(h.laatsteRenovatie);
		System.out.println(g.laatsteRenovatie);
		h.renoveer(2000, 2005);
		System.out.println(h.laatsteRenovatie);
		System.out.println(g.laatsteRenovatie);
		//g.isGeisoleerd = true;
		
	}
	
}
