/**
 * @author karthick
 * 
 * => Sometimes we can declare inner classes with static modifier such type of inner classes are called static nested classes. 
 * => In the case of normal or regular inner classes without existing outer class object there is no chance of existing inner class object. 
 *      ->i.e., inner class object is always strongly associated with outer class object. 
 * => But in the case of static nested class without existing outer class object there may be a chance of existing static nested class object. 
 *     ->i.e., static nested class object is not strongly associated with outer class object.
 * 
 * => Inside static nested classes we can declare static members including main() method also.
 * 
 *
 */

class outer {/// inner class demo
	int a;//but from static nested class we can access only static members of outer class.
	public void print() {
		System.out.println("hi i'm in outer class");
		//new inner().prints();
		}
		static class inner{//static nested class
		public void prints() {
			System.out.println("I'm inside  the inner class");
		}
		public static void show() {
			System.out.println("inside static inner class");
		}
	}
	
}
public class L8 {
public static void main(String[] args) {
	outer obj =new outer();
	obj.print();
	
	//outer.inner obj1 = obj.new inner();//to access inner class object we need to use outer class object 
	//new outer().new inner().prints();
//	outer.inner obj1 =new outer.inner();
//	obj1.prints();                     //if  the inner class is static use outer class name in constructor
 	new outer.inner().prints();
 	outer.inner.show();
 	
 }
}