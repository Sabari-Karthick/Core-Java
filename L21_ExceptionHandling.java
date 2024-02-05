import java.util.Scanner;

//CompileType Error -> improper use of language // wrong Syntax
//Runtime 
       //-> runtime error : faulty logic
       //Exception : faulty input at runtime ->Exception is something that causes abnormal termination of program at runtime
     //the method in which the exception occurs create an exception object and send it to the JVm and JVm gives it to user defined exception handler           
   //Exception Object is getting thrown to the caller
public class L21_ExceptionHandling 
{
   public static void main(String[] args)
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Divident:");
	int divident = sc.nextInt();
	System.out.println("Enter the Divisor");
	int divisor = sc.nextInt();
	try//put the  statements that may  cause exception //try and catch are the user defined exception handler
	{
		int result =divident/divisor;// it will throw the exception
		System.out.println("the result is :"+result);
	}
	
	catch (Exception e) //catch will execute iff only some code throw some exception
	{//Exception is parent of all exception // 
		System.out.println("wrong dividor");
	}
   finally 
   {
	System.out.println("thank you");
   }
	
	sc.close();
   }
}
