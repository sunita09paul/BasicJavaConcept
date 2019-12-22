package LearnJava;

public class Car {

	public static void main(String[] args) {
		renault r = new newbike();
		r.blackrenault();
		
		newbike n = (newbike) new renault();
		n.blackrenault();
	
		
		}
}
		
	
    class renault{
    	public void blackrenault() {
    		System.out.println("Black Renault");
    	}
    	
     }
    class newbike extends renault{
    	public void blackrenault() {
    		System.out.println("New hunk");
    	}
    	
    	
    	
    	
    }
    
  




