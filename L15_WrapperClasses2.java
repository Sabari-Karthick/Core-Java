/**
 *@author _karthick
 *
 *valueOf() -> To convert String/primitive to Wrapper Object
 *xxxxValue() -> To convert Wrapper to primitive type.
 *
 *Since JDK 1.5
 *
 *Automatic conversion of primitive type to wrapper type done by the compiler is called "AutoBoxing".
 *
 *Automatic conversion of wrapper type to primitive type done by the compiler is called "AutoUnBoxing".
 *
 *Example:
 *	Integer i= 10;//compiler automatically call the valueOf() method-->AutoBoxing 
 *	_int j=i;//compiler call intValue()//AutoUnboxing
 *
 *
 */
public class L15_WrapperClasses2 {//autoBoxing and auto un_boxing
	static Integer I=10;//AutoBoxing(valueOf())
	//Static Integer I = null; object is not created if we try to call a method it will show nullPointException 
public static void main(String[] args) {
	int i=I;//AutoUnBoxing(intValue())
	System.out.println(i);//10

	/**
	 * Immutable Object -> String,all wrapper classes
	 * (if we try to make a change, then with the change new object will be created)
	 * 
	 * 
	 */
	
	//Note:
		//-->byte,short,_int,long,float,double the buffer concept which internally JVM maintains is "byte range only".
		//character -> 0 to 127
		//Boolean -> always(true or false)
	Integer x=10;//when new keyword is not used JVM will create a buffer in byte Range (byte because of memory constraint)
	Integer y=10;//here 10 is already available in buffer so it will be reused//buffer is maintained in heap
	System.out.println(x==y);//true
	Integer x1=100;
	Integer y1=100;
	System.out.println(x1==y1);//true
	Integer x2=1000;//it is out of range so new object will be created for  both
	Integer y2=1000;
	System.out.println(x2==y2);//false
	
}
}
