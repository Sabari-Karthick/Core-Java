//SAM(single abstract method)->functional interface
 //implementation :->anonymous inner class and Lambda Expression
//lambda expression can be used only with functional interface 
//@FunctionalInterface //adding to embed a info (to compiler and developer)that this is an functional interface and it should contain one method
//interface demo{
//	void disp();
//	//void print(); gives error
//}
//class alpha  implements demo{
//	public void disp() {
//		System.out.println("hello!! implemented");
//	}
//}public class L19_FunctionalInterface {
//	   public static void main(String[] args) 
//   {
//	demo d = new alpha();
//	d.disp();
//   }
//}
@FunctionalInterface
interface beta{
	void charlie();
}
public class L19_FunctionalInterface{
	public static void main(String[] args) {//anonymous inner class implementation of interface
		beta b = new beta () {//anonymous inner class can be used to implement both functional and non functional interface
			public void charlie() {
				System.out.println("beta interface is implemented");
			}
		};
		beta b1 = new beta() {
			@Override
			public void charlie() {
				System.out.println("charlie overrided");
				}
		};
		b.charlie();
		b1.charlie();
	}
}