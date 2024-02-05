//TYPES OF INTERFACES
//1.NORMAL//MORE THAN ONE METHOD
//2.SINGLE ABSTRACT METHOD(SAM)-FUNCTIONAL INTERFACE-> WE CAN USE LAMDA EXPRESSION
//3.MARKER INTERFACE//IT DOESM'T HAVE ANY METHOD//empty interface

//If an class implements Marker interface, then that class "object" will get additional functionality at the runtime by the JVM
/*class _aa{// INTERFACES 
	public void show() {
		System.out.println("_hi");
		
	}
}
public class L19 {//reasons to use interface//anonymous class
	//for generalization
	public static void main(String[] _args) {
		_aa o1=new _aa() {//is it to use the class for only one time(for like override)we can go for anonymous class
			public void show() {
				System.out.println("bye");
			}
		};
		o1.show();
		}
}*/
 public class L19{//using interface with anonymous class//we know that we cannot create object of interface so instead of creating separate class we use anonymous class to save some memory
	public static void main(String[] args) {
	/*	some e=new some() {//anonymous class
			
			@Override
			public void _printf() {
				// TODO Auto-generated method stub
				System.out.println("_hi");
			}
		};
		e.printf();
		*/
		some e=()->{//LAMDA EXPRESSION
			System.out.println("hi");
		};
		e.printf();
		some.show();
		some x =new aabb();
		x.shows();
		}
}
 @FunctionalInterface
 interface some{
	 int i=9;//IF A VARIABLE IS DECLARED IN AN INTERFACE IT BECOME A FINAL VARIABLE(CONSTANT)
	 void printf();
	 static void show() {//IN INTERFACE WE CAN HAVE STATIC METHODS
		 System.out.println("static method");
	 }
	 default void shows() {//IN INTERFACE WE CAN HAVE STATIC METHODS 
		 System.out.println("default method");
	 }
 }
 interface same{
	 default void shows() {//IN INTERFACE WE CAN HAVE STATIC METHODS
		 System.out.println("default  same  method");
	 }
 }
 class aabb implements some,same{
	 public void printf() {
		 System.out.println("in aab");
		
	}
	@Override
	public void shows() {
		// TODO Auto-generated method stub
		same.super.shows();
		some.super.shows();
		}
	 
 }
