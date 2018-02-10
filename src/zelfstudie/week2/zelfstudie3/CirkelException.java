/**
 * @author Joost Luijben
 *
 * @studentnummer 1718331
 * 
 * @opdracht week3.les5.opdracht1
 */
package zelfstudie.week2.zelfstudie3;

public class CirkelException extends Exception{
	private int error;
	CirkelException(int a){
		error = a;
	}
	
	public String toString() {
		return error + " is te laag";
	}
}
