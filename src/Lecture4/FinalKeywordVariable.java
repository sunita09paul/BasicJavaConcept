package Lecture4;
//fianl variable cannot change its value
public class FinalKeywordVariable {
	final int a =10;
	public void display() {
		a = a + 40;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeywordVariable y = new FinalKeywordVariable();
		y.display();
	}

}
