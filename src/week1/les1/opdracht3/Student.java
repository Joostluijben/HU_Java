/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package week1.les1.opdracht3;

public class Student {
	private String naam;
	private int studentNummer;
	
	public Student(String nm) 
	{
		naam = nm;
	}
	
	public Student(String nm, int stNr) {
		naam = nm;
		studentNummer = stNr;
		
	}
	
	
	public String getNaam() {
		return naam;
	}
	
	public int getStudentNummer() {
		return studentNummer;
	}
	
	public void setStudentNummer(int stnr) {
		studentNummer = stnr;
	}
	
	public String toString() {
		return "Deze student heet " + naam + " en heeft nummer " + studentNummer;
	}
}