package Collections;
//LinkedList
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo4 {

	public static void main(String[] args) {
   LinkedHashSet <String> hs = new LinkedHashSet();
		
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


