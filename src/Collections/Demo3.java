package Collections;

import java.util.HashSet;

public class Demo3 {

	public static void main(String[] args) {

		HashSet <String> hs = new HashSet();
        hs.add("xyz");

		hs.add("abs");
		hs.add("abs");
		hs.add(null);
		hs.add(null);
		
		for (String s: hs) {
			System.out.println(s);
		}
	}

}
