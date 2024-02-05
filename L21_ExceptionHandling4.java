import java.util.Scanner;

@SuppressWarnings("serial")
class invalidDetailsException extends Exception {
//Own Exception


	public invalidDetailsException(String x) {
	 super(x);	

	}
}

class ATM {
	final private int accountNumber = 1234;
	final private int passward = 1111;
	private int userAccNo;
	private int userPassward;
	private Scanner sc;

	public void userInput() {
		sc = new Scanner(System.in);
		
		System.out.println("Enter the account number:");
		userAccNo = sc.nextInt();
		System.out.println("Enter the Passward");
		userPassward = sc.nextInt();
		
	}

	public void verifyDetails() throws invalidDetailsException {
		if (userAccNo == accountNumber && userPassward == passward) {
			System.out.println("Proceed with transaction");
		} else {
			System.out.println("Invalid Details");

			throw new invalidDetailsException("Invalid Details!!");
		}
	}

}

class Bank {
	public void initiate() {
		ATM a = new ATM();
		a.userInput();
		try {
			a.verifyDetails();
		} catch (invalidDetailsException e) {
			System.out.println("Try again");
			a.userInput();
			try {
				a.verifyDetails();
			} catch (invalidDetailsException e1) {
               System.out.println("Your account is blocked");
               System.exit(0);
			}
		}
	}
}

public class L21_ExceptionHandling4 {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.initiate();
	}
}
