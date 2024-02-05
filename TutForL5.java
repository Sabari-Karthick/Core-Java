import java.util.Scanner;
public class TutForL5 {
public static void main(String[] args) {
	Scanner Sc =new Scanner(System.in);
	int i,j;
	int n=5;
	for(j=1;j<=n;j++) {
		for(i=j;i<=n;i++) {
			System.out.print("  ");
		     }
		for(i=1;i<j;i++) {
			System.out.print("* ");
		     }
		for(i=1;i<=j;i++) {
			System.out.print("* ");
		     }
		
		System.out.println();
	}
	for(j=1;j<=n;j++) {
		for(i=1;i<=j;i++) {
			System.out.print("  ");
		     }
		for(i=j;i<=n;i++) {
			System.out.print("* ");
		     }
		for(i=j;i<n;i++) {
			System.out.print("* ");
		     }	
		
		for(i=1;i<=j;i++) {
			System.out.print(" ");
		     }		
		System.out.println();
	}
	Sc.close();
}
}
