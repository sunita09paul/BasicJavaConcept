package LearnJava;

public class Encapasulatioons1{
     int mybal= 60000; 
	public static void main(String[] args) {
		Encapasulatioons1 r = new Encapasulatioons1();
		myaccountdetails v = new myaccountdetails();
		v.setMybal(r.mybal);
		
	}

}
 class myaccountdetails{
	 public int getMybal() {
		return mybal;
	}

	public void setMybal(int mybal) {
		this.mybal = mybal;
	}

	int mybal;
	 
 }
 class myaccountdetails1{
	 
 }

 
 
