/**
 * @author karthick
 * 
 * => Sometimes we can declare inner classes with static modifier ,such type of inner classes are called static nested classes. 
 * => In the case of normal or regular inner classes without existing outer class object there is no chance of existing inner class object. 
 *      ->i.e., inner class object is always strongly associated with outer class object. 
 * => But in the case of static nested class without existing outer class object there may be a chance of existing static nested class object. 
 *     ->i.e., static nested class object is not strongly associated with outer class object.
 * 
 * => Inside static nested classes we can declare static members including main() method also.
 * 
 *
 */

class Outer {/// inner class demo
	int a;// but from static nested class we can access only static members of outer
			// class.

	public void print() {
		System.out.println("hi i'm in outer class");
		// new inner().prints();
	}

	static class Inner {// static nested class , Without Static the inner class is strongly associated with the outer class and can't be used Seperatly.
		public void prints() {
			System.out.println("I'm inside  the inner class");
		}

		public static void show() {
			System.out.println("inside static inner class");
		}
	}

}

public class L8_InnerClassDemo {
	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.print();

		// Outer.inner obj1 = obj.new inner();//to access inner class object we need to
		// use outer class object
		// new Outer().new inner().prints();
		// Outer.inner obj1 =new Outer.inner();
		// obj1.prints(); 
		new Outer.Inner().prints();//if the inner class is static use Outer class name in constructor
		Outer.Inner.show();

	}
}