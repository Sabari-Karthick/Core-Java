import java.util.*;
//class defines the structure of object and working of object
//object know something(variables) and work something(method)
//constructor is member method//invoked when  object is created
//same name as class 
//never return anything
//used to allocate memory
//if no constructor is defined JVM defines a default constructor
public class L7{//class demo(constructors)
	public static void main(String[] args) {// static means same for all object
	//every class is a child of object class	
	//so every constructor the first line is a super method
	Scanner sc =new Scanner(System.in);
	shop sh =new shop();
	System.out.println(sh.porkPPK);
	
	
	shop svk =new shop(100,850,1500);
	System.out.println("In Sivakasi");
    System.out.println("Chicken Per kg:");
	System.out.println(" rs:"+svk.chickekenPPK);
	
	 System.out.println("Pork Per kg:");
		System.out.println(" rs:"+svk.porkPPK);
		
		
		 System.out.println("Lamb Per kg:");
			System.out.println(" rs:"+svk.lambPPK);
			
			
			
			
			shop vir =new shop(90,950,1600);
			System.out.println("In Virdhunagr: ");
		    System.out.println("Chicken Per kg:");
			System.out.println(" rs:"+vir.chickekenPPK);
			
			
		System.out.println("What do you want?\n1.Lamb\n2.Chicken\n3.Pork");
		
	
	sc.close();
	sc.close();
	}
}
	
class shop{
    double porkPPK;
	double chickekenPPK;
	double lambPPK;                            //this keyword to specify instance 
	double porkSPM;
	double chickenSPM;
	double lambSPM;
	
	shop(){
		
	}
	
 	shop(double c,double l,double p){
		porkPPK =p;
		chickekenPPK=c;
		lambPPK=l;
		
}
	
	
	
	
	
	
	
	
	
	
	
	
}
