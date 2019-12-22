package LearnJava;

import java.util.Scanner;

public class Input_variables {

	public static void main(String[] args) {
		System.out.print("Enter your name");
		Scanner sc = new Scanner (System.in);
		
		
		String name = sc.nextLine();
		
		System.out.print("My name is " + name);

	}

}
