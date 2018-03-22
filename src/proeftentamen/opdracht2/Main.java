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
public class Main {
	 public static void main(String[] args) {
	 //Bus b1 = new Bus("Mercedes driverless A-007", 120, 10);
	 Trein t1 = new Trein("Tokyo Train 10000 series", 360);
	 System.out.println(t1);
	 t1.setVeiligheidsModus(true);
	 for (int i = 0; i < 8; i++) { t1.snelheidVerhogen(); }
	 System.out.println(t1); t1.snelheidVerhogen();
	 t1.snelheidVerhogen(); System.out.println(t1);
	 }
}