package Lecture3;

public class session7 {
//static method: without creating the object, by using class name we can call the method 
	//non static method /variable can not called in static
	//this and super key not alowed in static method
	// static block can ne used for to initialize the static variable
	// excute/run before main method
	public static void main(String[] args) {
	demo13.test();
	demo13.i= 10;
	
	 demo13 d = new demo13();
	 d.test1();
	 System.out.println(d.i);
	
  }

}
class demo13{
	static int i = 10;
	public static void test() {
	

	}
	public void test1 () {
		System.out.println("test1");
	}
	
}