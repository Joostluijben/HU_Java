/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package week1.les2.practicum2;

public class Main {
	 public static void main(String[] args) {
	 Voetbalclub ajax = new Voetbalclub("Ajax ");
	 System.out.println(ajax);
	 Voetbalclub feijnoord = new Voetbalclub("Feijenoord");
	 feijnoord.verwerkResultaat('w');
	 feijnoord.verwerkResultaat('w');
	 feijnoord.verwerkResultaat('w');
	 feijnoord.verwerkResultaat('g');
	 System.out.println(feijnoord);
	 }
	}
