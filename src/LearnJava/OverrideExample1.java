package LearnJava;

public class OverrideExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /* 
	RBI r = new SBI();
     r.rate();
     
     r = new ICICI();
     r.rate();
     */
		RBI r;
		r = new SBI();
		r.rate();
		 r= new ICICI();
		 r.rate();
     
     
    SBI s = new SBI();
     s.rate();
    /* 
     RBI t = new RBI();
     t.rate();
     */
	}}
class RBI{
	public void rate() {
		System.out.println("RBI interest rate is 10");
	}
	
}

class SBI extends RBI{
	public void savingsrate() {
		System.out.println("saving rates 5");
	}
	public void rate() {
		System.out.println("SBI interest rate is 25");
}
	
	class ICICI extends RBI{
		public void rate() {
			System.out.println("ICICI interest rate is 35");	
	}
}}

