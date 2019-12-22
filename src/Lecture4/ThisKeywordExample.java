package Lecture4;
//this is used to refer current class instant variable
public class ThisKeywordExample {

	public static void main(String[] args) {
   demo d =  new demo (10,20);
        d.show();
	}

}
class demo{
	int a;
	int b;
	
	demo(int a ,int b){
		this.a = a;
		this.b = b;
		}
	public void show() {
		System.out.println("value of a" +a);
		System.out.println("value of b" +b);
		}
	}