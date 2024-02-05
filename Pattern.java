

public class Pattern {

	
 void print(char x) 
 {
	 switch(x)
	 {
	 case ' ':
		 System.out.println("\n \n");
		 break;
	 case 'A','a':
	      System.out.println();
		 for(int i=1;i<=7;i++)//here n=7 since we just need to print the alphabet
		 {
			 for(int j=1;j<=7;j++)
			 {
				
				 if(i==1||i==(7/2)+1||j==1||j==7)
				 {
					  if((i==1&&j==1)||(i==1&&j==7))
						 {
							System.out.print(" "); 
							continue;
						 }
					 System.out.print("*");
				 }
				
			   else
				 {
					 System.out.print(" ");
				 }
			 }
			 
			 System.out.println();
			 
		 }
		
	 break;
	 case 'f','F':
	      System.out.println();
		 for(int i=1;i<=7;i++)//here n=7 since we just need to print the alphabet
		 {
			 for(int j=1;j<=7;j++)
			 {
				
				 if(i==1||i==(7/2)+1||j==1)
				 {
					 
					 System.out.print("*");
				 }
				
			   else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
	 break;
	 case 'e','E':
	      System.out.println();
		 for(int i=1;i<=7;i++)//here n=7 since we just need to print the alphabet
		 {
			 for(int j=1;j<=7;j++)
			 {
				
				 if(i==1||i==(7/2)+1||j==1||i==7)
				 {
					 
					 System.out.print("*");
				 }
				
			   else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
	 break;
	 case 'h','H':
	      System.out.println();
		 for(int i=1;i<=7;i++)//here n=7 since we just need to print the alphabet
		 {
			 for(int j=1;j<=7;j++)
			 {
				
				 if(i==(7/2)+1||j==1||j==7)
				 {
					 
					 System.out.print("*");
				 }
				
			   else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
	 break;
	 case 'r','R':
	      System.out.println();
		 for(int i=1;i<=7;i++)//here n=7 since we just need to print the alphabet
		 {
			 for(int j=1;j<=7;j++)
			 {
				if(j==1||i==1||i==7/2+1||(j==7&&i<=7/2+1)||(i>7/2+1&&i-j==1))
				{
					if((j==7&&i==1)||(j==7&&i==7/2+1)) {
						System.out.print(" ");
						continue;
					}
					System.out.print("*");
					continue;
				}
		        System.out.print(" ");
			 }
			 System.out.println();
		 }
	 break;
	 case 'k','K':
	      System.out.println();
		 for(int i=1;i<=7;i++)//here n=7 since we just need to print the alphabet
		 {
			 for(int j=1;j<=7;j++)
			 {
				if(j==1||(i>7/2+1&&i-j==0)||(i<7/2+1&&i+j==8)||(i==7/2+1&&j==3))
				{
					
					System.out.print("*");
					continue;
				}
		        System.out.print(" ");
			 }
			 System.out.println();
		 }
	 break;
	 case 'b','B':
	      System.out.println();
		 for(int i=1;i<=7;i++)//here n=7 since we just need to print the alphabet
		 {
			 for(int j=1;j<=7;j++)
			 {
				
				 if(i==1||i==7||i==(7/2)+1||j==1||j==7)
				 {
					 if((i==1&&j==7)||(i==7&&j==7)||(i==(7/2)+1 && j==7))
					 {
						 System.out.print(" ");
						 continue;
						 
					 }
					 System.out.print("*");
				 }
				
			   else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
	 break;
	 case 'c','C':
	      System.out.println();
		 for(int i=1;i<=7;i++)//here n=7 since we just need to print the alphabet
		 {
			 for(int j=1;j<=7;j++)
			 {
				
		      if(i==1||i==7||j==1) {
		    	  if((i==1&&j==1)||(i==7&&j==1)) {
		    		  System.out.print(" ");
		    		  continue;
		    	  }
		    	  System.out.print("*");
		      }
		      else {
		    	  System.out.print(" ");
		      }
			 }
			 System.out.println();
		 }
	 break;
	 case 's','S':
	      System.out.println();
	 for(int i=1;i<=7;i++) {
		 for(int j=1;j<=7;j++) {
			 if((i==2&&j!=1)||(i==3&&j!=1)||(i==5&&j!=7)||(i==6&&j!=7)||(i==1&&j==1)||(i==7&&j==7)||(i==(7/2)+1&&j==7)){
				 System.out.print(" ");
				 continue;
			 }
			
			 System.out.print("*");
			 
		 }
		 System.out.println();
	 }

		
	 break;
	 case 'x','X':
	      System.out.println();
	 for(int i=1;i<=7;i++) {
		 for(int j=1;j<=7;j++) {
			 if((i==j)||(i+j==8))
			 {
				 System.out.print("*");
				 continue;
				 
			 }
			 System.out.print(" ");
		
		 }
		 System.out.println();
	 }

		
	 break;
	 case 'i','I':
	      System.out.println();
	 for(int i=1;i<=7;i++) {
		 for(int j=1;j<=7;j++) {
			 if(i==1||i==7||j==7/2+1)
			 {
				 System.out.print("*");
				 continue;
			 }
			
			 System.out.print(" ");
		
		 }
		 System.out.println();
	 }

		
	 break;
	 case 't','T':
	      System.out.println();
	 for(int i=1;i<=7;i++) {
		 for(int j=1;j<=7;j++) {
			 if(i==1||j==7/2+1)
			 {
				 System.out.print("*");
				 continue;
			 }
			
			 System.out.print(" ");
		
		 }
		 System.out.println();
	 }

		
	 break;
	 case 'n','N':
	      System.out.println();
	 for(int i=1;i<=7;i++) {
		 for(int j=1;j<=7;j++) {
			 if(j==1||j==7||i==j)
			 {
				 System.out.print("*");
				 continue;
			 }
			
			 System.out.print(" ");
		
		 }
		 System.out.println();
	 }
	 break;
	 case 'o','O':
	      System.out.println();
	 for(int i=1;i<=7;i++) {
		 for(int j=1;j<=7;j++) {
			 if(i==1||j==1||i==7||j==7)
			 { 
				 if((i==j)||(Math.abs(i-j)==6)) {
					 System.out.print(" ");
					 continue;
				 }
				 System.out.print("*");
				 continue;
			 }
			
			 System.out.print(" ");
		
		 }
		 System.out.println();
	 }
	 break;
	 case 'u','U':
	      System.out.println();
	 for(int i=1;i<=7;i++) {
		 for(int j=1;j<=7;j++) {
			 if((i==7&&j==1)||(i==7&&j==7)) {
					System.out.print(" ");
					continue;
			 }
					
			if(j==1||i==7||j==7) {
				System.out.print("*");
			
		    continue;
			}
			 System.out.print(" ");
		
		 }
		 System.out.println();
	 }
	 break;
	 
	 default:
		 System.out.println("BYE Da");
		 break;
		 
	 }
		 
	 
	 
	 
	 
	 

	
  
 }
}
