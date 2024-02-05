import java.util.Scanner;

class calc12{//Try and catch / Exception handling flow by JVM
	public void division() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Divident:");
		int divident = sc.nextInt();
		System.out.println("Enter the Divisor");
		int divisor = sc.nextInt();
		int result =divident/divisor;// it will throw the exeption
		System.out.println("the result is :"+result);//Then JVM check for the method in the method in which is exception is created for handling 
		//if not then it will check for the method from which it is called so we can write try and catch block there is also which is not suggested
        //and So on... --->//But we can create try in one method and catch in another method they should present in the same method
//		try
//		{
//			
//		}
//		catch (ArithmeticException e) {
//			System.out.println("Invalid Divisor");
//		}
//		finally {
//			System.out.println("end");
//		}
		sc.close();
	}
}
class demo8{
	public void create() {
		calc12 c = new calc12();
		try {
			
		
		c.division();

		}
		catch (Exception e) {
			System.out.println("Cannot perform Division");
		}
		finally {
			System.out.println("get out");
		}
		}
}
public class L21_ExceptionHandling1 {
	public static void main(String[] args) {
		demo8 d = new demo8();
		d.create();
	}

}
