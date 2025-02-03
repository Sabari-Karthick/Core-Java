
//if you want to use the implementation once it is good to  use anonymous inner class

class mobile {
	void printConfid() {
		System.out.println("SD 888,Sony IMX 686,5000mah");
	}
}

// class xiomi extends mobile{
// void printConfid() {
// System.out.println("SD 8 GEN 1+ ,Sony IMX 686,6000mah");
// }
// }
public class L8_AnonymousInnerClasss {
	public static void main(String[] args) {
		mobile m1 = new mobile() {
			@Override
			void printConfid() {
				System.out.println("SD 8 GEN 1+ ,Sony IMX 686,6000mah");

			}
		};
		m1.printConfid();
	}
}
