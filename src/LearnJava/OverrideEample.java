package LearnJava;

public class OverrideEample {

	public static void main(String[] args) {
	
		Dog45 d =new Dog45();
		d.eating();
		
		Cat45 c = new Cat45();
		c.eating();
		
		Animal45 an = new Animal45();
		an.eating();
		
	}
}

class Animal45{
	public void eating() {
		System.out.println("Animal is eating");
	}
}
class Dog45 extends Animal45{
	public void bark() {
		System.out.println("Dog is barking");
	}
	public void eating() {
		System.out.println("Dog is eating");
	}
	
}

class Cat45 extends Animal45{
	public void eating() {
		System.out.println("cat is eating");
	}
}
