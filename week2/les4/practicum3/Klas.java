package week2.les4.practicum3;

import java.util.ArrayList;

public class Klas {
	private String klasCode;
	ArrayList<Leerling> leerlingen = new ArrayList<Leerling>(); 
	
	public Klas(String kC) {
		klasCode = kC;
	}
	
	public void voegLeerlingToe(Leerling l) {
		leerlingen.add(l);
	}
	
	public void wijzigCijfer(String nm, double nweCijfer) {
		for (int i = 0; i < leerlingen.size(); i++) {
			if (leerlingen.get(i).getNaam() == nm) {
				leerlingen.get(i).setCijfer(nweCijfer);
			}
		}
	}
	
	public ArrayList<Leerling> getLeerlingen() {
		return leerlingen;
	}
	
	public int aantalLeerlingen() {
		return leerlingen.size();
	}
	
	public String toString() {
		return "In klas" + klasCode + " zitten de volgende leerlingen: " + leerlingen;
	}
}
