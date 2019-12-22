package Lecture3;

public class Session3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape3 s = new circle3();
		s.test();

	}

}
interface shape3 {
	public abstract void draw();
	default void test() {
		System.out.println("draw shape");
		}
	
	
}
class circle3 implements shape3 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	public void test() {
		System.out.println("Draw : circle");
	}
}