import java.util.*;
public class L10 {//array
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x[]=new  int[3];// _int x[]={1,2,3,4}
	for(int i=0;i<x.length;i++) {
		x[i]=i;
		System.out.println(x[i]);
	}
	
	int l[]= {1,2,3,4};
    
	for(int i:l) {
		System.out.println(i);//ask-for loop
		
	}

	int y[][]= {
			{1,2,3},   // number of columns are not fixed are called _jagged arrays
			{2,4,5,2,556,345}
	};
	
	for (int b[] : y) {// ask-for loop
		for(int r : b) {
			System.out.print(r+" ");
		}
		System.out.println();
	}
/*
	for(int i=0;i<y.length;i++) { // normal for loop
		
	for(int z=0; z<y[i].length;z++) {
		
	
	System.out.print(y[i][z]+" ");
	}
	System.out.println();
	}	
	*/
	
	System.out.println("Enter a string:");
	String word= sc.next();
	char a[]=word.toCharArray();
	
	for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
	}
	
	
	employee[] e;  // array of class
	e = new employee[2];
	e[1]= new employee();
	e[0]= new employee();
	e[0].id=8;
//	e[0].salary=1000;
	e[1].print();
	e[0].print();
		
	
	
	sc.close();
}

}
class employee{
	int id ;
	static int salary;
	
	employee(){
		id=5;
		salary=500;
	}
	
	public void print() {
		System.out.println(id+" "+salary);
	}
	
	
	
}
