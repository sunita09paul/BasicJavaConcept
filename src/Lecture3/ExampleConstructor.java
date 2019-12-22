package Lecture3;

public class ExampleConstructor {
//object and instance variable initilization. 
	public static void main(String[] args) {
		demo d = new demo();
		System.out.println(d.i);
		}

}
class demo{
	int i =10;
	demo (){
		i=10;
	}
	public void shown () {
		System.out.println(i);
	}
	
}
