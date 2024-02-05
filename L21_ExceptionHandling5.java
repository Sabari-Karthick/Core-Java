import java.util.Scanner;

@SuppressWarnings("serial")
class UnderAgeException extends Exception {
	public UnderAgeException(String msg) {

		super(msg);
	}
}

@SuppressWarnings("serial")
class OverAgeException extends Exception {
	public OverAgeException(String msg) {

		super(msg);
	}
}

class Lapp {
	private int age;

	public void input() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Dear kindly enter your age to check eligbility");
		age = scan.nextInt();
		
	}

	public void verify() throws OverAgeException, UnderAgeException {
		if (age >= 18 && age <= 60) {
			System.out.println("You're eligible");
		} else if (age < 18) {
			throw new UnderAgeException("Dude! Calm down take it slow kid");
		} else if (age > 60) {
			throw new OverAgeException("Your time is near be carefull");

		}
	}
}

class RTO {
	public void initiateApp() {
		Lapp l = new Lapp();
		try {
			l.input();
			l.verify();
		} catch (OverAgeException | UnderAgeException e) {
			System.out.println(e.getMessage());
			try {
				l.input();
				l.verify();
			} catch (OverAgeException | UnderAgeException a) {
               System.out.println(a.getMessage());
               System.out.println("It is suspicious");
               System.exit(0);
			}
		}
	}
}

public class L21_ExceptionHandling5 {
public static void main(String[] args) {
	RTO r = new RTO();
	r.initiateApp();
}
}
