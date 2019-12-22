package Lecture3;

public class session6 {
//2. Static keyword: for better memory management
	//Applicable for variable, method , block and nested class
	//Share same memory for all the object of that class 
	public static void main(String[] args) {
	demo12 d = new demo12();
	demo12 d1 = new demo12();
	demo12 d2 = new demo12();
	}

}
class demo12{
	static int i = 10;
	demo12(){
		i++;
		System.out.println(i);
		
	}
}
