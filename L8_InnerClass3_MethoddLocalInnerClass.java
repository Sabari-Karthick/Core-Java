/**
 * @author karthick
 * 
 * => Sometimes we can declare a class inside a method such type of inner classes are called method local inner classes. 
 * => The main objective of method local inner class is to define method specific repeatedly required functionality. 
 * => Method Local inner classes are best suitable to meet nested method requirement. 
 * => We can access method local inner class only within the method where we declared it. That is from outside of the method we can't access. As the scope of method local inner classes is very less, this type of inner classes are most rarely used type of inner classes.
 *  
 * The only applicable modifiers for method local inner classes are: (Made fot Scoping and Lifecycle resolution)
 *                 ->1. final 2. abstract 3. strictfp
 *
 */
class outer02{

	static int z=10;
	public void perform() {
		int k=30;
	class inner02 //The Scope is already within the method so no point in making public,priate and static and all
	{//static is not permitted
		public void sum(int x,int y){
			System.out.println("the value in outer is"+z);
			System.out.println("Th k is:"+k);
			System.out.println("The sum is ::"+(x+y));
			}
	}
	inner02 i =new inner02();//the class scope is only within the method
	i.sum(5, 5);
	;;;;;;;
	;;;;;;;
	;;;;;;;
	i.sum(5, 6);
	;;;;;;;
	;;;;;;;
	i.sum(5, 7);
	}
}

public class L8_InnerClass3_MethoddLocalInnerClass {//method local inner classes.
public static void main(String[] args) {
	new outer02().perform();
	
	
}
}
