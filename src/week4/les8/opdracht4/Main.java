package week4.les8.opdracht4;

public class Main {
	public static void main(String[] args) {

		//Referentietype = Objecttype = Kat 
		Kat kat1 = new Kat ("Tom"); 
		System.out.println(kat1);
		System.out.println("aantal poten: " + kat1.getAantalPoten()); 
		System.out.println("speak: " + kat1.speak());
		kat1.setNaam("Minoes");
		System.out.println("naam: " + kat1.getNaam()); 
		
		kat1.setWekenDrachtig(9);
		System.out.println(kat1); 
		System.out.println("weken drachtig: " + kat1.getWekenDrachtig()); 
		System.out.println("spelen: " + kat1.spelen()); 
		System.out.println();	
		
		//Referentietype = AbstractDier, Objecttype = Kat 
		AbstractDier dier1 = new Kat ("Minoes"); 
		//System.out.println(dier1); 
		System.out.println(dier1);
		System.out.println("aantal poten: " + dier1.getAantalPoten()); 
		System.out.println("speak: " + dier1.speak());
		/*
		dier1.setNaam("Minoes");
		System.out.println("naam: " + dier1.getNaam()); 
		
		dier1.setWekenDrachtig(9);
		System.out.println(dier1); 
		System.out.println("weken drachtig: " + dier1.getWekenDrachtig()); 
		System.out.println("spelen: " + dier1.spelen()); 
		
		
		
		//casting met interface Huisdier 
		AbstractDier dier2 = new Kat ("Duko"); 
		Huisdier hd2 = (Huisdier) dier2; 
		System.out.println(hd2); 
		System.out.println("aantal poten: " + hd2.getAantalPoten()); 
		System.out.println("speak: " + hd2.speak());
		
		hd2.setNaam("Minoes");
		System.out.println("naam: " + hd2.getNaam()); 
		
		hd2.setWekenDrachtig(9);
		System.out.println(hd2); 
		System.out.println("weken drachtig: " + hd2.getWekenDrachtig()); 
		System.out.println("spelen: " + hd2.spelen()); 
		
		
		
		//casting met interface Boerderijdier
		AbstractDier dier3 = new Kat ("Jerry"); 
		Boerderijdier bd3 = (Boerderijdier) dier3; 
		System.out.println(bd3); 
		System.out.println("aantal poten: " + bd3.getAantalPoten()); 
		System.out.println("speak: " + bd3.speak());
		
		bd3.setNaam("Minoes");
		System.out.println("naam: " + bd3.getNaam()); 
		
		bd3.setWekenDrachtig(9);
		System.out.println(bd3); 
		System.out.println("weken drachtig: " + bd3.getWekenDrachtig()); 
		System.out.println("spelen: " + bd3.spelen()); 
		

		
		//casting met interface Dier 
		AbstractDier dier4 = new Kat ("Minka"); 
		Dier d4 = (Dier) dier4; 
		System.out.println(d4); 
		System.out.println("aantal poten: " + d4.getAantalPoten()); 
		System.out.println("speak: " + d4.speak());
		
		d4.setNaam("Minoes");
		System.out.println("naam: " + d4.getNaam()); 
		
		d4.setWekenDrachtig(9);
		System.out.println(d4); 
		System.out.println("weken drachtig: " + d4.getWekenDrachtig()); 
		System.out.println("spelen: " + d4.spelen()); 
		*/
	}

}
