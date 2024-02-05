import java.util.Arrays;
import java.util.List;
//Stream is used to avoid mutation
//Once Stream is used it cannot be reused 
//Lazy Evaluation:is actually good sometimes the processed data may not be used
//        -->They just do the work only when the result is asked by other example:filter(),map()
//reduce() is a terminate function and filter(),map() are intermediate function
//parralStream() involves multiple thread which increase speed but if  there is a dependency between data then using it not advisable
public class L32_StreamAPI1 {
	public static void main(String[] args) {
		List<Integer> list  =Arrays.asList(2,5,3,8,9,1);
		list.stream().filter(n->n%2==1).map(n->n*2).forEach(n->System.out.println(n));
		//we can use reduce() function to reduce the stream into a single value
		int result = list.parallelStream().filter(n->n%2==1).map(n->n*2).reduce(0,(c,e)->c+e);
		//0 to start with the reduce operation that is 0+e at start in this code e = 2;
		System.out.println(result);
		
	}

}
