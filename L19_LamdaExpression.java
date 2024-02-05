interface Computer{//Lambda Expression it is an anonymous method which is used to implement functional interface
	void showName(String s,int i);
}
interface cost{
	void showPrice(int cost);
}
interface addi{
	int add(int x,int y);
}
//class Laptop implements Computer//by traditional method
//{
//   public void showName() {
//	   System.out.println("Msi Bravo 15");
//   }
//}
public class L19_LamdaExpression {
	public static void main(String[] args) {
//		Computer c = new Laptop();
//		c.showName();
//		Computer c = new Computer() {//by anonymous inner class
//			
//			@Override
//			public void showName() {
//				
//				   System.out.println("In Inner:Msi Bravo 15 ");
//			}
//		};
		//syntax:
		    //referenceType reference = (parameter)->{//code to execute};
		Computer c1 = (s,x)->System.out.println("Lambda Msi " +s+x);//if multiple statements curly braces are compulsory
		c1.showName("Bravo ",15);//by lambda expression
		
		addi a = (x,y)->x+y;//return statement is not needed
		System.out.println("the addition:"+a.add(9, 1 ));
		
		
		cost c = x->System.out.println("the price is:"+x);//if only one variable is present round brackets are optional
		c.showPrice(53400);
		
		
	}

}
