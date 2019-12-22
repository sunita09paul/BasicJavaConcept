package Lecture4;

public class FinalVariable {
   int a = 20;
 
 public final void show () {
	 a = a+20;
	 System.out.println(a);
 }
 
 class display extends FinalVariable{
	 public void show() {
		 System.out.println(a);
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariable f = new FinalVariable();
		f.show();
	}

}
