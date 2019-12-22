package Collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Demo5 {

	public static void main(String[] args) {
		 TreeSet <String> hs = new TreeSet();
			
	        hs.add("xyz");
			hs.add("abs");
			hs.add("cds");
			hs.add(null);
			hs.add(null);
			
			for (String s: hs) {
				System.out.println(s);
			}
		}
	}


