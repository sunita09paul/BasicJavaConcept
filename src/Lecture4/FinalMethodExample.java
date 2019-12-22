/**
 * 
 */
package Lecture4;
//it can not be override

class parent1{
	public final void eat(int a) {
		System.out.println("in parent");
	}
}

public class FinalMethodExample extends parent1{

	public void eat(int a) {
		System.out.println("in parent");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
