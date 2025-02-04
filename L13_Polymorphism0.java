class A{
	public void show() {
		System.out.println("A");
	}
}

class B extends A{
	public void show() {
		System.out.println("B");
	}
	//public void print() {
		//System.out.println("Bb");
	//}
}
class C extends A{
	public void show() {
		System.out.println("C");//changing the object change the object calling is called DMD
	}
}

public class L13_Polymorphism0 {
	public static void main(String[] args) {
		// here it is runtime _polymorphism 
/*it will link at runtime	*/	
		A o1 =new B();// Here A is just a reference and B is the implementation ; object of B
		o1.show();//will execute B//which show need to be executed is decided at runtime because object b is assigned at runtime only
		//o1.print();it shows error because A do not know about B
		
		o1 = new C();//first b is executed and object C is called so C will be printed "A is a Reference"
		o1.show();
		//by changing object the method needs to be called is changed 
		//so it is called dynamic method dispatch
		//DMD is achieved by runtime _polymorphism 
	}

}
