package Lecture4;

public class ThisConstructorExample {
	
	ThisConstructorExample(){
		//this(10);
		System.out.println("in no arg constructor");
	}
	
	ThisConstructorExample(int a){
		this();
		System.out.println(a);
		
	}
	
	public void show() {
		display(this);
	}
	public void display(ThisConstructorExample t) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstructorExample constructorExample = new ThisConstructorExample(10);
		
		

	}

}
