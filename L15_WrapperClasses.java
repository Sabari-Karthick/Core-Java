/**
 * Wrapper class
    ==========
--------->1. To wrap primitive into object form so that we can handle primitive also just like objects
 -------->2. To define several utility function which are required for primitives.
--------->3. Wrapper classes are a part of "java.lang" package.
 * 
 */
/// -->Almost every Wrapper class contains 2 constructors which takes
       //a. primitive type as the argument.
       //b. String type as the argument.
/**
 *  @author _Karthick
 *
 *    JVM will always call toString() when we try to print any reference variable.
 *       reference variable can be
        a. inbuilt class
        b. user defined class 
 *
 *   Object class toString()-->returns the reference(address/hashCodeValue) of the object
 *   String class toString()-->returns the data present in the Object
 *   
 *   In Wrapper classes the toString() is override to print the value that is in the object
 */
public class L15_WrapperClasses {
@SuppressWarnings("removal")
public static void main(String[] args) {
	Integer i1 = new Integer(10);//10
	System.out.println(i1);//jvm calls i1.toString()
	Integer i2 = new Integer("10");//10
	System.out.println(i2);//jvm calls i1.toString()
	System.out.println(i1.equals(i2));//calls equals which compare the content
	//Integer i2 = new Integer("ten");//NumberFormatException__A checked Exception
	//If the String input is not properly formatted,mean if it is not representing any number then we will get an Exception called "NumberFormatException"
	
	
	/*
	 * 
	 * Character class contains only constructor which can take only primitive
argument of type char only.
	 * 
	 * ***char -> Character(1 constructor)//take only  a char
	 * 
	 * 
	 */
	Character c1=new Character('a');
	System.out.println(c1);//a
	//Character c2=new Character(97);//CE
	//Character c1=new Character("a");//Compile Time Error.
	
	/*
	 * 
	 * ***boolean -> Boolean(2 constructor(String is important))
	 * 
	 * If we are passing String argument, then case is not important and content is
important.
	 * 
	 * if the content is case insensitive(irrespective of case) String of true then it is treated as
true and in all other cases it is false.
	 * 
	 */
	
	Boolean b=new Boolean(true);
	System.out.println(b);//true
	Boolean b1=new Boolean(false);
	System.out.println(b1);//false
	
	//Boolean b=new Boolean(True);//CE//if not the string case is important
	//Boolean b=new Boolean(False);//CE
	
	
	Boolean b3=new Boolean("false");//if string ->case is not important only the content
	System.out.println(b3);//false
	Boolean b2=new Boolean("False");
	System.out.println(b2);//false
	Boolean b5=new Boolean("True");
	System.out.println(b5);//true
	//Boolean b6=new Boolean(1);//-->CE
	Boolean b7=new Boolean("yes");//--> if string argument is true of any case it is true else for anything it is false
	System.out.println(b7);//false
	Boolean b8=new Boolean("no");
	System.out.println(b8);//false
	Boolean b11=new Boolean("tRuE");
	System.out.println(b11);//true
	Boolean b12=new Boolean("TrUe");
	System.out.println(b12);//true
	
}
}
