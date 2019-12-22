package Lecture4;

public class ThisConstructor1 {
	
	ThisConstructor1(){
		
	//	this(50);
		System.out.println("No argument");
	
	}
	ThisConstructor1(int a){
		this();
		System.out.println(a);
	}

	public void show () {
		display(this);
	}
	
	public void display(ThisConstructor1 t) {
		
	}
	
	public static void main(String[] args) {
		ThisConstructor1 t = new ThisConstructor1(10);
	}

}
