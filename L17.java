final class X{//If a class is made as final it becomes un-inheritable
	final int  DATE;
	public X() {
		DATE=11;//Once you declare a variable as final it value becomes constant
	//	DATE=12;//final variables are resolved at compile time only 
		
	}
	public final void  show () {//If a method made as final it will inherit but  it cannot be overrided
		System.out.println("IN A");
	}
	
	
}
class Y /*extends X*/{
	public void  show() {
		System.out.println("IN B");
	}
}
public class L17 {//FINAL access modifier
public static void main(String[] args) {
	Y o1 =new Y();
	o1.show();
	
}
}
