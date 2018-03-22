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
public class Trein extends Voertuig{
	private boolean inVeiligheidsmodus;
	
	public Trein(String tp, int mS) {
		super(tp, mS);
	}

	public void setVeiligheidsModus(boolean vM) {
		inVeiligheidsmodus = vM;
	}

	public void snelheidVerhogen() {
		if (inVeiligheidsmodus == true && super.huidigeSnelheid + 20 < super.maximumSnelheid) {
			super.huidigeSnelheid += 20;
		}
		else {
			super.huidigeSnelheid += 20;
		}
	}

	public void snelheidVerlagen() {
		//System.out.println(super.huidigeSnelheid);
		super.huidigeSnelheid -= 20;
		
	}
	
	public String toString() {
		String veiligheid = null;
		if (inVeiligheidsmodus == false) {
			veiligheid = "uit";
		}
		else {
			veiligheid = "aan";
		}
		String s = "Trein (veiligheidsmodus: " + veiligheid + ") van " + super.getType() + " rijdt nu " + super.huidigeSnelheid + " (max.: " + super.maximumSnelheid + ")" ;
		return s;
	}
}
