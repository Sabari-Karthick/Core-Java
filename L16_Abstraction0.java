class Printer {
	/*
	 * public void show(Integer i) {
	 * System.out.println(i);
	 * }//Here both integer and double extends the abstract class number
	 * public void show(Double i) {
	 * System.out.println(i);
	 * }
	 */
	public void show(Number i) {
		System.out.println(i);
	}
}

abstract class writer {
	public abstract void material();
}

class pen extends writer {
	public void material() {
		System.out.println("Ink");

	}

}

class pencil extends writer {
	public void material() {
		System.out.println("Graphite");

	}

}

class tool {
	public void print(writer p) {
		p.material();

	}
}

public class L16_Abstraction0 {// need of abstract class->don't want anyone to crate object of abstract class
	// instead of of using two methods we can use one method to accept all subclass
	// object
	public static void main(String[] args) {
		// Printer o1 = new Printer();
		// o1.show(5.8);
		writer p1 = new pen();
		writer p2 = new pencil();
		// p1.material();
		// p2.material();
		tool t = new tool();
		t.print(p1);
		t.print(p2);
	}

}
/*
 * //-> if a class is abstract you cannot make objects of that class
 * //->someone in future extends the abstract class and use it
 * abstract class animal
 * {
 * //->you can only declare method with abstract keyword
 * //->if the method is abstract the class also needs to be abstract
 * public abstract void eat() ;
 * 
 * 
 * public void run() {
 * 
 * }
 * }
 * 
 * class dog extends animal {//concrete class --> a concrete class is a class
 * that can be instantiated, or used to create objects, with the new keyword.
 * public void eat() {//when we extends a abstract class it is compulsory to
 * define the method of the abstract class
 * 
 * }
 * }
 * 
 * 
 * 
 * public class L16 {//Abstract keyword
 * public static void main(String[] args) {
 * //animal dog =new animal();//objects cannot be created
 * //to create a object use the abstract class reference and subclass object
 * animal Dane = new dog();
 * 
 * }
 * 
 * }
 */
