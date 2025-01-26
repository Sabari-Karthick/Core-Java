import java.util.Scanner;
public class L4_Iterations {     //Iterations
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i;
		String j;
		System.out.println("Enter i:");
		i=sc.nextInt();
	
		while(i<=5) {
			
			System.out.println("hello");
			i++;
		}
		System.out.println("Type exit if you want to:");
		j=sc.next();
		sc.close();
		while(j.equalsIgnoreCase("Exit")) 
			System.exit(0);
	
		
		
		for(i=0;i<=5;i++) {
			if(i==3) {
				//break; // break will terminate the loop 
	        continue;	// continue will skip only that specific iteration
			}

			System.out.println("hello");
		}
		
	}
}
