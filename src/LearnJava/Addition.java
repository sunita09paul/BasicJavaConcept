package LearnJava;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
    	System.out.println("Enter first value");
    	
    		int a = sc.nextInt();
    		
    		System.out.println("ENter second value");
    		int b = sc.nextInt();
    		int sum = a+b;
    		System.out.println("Addition is"+sum);
	}
	

}
