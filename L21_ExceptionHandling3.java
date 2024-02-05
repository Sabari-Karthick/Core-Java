

class calcx//in ducking and re throwing we throw the exception to the caller
{//we need to mention "throws" keyword when we duck and re throw
  void calculate() throws Exception {
	  try {
		  

	  System.out.println(100/0);
  
	  }
	  catch (ArithmeticException e) {
		System.out.println("handled here in division");
		//System.exit(0);-->finally cannot dominate this
		throw e;//here exception is handled and re throwing it
		//lines below the throw keyword/ after catch block won't executed
	
	}
	  finally {//this will get executed at any cost
		
		  System.out.println("thanks");//is used to close the resources or important code -->Resources__FileReader,BufferedReader ,JDBC Operation         
	//in case of return present in try block __finally block dominate return statement so both statements in try and finally will get executed 
	  }
	
	  }
}
public class L21_ExceptionHandling3 {
public static void main(String[] args) {
  
	calcx calc = new calcx();
	try
	{
		
		calc.calculate();
	}

	catch (Exception e) {
//		e.getMessage();  -->to get the info about the exception
//		e.toString();
//		e.printStackTrace();
     System.out.println("handled in main method");
	}
	
}
}
