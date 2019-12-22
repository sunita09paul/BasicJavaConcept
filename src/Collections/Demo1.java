package Collections;

import java.util.ArrayList;
import java.util.Iterator;

//1.ArrayList

public class Demo1 {
public static void main(String[] args) {
		
		ArrayList <String> al = new ArrayList<String>();
		
		 al.add("Test1");
         al.add("Test2");
         al.add("Test3");
         al.add("Test3");
         al.add(null);
         al.add(null);
     /*    
         Iterator it = al.iterator();
         
         while (it.hasNext()) {
       	  System.out.println(it.next());
         }
         */
         /*
         for (int =0; i,=al.size()-1;i++) {
        	 System.out.println(al.get(i));
         }
         */
         for (String data : al) {
        	 System.out.println(data);
         }
         }
	}




