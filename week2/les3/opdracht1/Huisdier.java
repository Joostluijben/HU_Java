package week2.les3.opdracht1;

public class Huisdier {
	private String naam;
	private String ras;
	private double gewicht;
	private Eigenaar baasje;
	
	public Huisdier(String nm, String r) {
		naam = nm;
		ras = r;
		gewicht = 0.0;
	}
	
	public String getNaam() { 
		return naam; 
	}
	
	public String getRas() { 
		return ras; 
	}
	
	public String toString() {
		return naam + ", de " + ras + ", weegt " + gewicht + " kg. \nen de eigenaar is: "
				+ baasje;
	}
	
	public void setBaasje(Eigenaar e) {
		baasje = e;
		
	}
}
