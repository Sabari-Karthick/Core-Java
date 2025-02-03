/**
 * @author karthick
 */
class A01{
	class B01{
		class C01{
			void m1() {
				System.out.println("in c inner");
			}
		}
	}
}
public class L8_InnerClass2_NestedInnerClass {//nested inner class
public static void main(String[] args) {
	new A01().new B01().new C01().m1();
}
}
