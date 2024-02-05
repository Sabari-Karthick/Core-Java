import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * @author _karthick
 * 
 * If we want to have our logic of sorting we use  comparator
 * Comparator dominates Comparable
 *
 */

public class L27_Collections3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,1,6,2,3,9,0,5);	

		Collections.sort(list);//Here the Numbers implements Comparable interface so only it id sorting
		System.out.println("Ascending.................");
		System.out.println(list);
		System.out.println("Descending ...............");
		Collections.sort(list,(n1,n2)->n2-n1);//or you can use reverse

		System.out.println(list);
	}

}
