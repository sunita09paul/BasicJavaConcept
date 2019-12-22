package Lecture4;

public class StringExample1 {

	public static void main(String[] args) {
		String s = "Sunita";
		String s1 = new String("Sunita");
		s1=s1.concat("test");
		
		

		if (s1.equals(s)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
