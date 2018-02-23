/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package week2.les3.practicum2;
import java.util.ArrayList;

public class AutoHuur {
	private int aantalDagen;
	private Auto gehuurdeAuto;
	private Klant huurder;
	private ArrayList<Auto> gehuurdeAutos = new ArrayList<Auto>(); 
	public AutoHuur() {
	}
	
	public void setAantalDagen(int aD) {
		aantalDagen = aD;
	}
	
	public void setGehuurdeAuto(Auto gA) {
		if (!gehuurdeAutos.contains(gA)) {
			gehuurdeAuto = gA;
			gehuurdeAutos.add(gA);
		}
		
		
	}
	
	public Auto getGehuurdeAuto() {
		return gehuurdeAuto;
	}
	
	public void setHuurder(Klant k) {
		huurder = k;
	}
	
	public Klant getHuuder() {
		return huurder;
	}
	
	public double totaalPrijs() {
		double totaal = 0;
		if (!(gehuurdeAuto == null)  || !(huurder== null)) {
			return (aantalDagen * gehuurdeAuto.getPrijsPerDag()) * ((100 - huurder.getKorting()) / 100);
		}
		return totaal;
	}
	
	public String toString() {
		
		String s = "";
		if (gehuurdeAuto == null || huurder == null) {
			s += "er is geen auto bekend\ner is geen huurder bekend\n";
		} else {
			s +=  "autotype: " + gehuurdeAuto + "\n" + huurder + "\n";
		}
		s += "Aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
		return s;
	}
	
}
