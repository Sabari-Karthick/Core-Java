//overriding->runtime polymorphism
//rules for overriding:
            //We cannot reduce visibility but we can increase
            //return type of overridded method must be same as the parent
            //but can be different if and only if the return type had a IS-A relationship
            //parameter passing must be same.
public class L13_Polymorphism {//overloading->Compile time polymorphism 
	public static void main(String[] args) {//It is good to achieve loose coupling/up casting to have polymorphism
		plane1 cp = new CargoPlane1();
		plane1 pp = new PassengerPlane1();
		Airport a  = new Airport();
		a.permit(pp);
		a.permit(cp);
		

	}

}
class plane1{
	void fly() {
		System.out.println("plane is flying at 1500 ft");
	}
	void takeOff() {
		System.out.println("plane takeoff");
	}
	void carry() {
		System.out.println("carry something");
	}
}
class PassengerPlane1 extends plane1{
	
	void fly() {
	      System.out.println("plane is flying at 10000 ft");	
	}
	void carry() {
		System.out.println("Carries passenger");
	}
	
}
class CargoPlane1 extends plane1{
	
	void fly() {
	      System.out.println("plane is flying at 5000 ft");	
	}
	void carry() {
		System.out.println("Carries cargo");
	}
	
}
class Airport {
	void permit(plane1 p) {
		p.fly();
		p.carry();
		p.takeOff();
	}
}