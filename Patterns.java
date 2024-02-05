
import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s="ineuron";
		String name ="";
	System.out.println("Enter your name:");
	name= sc.nextLine();
	char a[]=name.toCharArray();
	char b[] =s.toCharArray();
	System.out.println("THE PATTERN:");
    for(int i=0;i<a.length;i++)
    {
		Pattern p = new Pattern();
		p.print(a[i]);
	}
	System.out.println("\nINEURON:");
	for(int i=0;i<b.length;i++)
	{
		Pattern q = new Pattern();
		q.print(b[i]);
	}
	sc.close();
	}	
}
                