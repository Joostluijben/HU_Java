package week2.zelfstudie3;

public class Cirkel {
	private int radius;
	private int xPositie;
	private int yPositie;
	
	
	
	public Cirkel(int rad, int x, int y) throws CirkelException{
		if (rad <= 0 ) {
			throw new CirkelException(rad);
		}
		else {
			radius = rad;
			xPositie = x;
			yPositie = y;
		}
	}
	
	public String toString() {
		return "cirkel (" + xPositie + ", " + yPositie + ") met radius " +radius;
	}
}
