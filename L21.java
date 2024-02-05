//unchecked exception
public class L21 {//exception handling
    //multiple catch blocks
	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {	//try block to put critical statement
		int b[]=null;
			b[7]=10;
			int a[]=new  int [6];
			a[6]=7;
			
			System.out.println(8/4);
			int x=5/0;//throw object of exception
			System.out.println(x);
		}
		catch(NullPointerException e) {//accessing null object
			System.out.println("create it first");
			 
		}
		catch (ArithmeticException/*|ArrayIndexOutOfBoundsException*/ e) {//we can also use arithmetic(subclass of "exception")
			//catch object of exception
			System.out.println("cannot divide by zero");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("don't exceed the border..");
		}
		catch (Exception e) {//always use last catch as exception only for unknown exceptions
			
			System.out.println("wrong");
		}
		finally {//it executed even if there is exception or not
			
	
		System.out.println("stop");
	
		}
	}

}
