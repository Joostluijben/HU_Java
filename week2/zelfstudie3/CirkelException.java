package week2.zelfstudie3;

public class CirkelException extends Exception{
	private int error;
	CirkelException(int a){
		error = a;
	}
	
	public String toString() {
		return error + " is te laag";
	}
}
