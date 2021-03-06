/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package zelfstudie.week1.zelfstudie6;

public class Rekening {
	 private int nummer; // de 2 attributen
	 private double saldo;
	 // de constructor
	 public Rekening(int nr) {
	 nummer = nr;
	 }
	 public int getNummer() { return nummer; }
	 public double getSaldo() { return saldo; }
	 // "echte" methoden:
	 public void stort(double bedrag) {
		 if (bedrag >= 0) {
			 saldo = saldo + bedrag; 
		 }
	 }
	 public void neemOp(double bedrag) {
		 if (bedrag >= 0) {
			 saldo = saldo - bedrag;
		 }
	 }
	 public String toString() {
	 String s = "Op rekening " + nummer + " staat " + saldo;
	 return s;
	 }
}