	
import java.util.Arrays;//using star is not advised because it increases load an cause ambiguity 
import java.util.Collections;
import java.util.List;

/**
 * 
 * 
 * Collection  ->Root interface in the Collection Hierarchy
 * Collections ->Utility  class (Static Methods/Helper Methods are available
 * 
 * 
 * 
 *
 */
public class L27_Collections {

public static void main(String[] args) {
     List<Integer> list= Arrays.asList(6,4,1,9,3);
     //list.sort(null);\
     Collections.sort(list);
	System.out.println(list);
	
	
	
}
}
