//import java.util.HashMap;
import java.util.WeakHashMap;

public class L30_Map2 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception  {
		//HashMap m = new  HashMap();
		
		WeakHashMap m = new  WeakHashMap();//not prefered_
		Temp t = new  Temp();
		m.put(t, "ab");
		System.out.println(m);
		t=null;//making as a garbage
		System.gc();//But here Hash_map won't allow GC to clean the garbage
		//HashMap would always Dominate the GC
		//To Clean the map we need to use Weak_Hashmap
		//Then the whole Entry is cleaned by the GC
		Thread.sleep(2000);
		System.out.println(m);
	}

}
class Temp{
	@Override
	public String toString() {
	return "temp";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Cleaning");
	}
}
