class calc{//Super
	calc()
	{
		System.out.println("add");
	}
	public int add(int x,int y) {
		return x+y;
	}
} 
class calc1 extends calc{//subclass //if the sub class and the super class have same method name the sub class method overrides the super class method
	 calc1(){              //so if we need to call the super class method from sub class use: super.<METHOD NAME>
		System.out.println("sub");
	}
	calc1(int i){
		
		System.out.println("subtract");
	}
	
	public int sub(int x,int y) {
		return x-y;                             //here multilevel inheritance 
	}
}
class calc2 extends calc1{//subclass
	calc2(){// super is keyword to mention the super class
		super();//every constructor in the sub class has a super method by default
		System.out.println("mult");
	}
	
	calc2(int i){
		super(i);//by default it has no arguments so default constructor of super class is called
		System.out.println("multiply");
	}
	public int mul(int x,int y) {//IS-CLASS a class that extends another class
		return x*y;                                //java doesn't support multiple inheritance
	}
	
}


public class L12_Inheritance0 {// inheritance
	public static void main(String[] args) {
		calc2 n1=new calc2(2);//when a constructor is called without argument the constructor and its super class constructors without parameters are called
		//System.out.println(n1.add(4, 5));//HAS-A a class that creates class of another class
		//System.out.println(n1.sub(4, 5));
		System.out.println(n1.mul(4, 5));
	}

}
