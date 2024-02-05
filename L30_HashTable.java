import java.util.Hashtable;

public class L30_HashTable {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
	Hashtable hm = new Hashtable();//Default capacity is 11
	hm.put(new Temp5(5),"A");
	hm.put(new Temp5(2),"B");
	hm.put(new Temp5(6),"C");
	hm.put(new Temp5(15),"D");
	hm.put(new Temp5(23),"E");
	hm.put(new Temp5(16),"f");
	System.out.println(hm);
	}
	}
	class Temp5
	{
	int i;
	Temp5(int i){
	this.i=i;
	}
	public int hashCode(){//
	return i;
	}
	public String toString(){
	return i+" " ;
	}
	}