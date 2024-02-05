//import java.util.ArrayList;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
//import java.util.Scanner;
//import java.util.stream.Stream;
import java.util.stream.Collectors;

public class L32_StreamAPI {
	
	public static void main(String[] args) {	
		List<String> list =Arrays.asList("a","aba","bie","zzz");
		List<String> values =Arrays.asList("a","aba","bie","zzz");
		List<Integer> data = Arrays.asList(2,4,5,6,7);
		List<Integer> item = Arrays.asList(2,4,5,6,7);
	   
		int num[]= {1,2,34,45,3};
		System.out.println(Arrays.stream(num).max().getAsInt());
	
		String []nums={"2","21","12","83598933472122816064"};
		 System.out.println(Arrays.stream(nums).map(val -> new BigInteger(val)).sorted().collect(Collectors.toList()).get(nums.length-3).toString());
		/*stream method return stream of values

		Stream<Integer> data = list.stream();
		Stream<Integer> doubled = data.map(n->n*2);//map also return a stream
		doubled.forEach(n->System.out.println(n));//once the stream is consumed stream cannot be used again 
		
	*/
		
		//the above code can be written simply as
		
		list.stream().map(n->n.toUpperCase()).forEach(n->System.out.println(n));
		data.stream().sorted().map(n->n*2).forEach(n->System.out.println(n)); 
		//item.stream().filter(n->n%2==1).map(n->n*2).forEach(n->System.out.println(n));
		int result = item.parallelStream().filter(n->n%2==1).map(n->n*2).reduce(0, (c,e)->c+e);
	List<String> Str = new  ArrayList<String>();
			values.stream().filter(s->s.length()>0&&s.endsWith(String.valueOf(s.charAt(0)))).forEach(n->Str.add(n));
			for (String string : Str) {
				System.out.println(string);
			}
	   System.out.println(result);
	//	System.out.println(data.count());
//		  Stream<Integer> sorted  = data.sorted();
//		 sorted .forEach(n->System.out.println(n));
//	
  
	
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		List<String> list = new ArrayList<String>();
//		for(int i=0;i<3;i++) {
//			System.out.println("Enter the string:");
//		 list.add(sc.next());
//		}
//		for(String i : list) {
//			System.out.println(i);
//		}
//		sc.close();
	}

}
