/**
 * @author karthick
 *
 *         The need of wrapper class is to wrap primitives into objects,so that
 *         we can handle primitives also like the objects
 *
 *         char-> Character(char) boolean->Boolean(boolean,String) Note: In all
 *         wrapper class toString() is override to return the content
 *
 *
 *         Note: equals() method is also override in all Wrapper class to
 *         compare the content.
 *
 *
 *
 *
 *
 *
 */
public class L15_WrapperClasses1 {
	public static void main(String[] args) {

		/**
		 * Usage of Wrapper class ---------------------------
		 *  utility method(helper methods/static methods) 
		 * 1.valueOf()
		 * 2.XXXXValue() //XXX->Data Type
		 * 3.parseXXX() 
		 * 4.toString()
		 * 
		 */

		/**valueOf():
		 * signature:
		 *  public static wrapper valueOf(primitive data)
		 *  public static wrapper valueOf(String data)
		 * valueOf()--->It is used to create wrapper object for the given primitive or
		 * String type of data. It is alternative to constructor,but good practice is to
		 * use valueOf() only. new keyword is a costly way of use
		 * 
		 */
		//Integer i = Integer.valueOf("130");
		Integer i = Integer.valueOf(130);
		Character c = Character.valueOf('a');
		Boolean b = Boolean.valueOf("hello");
		//Boolean b = Boolean.valueOf(true);
		System.out.println("Using valueOf():" + i+" char:"+c+" Bool:"+b);// 10____ using valueOf()
        
		
        /**XXXXValue():
         *    We can use xxxxValue() to convert wrapper to primitive type.
         * 
         * 
         * 
         * 
         */
	
	   System.out.println("Value() method:"+i.byteValue()+" "+i.longValue()+" "+i.doubleValue()+" "+i.floatValue());
	   System.out.println("Value() method:"+c.charValue()+" "+b.booleanValue());
	    
	 /**
	  * 3.parseXXX():
	  * Every wrapper class except Character class Contains parseXXXX() to convert String to Corresponding primitive type.
	  * signature: public static XXXX parseXXX(String data)
	  * 
	  * 
	  * 
	  */
	  String s1 = new String("10");
	 
	  String s2 = new String("tRue");
	  i=Integer.parseInt(s1);
	  b = Boolean.parseBoolean(s2);
	  System.out.println("ParseXXX:"+s1+" "+s2);
	  
	  /**
	   * 
	   * toString():
	   * We can use toString() to convert wrapper object/primitive data to String. 
	   * signature: public static String toString(Wrapper data)
	   * public static String toString(	primitive data)
	   * 
	   */
	  
	  String s3 = Integer.toString(i);//10 in string format
	  String s4 = Boolean.toString(true);//true in string format
	  String s5 = Character.toString('a');
	  System.out.println("toString :"+s3+" "+s4+" "+s5);
	  System.out.println(i.toString());
	  
	  
	  
	
	}
}
