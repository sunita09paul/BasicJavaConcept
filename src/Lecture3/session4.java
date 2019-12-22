package Lecture3;

public class session4 {
//1. Parameterized constructor
	public static void main(String[] args) {
		
		  demo2 d = new demo2(10,30);
		//  demo2 d1 = new demo2();        //it shows error here 
	}
}
class demo2{
	int i;
	int x;
	
	demo2 (int i, int x) {
		this.i = i;
		this.x   =x;
	}

	public void shown() {
		System.out.println(i);
		System.out.println(x);
	}
	
}
    