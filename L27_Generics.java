

/**
 * @author _karthick
 * 
 * Type Safety ->We can ensure what type of data is store in the dataStructure and type casting is not required while retrieving
 * Collection are not Type-Safety and type-casting is required and it may lead to ClassCastException So Generic is used to resolve it 
 * 
 * 
 * Main Objective of Generic is to ensure Type-Safety and Type-Casting Problem
 * 
 * We can bound the type parameter for a particular range by using extends keyword such types are called bounded types.
 * We can't define bounded types by using implements and super keyword
 * 
 * class Test <T extends Number&Runnable> {}//valid(first class and then interface)
 */
class Gen<T>{
	T obj;
	Gen(T obj){
		this.obj=obj;
	}
	public void show() {
		System.out.println(obj.getClass().getName());
	}
	public T get() {
		return obj;
	}
}
public class L27_Generics {//Working of Generic
	public static void main(String[] args) {
		
   Gen<Integer> g = new Gen<Integer>(10);
   print(g);

	}
	public static void print(Gen<?> g) {//Generic Method with Wild_card pattern and this is useful only for reading purpose and for writing we can only add null
	//In-case  of method level super,extends is allowed
		g.show();

		   System.out.println(g.get());
	}

}
