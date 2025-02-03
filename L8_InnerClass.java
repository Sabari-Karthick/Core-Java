/**
 * @author karthick
 * Without existing one type of object if there is no chance of existing another type of object then we should go for inner classes.
 *        Example:University and Department->Tight coupling(Composition)
 * Without existing Map object there is no chance of existing Entry object hence "Entry" interface is define inside Map interface. Inner Interface
 * It is Has-A relationship.
 * Sometimes we can declare a class inside another class such type of classes are called inner classes.
 * $->refers to named inner class
 * Inside Inner class static boundry never come (no static is allowed) // No static members it is because the Inner class is assocaited with the Outer class so as the Members ,because it may cause an ambuitguity who owns the Member
 * There are: 
 * 1. Normal or Regular inner classes. ->named class inside another class without any modifier->Two class file will be generated
 * 2. Method Local inner classes. 
 * 3. Anonymous inner class. 
 * 4. static nested classes.
 * 
 * The applicable modifiers for outer classes are: 
 * 1. public 
 * 2. default 
 * 3. final 
 * 4. abstract 
 * 5. strictfp ->Java strictfp keyword ensures that you will get the same result on every platform if you perform operations in the floating-point variable. 
 * But for the inner classes in addition to this the following modifiers also allowed:
 *                     1.private 2.protected 3.static
 */
 class outer1{
	static int id=21;
	static String name="SK"; //These are compile time Constants
	void call() {
		inner1 i = new inner1();
		i.print();
	}
	class inner1{
		String name="Zack";//Within the inner class "this" always refers current inner class object.
		@SuppressWarnings("static-access")
		void print() {
			String name="no name";
			System.out.println("My Id:"+id);//=>From inner class we can access all members of outer class (both static and non- static, private and non private methods and variables) directly.
			System.out.println("hi im  inner:"+name);
			System.out.println("My name is :"+this.name);
		    System.out.println("My Outer name is :"+outer1.this.name);
		    //System.out.println("My Outer name is :"+outer1.name);//Since static it is possible
		}
	}
}
public class L8_InnerClass {//normal
public static void main(String[] args) {
   outer1 o = new outer1();
   o.call();
}
}
