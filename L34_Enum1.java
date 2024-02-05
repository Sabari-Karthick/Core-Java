/**
 * @author _karthick
 * 
 * _Enums ->group of predefined constants whose value that do not change
 *        ->or our own defined data-type with  a range
 *        -> It can have constants , fields,methods,constructors
 *        ->can be also used with switch case
 * 
 *
 */
public class L34_Enum1 {
	enum Result{//by default the constants are public static final
		PASS,FAIL,ABSENT;
		//internally public  final static Gender Pass = new Result();//created in heap area
	}
public static void main(String[] args) {
	Result res = Result.PASS;
	System.out.println(res.ordinal());//ordinal gives the index
 
}
}
