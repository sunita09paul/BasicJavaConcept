package Lecture4;


class parent {
	int a=10;
	
	parent(int b){
		System.out.println("in super class constructor "+b);
	}
	public void show() {
		System.out.println("In parent class");
	}
}

public class SuperKeywordVariable extends parent{
	SuperKeywordVariable(){
		super(50);
	}
	int a=20;
	public void display() {
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeywordVariable t = new SuperKeywordVariable();
		t.display();
	}

}
