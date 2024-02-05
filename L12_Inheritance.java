class X1 extends Object {//every class extends object class
X1()//private members are not participating in inheritance to ensure encapsulation
{
	System.out.println("I'm X");	
}
public static void  disp() {
	System.out.println("hi in parent static");
	
}
}
class Y1 extends X1{
    Y1()//whenever  we create the object of subclass it calls the constructor of super class
    {
    	//every constructor in java has a super method
    	//and it is the first line
		 System.out.println("I'm Y");	
 }
    // static method will  get inherited but it cannot be overridden but can be hidden
    public static void disp() {//if you try to override it is consider as a new method that is method hiding
    	System.out.println("hi in child static");
    }
   
}
class plane{
	void fly() {
		System.out.println("plane is flying at 1500 ft");
	}
	void takeOff() {
		System.out.println("plane takeoff");
	}
}
class PassengerPlane extends plane{
	
	void fly() {//Override method
	      System.out.println("plane is flying at 10000 ft");	
	}
	void carry() {//specialized method -> the one which present only in the child class
		System.out.println("Carries passenger");
	}
	//takeOff()-- inherited method 
}

public class L12_Inheritance {//constructor in  case of inheritance
	@SuppressWarnings("static-access")
	public static void main(String[] args) {//constructor will not be inherited it is called because of super method
		//Y1 obj = new Y1();
		//System.out.println(obj.hashCode());		
		X1 obj2 = new Y1();
		Y1 obj3 = new Y1();//creating object of child class is equal to creating sub of super class 
		obj2.disp();//Here the inherited method is executed because the static method is hidded
		obj3.disp();//here the method in child class is a specialized method 
		plane pp = new PassengerPlane();//Reference type of the object must be same as the object created
		//or it can be of parent type and creating parent type reference for child object is called up casting // this is for  polymorphism
		pp.fly();
		pp.takeOff();
		((PassengerPlane)pp).carry();//changing the behavior of parent to act  like child is called down casting// to access specialized methods
	}

}
