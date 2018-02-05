package week2.les3.practicum2;

public class AutoHuur {
	private int aantalDagen;
	private Auto gehuurdeAuto;
	private Klant huurder;
	public AutoHuur() {
	}
	
	public void setAantalDagen(int aD) {
		aantalDagen = aD;
	}
	
	public void setGehuurdeAuto(Auto gA) {
		gehuurdeAuto = gA;
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
		return 1;
	}
	
	public String toString() {
		String s = "autotype: " + gehuurdeAuto + "\n" + huurder + 
		"\nAantal dagen: " + aantalDagen + " en dat kost ";
		if (gehuurdeAuto == null || huurder == null) {
			s = "er is geen auto bekend\ner is geen huurder bekend\nAantal dagen: 0 en dat kost 0.0";
		} else {
			s += gehuurdeAuto.getPrijsPerDag();
		}
		return s;
	}
	
}
