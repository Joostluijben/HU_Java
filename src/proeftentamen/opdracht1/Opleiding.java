/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht proeftentamen.opdracht1
 */
package proeftentamen.opdracht1;

/**
 * 
 */
public class Opleiding {
	private String naam;
	private String variant;
	private int studieduur;
	private int minimumECs;

	public Opleiding(String nm, int std, int mEs) {
		this(nm, "voltijd", std, mEs);
	}
	
	public Opleiding(String nm, String v, int std, int mEs) {
		naam = nm;
		variant = v;
		studieduur = std;
		minimumECs = mEs;
	}

	public String getNaam() {
		return naam;
	}

	public void setStudieduur(int std) {
		studieduur = std;
	}

	public void wijzigVariant(String v) {
		variant = v;
	}

	public String toString() {
		String s = "HBO-ICT in voltijd. De studie duurt " + studieduur + " jaar (minimaal " + minimumECs + " EC)";
		return s;
	}
}