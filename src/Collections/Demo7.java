package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo7 {

	public static void main(String[] args) {

		LinkedHashMap <String , String> hm = new LinkedHashMap<String, String>();
		hm.put("xyz", "value1");
		hm.put("key2", "value2");
		hm.put(null, "value3");
		hm.put("abc", "value4");
	//	hm.put(null, "value5");

		for (Map.Entry<String, String>  data : hm.entrySet() ) {
			System.out.println(data.getKey());
			System.out.println(data.getValue());
		}
			
		
	}

}
