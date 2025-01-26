import java.util.Scanner;

public class L6 {////// SHIT
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose any of the following\n");
		System.out.println("1. March\n2. April\n3. May  ");
		String month = sc.next();
		switch (month) {
			case "March":
				march();
				break;
			case "May":
				for (int i = 0; i < 2; i++) {
					may();
				}
				break;
			case "April":
				april();
				break;
			default:
				System.out.println("Error");
				break;
		}

		sc.close();
	}

	public static void march() {
		System.out.println("Enjoy Batman");

	}

	public static void may() {
		System.out.println("Enjoy Multiverse of madness");

	}

	public static void april() {
		System.out.println("Enjoy Morbius");

	}

}
