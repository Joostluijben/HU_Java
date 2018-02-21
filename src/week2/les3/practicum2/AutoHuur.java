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
		return (aantalDagen * gehuurdeAuto.getPrijsPerDag()) * ((100 - huurder.getKorting()) / 100);
	}
	
	public String toString() {
		String s = "autotype: " + gehuurdeAuto + "\n" + huurder + 
		"\nAantal dagen: " + aantalDagen + " en dat kost ";
		if (gehuurdeAuto == null || huurder == null) {
			s = "er is geen auto bekend\ner is geen huurder bekend\nAantal dagen: 0 en dat kost 0.0";
		} else {
			s += this.totaalPrijs();
		}
		return s;
	}
	
}
