/*abstract*/ interface writers{//we can extend one class and implement interfaces(instead of multiple inheritance)
	void wrote();
}
class marker implements writers{
	public void wrote() {
		System.out.println("I am a marker");
	}
}

class kit{
	public void device(writers p) {
		p.wrote();
	}
}
public class L18 {//INTERFACE->we can have all methods abstract,in interface all methods public abstract//we can implement multiple inheritance
	public static void main(String[] args) {//we can achieve multiple inheritance 
		writers p1=new marker();//we cannot create object of interface//we can create references
		kit k=new kit();
		k.device(p1);
		//Interface is a collection of public abstract methods
		//we can extend another interface
		//J8 have default and static methods
		//J9 have private methods in an interface
	}

}
