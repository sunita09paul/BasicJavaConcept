package Collections;

import java.util.Iterator;
import java.util.LinkedList;

//Linked List
public class Demo2 {

	public static void main(String[] args) {
        LinkedList <String> li = new LinkedList<String>();
        li.add("Test1");
        li.add("Test2");
        Iterator it = li.iterator();
        System.out.println(it.next());
        
	}

}
