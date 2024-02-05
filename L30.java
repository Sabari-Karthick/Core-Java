import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class L30 {//MAP Interface
 	public static void main(String[] args) {
 		Map<String, String> m = new HashMap<String, String>();//Hash_map implements map
 		//We can also use the class hash_table()
 		//Hash_table is synchronized which means thread safe
 		m.put("password", "123");
 		m.put("name","alan");
 		
 		
 		Set<String> key = m.keySet();//Key should not be same if same the last will override the previous one
 		for(String i : key ) {//Key_set() give the set of keys
 			System.out.println(i +"-" +m.get(i));//Get() will get the value for that key
 		}
		
	}

}
