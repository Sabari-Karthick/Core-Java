
import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;


public class L26_ArrayList {//for each method
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(2,4,5,6,7);//list support index
	//one way of getting the values can be using external  loop
	               //--->normal loop
	               //--->for-each loop
	 list.forEach(n->System.out.println(n));//for each method requires a consumer object
	                     //Consumer accepts a data object 
//	Consumer<Integer > c = new Consumer<Integer>() {
//			
//			@Override
//			public void accept(Integer t) {
//				// TODO Auto-generated method stub
//				
//			}
//		};
 }
}
