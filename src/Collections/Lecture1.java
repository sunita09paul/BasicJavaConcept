package Collections;

import java.util.Iterator;

public class Lecture1 {

	public static void main(String[] args) {
		
		
          Lecture1 al = new Lecture1();
          
          al.add("Test1");
          al.add("Test2");
          al.add("Test3");
          al.add("Test3");
          al.add(null);
          al.add(null);
          
          Iterator it = al.iterate();
          
          while (it.hasNext()) {
        	  System.out.println(it.next());
          }
          
	}

}
