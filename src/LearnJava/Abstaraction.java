package LearnJava;

public class Abstaraction {
	
	public static void main(String[] args) {
	
		animal obj = new dog();// only overrided the method called of subclass 
		obj.run();
		obj.eating();
		
        dog obj1 = new dog();
		obj1.run();
		obj1.eating();
		obj1.eatingq();
		
		// Showing the needed functionality and hide the internal implemention info
		// abstraction achieve by using the Abstract class and interface
		//abstarct method without any implemention only decleared 
		//we can create refernce of abstract class , we cannot create the object of abstrsct
		
	}}
 
abstract class animal{
	public void run() {
		System.out.println("Running");
	}
	public abstract void eating();
	
	}
class dog extends animal{
	public void eating () {
		System.out.println("Dog is eating");
		}
	
	public void eatingq () {
		System.out.println("Dog is eatingq");
		}
	
}
