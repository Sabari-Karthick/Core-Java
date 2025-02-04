class students{
	int id;//static are same for all objects, ie it is Class Specific not Object Specific.
	int std;
static	String school;//execute before constructor
//we can't create static variable inside function scope
//static variable are only used in class level
static {//when class loaded //only static variables can be accessed inside static block/method
	school ="VNUAPT";//it execute only once irrespective of how many objects created because it is static
}
{//non static blocks used  to  be called every_time the class is created
//used when some important operation need to be performed during object creation
	System.out.println("im a non static block");
}
students(){//when object is created 
	id=5;
	std=10;
}
students(int x,int y){
	id=x;
	std=y;
}
//execution order:
   //->static variable
   //->static block
   //->non static block
   //->constructor

	public void print()
{
		System.out.println("id:"+id+" std:"+std+":"+school);
}

}
public class L9_Static {
public static void main(String[] args) {//static methods don't need object
	students sk =new students();
	students zack =new students(2,4);
	
	sk.print();
	
	zack.print();
	
	
}
}
