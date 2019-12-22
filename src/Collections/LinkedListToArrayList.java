package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListToArrayList {

	public static void main(String[] args) {

		LinkedList <String>  ls = new LinkedList<String>();
		ls.add("Value1");
		ls.add("Value2");
		ls.add("Value2");
		ls.add("Value3");
		ls.add("Value2");
		
		
System.out.println("before coverting the linkeddlist");
for (String newvalue : ls)		{
	System.out.println(newvalue);
}



ArrayList <String> list = new ArrayList<String>(ls);
System.out.println("After coverting the HashSetList");



for (String newvalue1 : list)		{
	System.out.println(newvalue1);
}
}

}
