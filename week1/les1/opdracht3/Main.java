package week1.les1.opdracht3;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Joost");
		System.out.println("naam: " + s1.getNaam());
		System.out.println("nummer: " + s1.getStudentNummer());
		s1.setStudentNummer(12345678);
		System.out.println("toString: " + s1.toString());
		System.out.println();
		
		Student s2 = new Student("Marije", 98765432);
		System.out.println("naam: " + s2.getNaam());
		System.out.println("nummer: " + s2.getStudentNummer());
		System.out.println("toString: " + s2.toString());
		s2.setStudentNummer(123);
		System.out.println("toString: " + s2.toString());
	}

}
