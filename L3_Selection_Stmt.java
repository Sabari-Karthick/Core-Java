import java.util.Scanner;
public class L3_Selection_Stmt {//selection

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
	
		System.out.println("Enter a:");
		a=sc.nextInt();
		System.out.println("Enter b:");
		b=sc.nextInt();
		System.out.println((a%2==0)?"even":"odd");
		b=(a>10)?124:125;
		System.out.println(b);
		String i;
		i =sc.next();
		
		switch(i) {
		case "hi":
			System.out.println("Error code:203");
			break;
		case "bye":
			System.out.println("Error code:511");
			break;
		case "goodluck":
			System.out.println("Error code:517");
			break;
		
        default:
        	System.out.println("ERROR");
			break;		
		}
		sc.close();
		}
		
	}


