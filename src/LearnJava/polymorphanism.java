package LearnJava;

public class polymorphanism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorphanism p = new polymorphanism();
		p.sub(55, 5);
		p.sub(20, 10, 5);
	}
public void sub (int a, int b) {
	System.out.println(a-b);
}
	public void sub (int a, int b, int c) {
		System.out.println(a-b-c);
	}
	
}
