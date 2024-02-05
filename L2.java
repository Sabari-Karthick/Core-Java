 import java.util.Scanner;
public strictfp class L2 {// arithmetic ////strictly follow floating point precision
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		double a,b,c,d,e;//double for high precision
		System.out.println("Enter a :");
		a=sc.nextDouble();
		System.out.println("Enter b:");
		b=sc.nextDouble();
		c=div(a,b);
		d=mult(a,b);
		System.out.println(2.6_7_8);//underscores are only not allowed adjacent to decimal in other area you an add it
		System.out.println("The answer is :"+c);
		
		System.out.println("The answer is :"+d);
		 e=c+d;
		 System.out.println(e);
		 c++;
		 System.out.println(c);
		//Q1 Average finder
		
			float  math,phy,cs;
			
			System.out.println("ENTER math  ");
			math=sc.nextFloat();
			if(math>100) {
				System.out.println("Please enter valid mark");
				System.exit(0);
			}
			System.out.println("ENTER phy  ");
			phy=sc.nextFloat();
			if(phy>100) {
				System.out.println("Please enter valid mark");
				System.exit(0);
			}
			System.out.println("ENTER cs  ");
			cs=sc.nextFloat();
			if(cs>100) {
				System.out.println("Please enter valid mark");
				System.exit(0);
			}
			float  per = (math+phy+cs)/3;
			System.out.println(per);
	//Q2 printing name		
			
	System.out.println("YOUR GOOD NAME?");
	String name =sc.next();
	System.out.println("Hello "+name+",  "+"\"Have a good day\"");

	//Q3 length converter

	System.out.println("\nWhich convention you need?");
	System.out.println("1.KM to mil \n2.Mil to km ");
	int choice =sc.nextInt();
	switch(choice){
	case 1:
		System.out.println("Enter distance in Kilometre:");
	   float  km=sc.nextFloat();
	    double mil=(km * 0.6213);
	    System.out.println("Distance in miles:"+mil);
	    break;
	    
	case 2:
		System.out.println("Enter distance in Miles:");
	   float  mi=sc.nextFloat();
	    float Km=(float) (mi / 0.6213);
	    System.out.println("Distance in Kilometre:"+Km);
	    break;
	    default:
	    	System.out.println("invalid");
	    break;
	    
	}

	//Q5  find a number is integer or not
	System.out.println("Enter a number");
			System.out.println(sc.hasNextInt());
			
			
			System.out.println("Enter your Grade");
			char  grade = sc.next().charAt(0);
			if(grade>=97&&grade<=122) {
				grade=Character.toUpperCase(grade);
			}
			System.out.println("Transfering......");
			grade = (char)(grade +8);
			System.out.println("In transfer:"+grade);
			grade =(char)(grade-8);
			System.out.println("your grade is:"+grade);
			
			
	
	     sc.close();
		
		}
	public  static  double  div(double x,double y) {
		double ans = x/y;
		
		return ans;
	}
		public static double mult(double p,double q) {
			double result = p*q;
			return result;
			
		}




	

}


		 
		
	
	

