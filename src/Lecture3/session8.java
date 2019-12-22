package Lecture3;

public class session8 {
// we can write multiple static block. it can be run sequentially
	//we can not create the object of main method
	//class.manin method
	public static void main(String[] args) {
	  
	  demo15 d = new demo15();
	  }
}
class demo15{
	demo15(){
		System.out.println("constant");
	}
	static {
		System.out.println("static block");
		
	}
	
	static {
		System.out.println("Static block2");
	}
}