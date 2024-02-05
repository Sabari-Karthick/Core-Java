 import java.util.Scanner;
public class L5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter no of rows:");
		n=sc.nextInt();

		 sc.close();
				for(j=1;j<=n;j++) {
					 char ch ='A';

			for(i=1;i<=j;i++) {//INCREASING STAR
				System.out.print(ch+" ");
				
			}
			ch++;
						System.out.println();
		}
			for(j=1;j<=n;j++) {
				
				for(i=j;i<=n;i++) {//DECREAING STAR
					
					System.out.print(i+" ");
				}
				System.out.println();
			}

	}
}
		
		
		 
	
