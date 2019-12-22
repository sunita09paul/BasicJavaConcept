package LearnJava;

public class Polymor {

	public static void main(String[] args) {
		
		Polymor p = new Polymor();
		p.add(10, 20);
		p.add(10, 20, 30);
		
		// TODO Auto-generated method stub
//Same action behaves diffrently in diffrent situation is called polymorphanism
		//Two type1. Static/complile time :Overloadding, 2. Dynamic/run time: overriding
		//1. Static: Same method , diffrent sig with same class
		// it is used for code readability
// main can be overloading ]
	}
	   public void add (int a , int b) {
		System.out.println(a+b);
		
	}
		public void add (int a , int b , int c) {

		System.out.println(a+b+c);
		}
}
