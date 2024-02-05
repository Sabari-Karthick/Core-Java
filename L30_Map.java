import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Set;

/**
 * @author _karthick
 * 
 * Map -> a interface used to store data as Key Value pairs
 * Collection is just one data so Map is not a part of Collection
 * Internal data structure is hashtable_(using hashing function):
 *              -->so no duplicate key is allowed and key is used to retrieve data by hash_table
 * Key-value pair is called as "Entry". Entry is a interface inside map interface
 * 
 * Insertion order is not preserved because of using hashing function
 *  
 * 
 * 
 *
 */
public class L30_Map {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashMap m =new HashMap();
		m.put(18, "kohli");
		m.put(17, "ABD"); 
		m.put(7, "Dhoni");
		HashMap<Integer,String> l = new  HashMap();
		l.putAll(m);
		System.out.println(m);//toString Method is called internally
		Set s = m.keySet();
		System.out.println(s);
		System.out.println(s.getClass().getName());//to get implementation class name
		Collection c = m.values();
		System.out.println(c);
		Set entry=m.entrySet();
		System.out.println(entry);
//		for (Entry Entry : l.entrySet()) {//entry is both key and value .//entrySet() have all entries in map
//			System.out.println(Entry.getKey()+"->  "+Entry.getValue());
//		Not recommended
//		}	
		System.out.println("*****************************************");
		Iterator itr=entry.iterator();//While using iterator we need to typeCast
		while(itr.hasNext()) {
			Map.Entry data =(Map.Entry)itr.next();
			System.out.println("The key is:"+data.getKey()+" and The Value is:"+data.getValue());
			if(data.getKey().equals(7)) {
				data.setValue("Thala Dhoni");
			}
		}
		System.out.println(m);
	}

}
