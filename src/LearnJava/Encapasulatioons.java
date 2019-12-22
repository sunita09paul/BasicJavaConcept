 package LearnJava;

public class Encapasulatioons {
//To hide your data member ie. variable or mathod. to define a variable in
	// private in nature so that from outside of the class no one can access it. Binding data with method 	
	
	private int bal = 50000;
	public static void main(String[] args) {
		Encapasulatioons e = new Encapasulatioons();
		
		Accountbalance ab = new Accountbalance();
		ab.setBal(e.bal);
		
		
		System.out.println(ab.getBal());
	}
}
class Accountbalance {
	
	private int bal;

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}
	
}
