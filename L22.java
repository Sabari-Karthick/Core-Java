import java.io.BufferedReader;
import java.io.InputStreamReader;//any classes that comes with IO are resources //we need to close the resources

public class L22 {//checked exception|finally block
	public static void main(String[] args) throws Exception
	{ //only runtime and sub class exceptions are unchecked
		System.out.println("enter a number:");
//		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
//		int n=Integer.parseInt(b.readLine());
//		System.out.println(n);
		//finally block always close the resources
		//here there is code redundancy because we need to close the resources manually in the finally block
		 
		  try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)) ){
			int   n= Integer.parseInt(br.readLine());//try with resource
			System.out.println(n);//finally block becomes dummy if we use "try with Resource".
		  }
		   
		   
	}

}

/*Resources -->FileReader,BufferredReader,Writer,JDBC Operations
 * boilerplate -> the code which is repeated in multiple modules of project with no
change or with small change.
whenever boiler plate code comes into picture, we always try
to avoid it by using

a. using JDK software higher version(jdk1.0,jdk1.2,......

jdk18)

b. using 3rd party API's
 * 
 *   In JDK1.7 version they made few enhancement in the Excpetion handling area
=======================================================
1. try with resource
2. try with multiple catch block
try with resource
============
Syntax: try(R){

use resource as per the  application requirement
if exception occurs or not occurs and if it is handled or

not handled

still Resources will be closed once the control comes out

of try block

}catch(XXXX e){
}
 * 
 * 
 * Advantage of try with resources:
 *     --> the resources part of try block will automatically get closed
 *     
 * once the control comes of out try block automatically that resource will be
closed.
while try block is getting executed

a. exception occur and handled
b. exception occur and not handled

In both these cases also JVM will close the resource automatically, if we
use resource with "try with resource".
2. Using try with resource increases readability and reduces redundant code in our
application.
 * 
 * 
 * we can declare any no of resources ,but all the resources should be separated
with ; symbol.

try(R1;R2;R3; ........){
}catch(XXXXX e){
}
 * 
 * Classes implementing auto close interface is allowed to use with try with resources
 * All java.io , java.sql implements auto close interface
 * the reference variables used in try block are made final and can not be reassigned to another refernce
 * 
 * 
 * 
 */
