//Interface-Blueprint of class 
// requirement specification and to achieve standardization
//Abstraction -->Hiding the actual implementation // with interface we can achieve 100% abstraction 
//Interface is a collection of public abstract methods
//we can extend one class and implement any interface-->not used normally
//interface can have a variable and they are """"public static final"""
//Difference between Abstract class and interface:
    //multiple inheritance is possible
    //in abstract class there is no need that all methods need to be abstract but here default is abstract
    //abstract class can have constructor  
interface calcuulator{
	void add();//by nature methods are public abstract//we cannot change access modifier
//From java 8:	
	default void method() {//with default keyword(by hard code) we can have method body (it is not access modifier)//it can be also override
		System.out.println("default method");
	}
	static void disp() {//we can also have static and private methods ->private methods can be only called by static and default method of interface 
		System.out.println("staic method");
	}
}
interface calcuulator2 extends calcuulator{//an interface can extends another interface but cannot implement another
	void sub();
}
//class calc0 implements calculator,calcuulator2{//multiple inheritance
class calc0 implements calcuulator2{
	
	public void  add () {
		
		System.out.println(1+2);
	}
	public void sub() {
		System.out.println(2-1);
		
	}
}
class calc11 implements calcuulator2{
	public void  add () {
		
		System.out.println(1+20);
	}
	public void sub() {
		System.out.println(20-1);
		
	}

}

class Xen{
	void permit(calcuulator2 calc) {
		calc.add();
		calc.sub();
		calc.method();
		calcuulator.disp();//static method can be called with interface name//they are object independent
		
	}
	
}

public class L18_Interface {
public static void main(String[] args) {
	calcuulator2 c1 = new calc0();//to achieve polumorphism
    calcuulator2 c2 = new calc11();
	Xen x = new Xen();
	x.permit(c1);
    x.permit(c2);
	
	
}
}
