/*
 * If the behavior or logic changes for different parameters go for method overloading or if the logic remains the same go for var_args
 * 
 */
import java.util.*;
public class L11 {
public static void main(String[] args) {//var_args --variable length  arguments
	Scanner sc =new Scanner(System.in);
	
	int a=add(1,2,3,4,5,6,7,8);	
	System.out.println(a);
	
	
	
	sc.close();

}

public static int add(int ...n) { //here n is taken as array // many values can be passed
	int x=0;
	for(int i:n) {
		x+=i;
		
	}
	return x;

}
}