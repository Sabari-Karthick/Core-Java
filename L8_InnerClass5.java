/**
 * @author karthick
 * When we use lambda expression,code would be compact and no .class file for lambda expression.
 * 
 *
 * But anonymous inner class can implement only one interface at a time.
 * But anonymous inner class can extends a class or can implements an interface but not both simultaneously.
 * But in anonymous inner class we can't write constructor because anonymous inner class not having any name of the class.
 * 
 */
public class L8_InnerClass5 {
public static void main(String[] args) {
	new Thread(
			()->{
				for(int i=0;i<3;i++) {
					System.out.println("Child Thread");
				}
			}
			
			
			).start();
	/************Anonymous Class Passed as Argument******************/

}
}
