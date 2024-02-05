import java.util.HashMap;
import java.util.IdentityHashMap;

public class L30_Map1 {
	@SuppressWarnings({ "rawtypes", "unchecked", "removal" })
public static void main(String[] args) {
	HashMap m = new  HashMap();
	m.put(null, 2);
	m.put(null, null);//null insertion is happening and it is not duplication it is updation_
	m.put(null," ABCD");
	System.out.println(m);	
	//In Linked HashMap the order is preserved
	HashMap map = new  HashMap();
    Integer i1 = new Integer(10);
    Integer i2 = new Integer(10);
    
    map.put(i1, "sachin");
    map.put(i2, "Messi");//i1.equals_to(i2)-->true 
    System.out.println(map);//JVM uses equals_to method to check whether the key is duplicated or not
    //Identity_Hashmap is used to store duplicate key
                  //->JVM calls == operator to check  keys are duplicated or not
    IdentityHashMap i = new IdentityHashMap();//not _prefered
    i.put(i1, "sachin");
    i.put(i2, "Messi");//i1==i2  ->false ||Reference is compared
	System.out.println(i);
	
	
	
	
}
}
