package Lecture4;

class superclass {
	int x = 50;
	
	superclass(int h){
		System.out.println("constructor value is" +h);
	}

	public void display() {
		System.out.println();
	}
}

public class SuperKeyword1 extends superclass{
	SuperKeyword1(){
		super(150);
	}
	
	int x = 100;

	public void show() {
		System.out.println(super.x);
	}

	public static void main(String[] args) {
		SuperKeyword1 s = new SuperKeyword1();
		s.show();

	}

}
