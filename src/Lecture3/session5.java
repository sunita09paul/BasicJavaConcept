package Lecture3;
//Constructor Overloading
public class session5 {

	public static void main(String[] args) {
		
		demo11 d = new demo11(10,50);
		}
}

 class demo11 {
	 demo11(){
	System.out.println("Default");	 
	 }
	 
	 demo11 (int i){
		 System.out.println(i);
	 }
	 
	 demo11 (int i,int k){
		 System.out.println(i*k);
	 }
 }