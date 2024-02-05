/**
 * @author karthick
 * 
 * Where ever we need instance use we use anonymous object/class
 * Sometimes we can declare inner class without name such type of inner classes are called anonymous inner classes.
 *
 *
 *=> The main objective of anonymous inner classes is "just for instant use". 
 *=> There are 3 types of anonymous inner classes :
 *              ->1. Anonymous inner class that extends a class.
 *              -> 2. Anonymous inner class that implements an interface.
 *              -> 3. Anonymous inner class that defined inside method arguments.
 */
class PopCorm{
	void taste() {
		System.out.println("Spicy");
	}
}
public class L8_InnerClass4 {
public static void main(String[] args) {
	PopCorm p = new PopCorm() {//We are creating child class without name for the PopCorn class and for that child class we are creating an object with Parent PopCorn reference.
		@Override
		void taste() { //if you want  to extend a class just to overide then use AIC
           tastey();
		   System.out.println("salty");
		}
		void tastey() {
			   System.out.println("salty and spicy");
			}
	};
	p.taste();
//	p.tastey();//CE 
}
}
