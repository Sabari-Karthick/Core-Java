
public class A1_2 {
	public static void main(String[] args) {
		System.out.println("The Number pattern:");
		numPattern(4);
		System.out.println("\n\nP1:\n");
		p2(14);
		System.out.println("\nP2:");
		p3(14);
		System.out.println("\n\nP3:\n");
		p4(14);
		
	}
	private static void p4(int n) {
		for(int i=1;i<=n/2;i++) {
			for(int j=i;j<=n/2;j++) {
				System.out.print("* ");
			}
			 for(int j=2;j<i;j++) {
				 System.out.print("  ");
			 }
			 for(int j=1;j<i;j++) {
				 System.out.print("  ");
			 }
			 for(int j=i;j<=n/2;j++) {
				 if(i==1) {
					 System.out.print("* ");
					 continue;
				 }
					System.out.print("  ");
				}
			System.out.println();
		}
		for (int i=1;i<=n/2;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("* ");
				
			}
			for (int j=i;j<n/2;j++) {
				System.out.print("  ");
				
			}
			for (int j=i;j<n/2;j++) {
				System.out.print("  ");
				
			}
			for (int j=1;j<=i;j++) {
				if(i==n/2) {
				System.out.print("* ");
				continue;
				}
				System.out.print("  ");
			}
			
			System.out.println();
			
		}
	}

	private static void p3(int n) {
		for(int i=1;i<=n/2;i++ ) {
			for(int j=1;j<=n;j++) {
				System.out.print("  ");
				
			}
			System.out.println();
		}
		for (int i=1;i<=n/2;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
				
			}
			for (int j=i;j<n/2;j++) {
				System.out.print("  ");
				
			}
			for (int j=i;j<n/2;j++) {
				System.out.print("  ");
				
			}
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}
		for(int i=1;i<=n;i++) {
			System.out.print("* ");
		}

		
	}

	private static void p2(int n) {
		for(int i=1;i<=n/2;i++) {
			for(int j=i;j<=n/2;j++) {
				System.out.print("* ");
			}
			 for(int j=2;j<i;j++) {
				 System.out.print("  ");
			 }
			 for(int j=1;j<i;j++) {
				 System.out.print("  ");
			 }
			 for(int j=i;j<=n/2+1;j++) {
				 if(i==1&&j==n/2+1) {
					 System.out.print("  ");
					 continue;
				 }
					System.out.print("* ");
				}
			System.out.println();
		}
		for(int i=1;i<=n/2;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||j==n||i==n/2) {
					System.out.print("* ");
					continue;
				}
				System.out.print("  ");
			}
			System.out.println();
		}
	}

	private static void numPattern(int n) {
		for(int  i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}

}
