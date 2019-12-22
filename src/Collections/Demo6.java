package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo6 {
//Uniq value but it takes lated value if the key name has same
	public static void main(String[] args) {
		
		TreeMap <String , String> hm = new TreeMap<String, String>();
		hm.put("key3", "value1");
		hm.put("key1", "value1");
		hm.put("key2", "value2");
		//hm.put(null, "value3");
		hm.put("key1", "value4");
		//hm.put(null, "value5");

		for (Map.Entry<String, String>  data : hm.entrySet() ) {
			System.out.println(data.getKey());
			System.out.println(data.getValue());
		}
		}
}
