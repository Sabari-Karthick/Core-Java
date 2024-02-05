import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class L26 {//collection and  _generics THEORY
	public static void main(String[] args) {
        //the size of array is fixed we need array that cane be expandable
		//we can Collection - is a interface
		//Array_list is a class implements list - list implements collection
		Collection/*(list - for using  index)*/ <Integer>value  = new ArrayList<>();//array list is class which implements collection indirectly
		value.add(5);//by default the type is object
		//List can have duplicates but set cannot have duplicates//traverse in sequence
		Set<Integer> num = new HashSet<>();//it get the elements in different sequence
		//if free_set() is used to get elements in sorted format
		num.add(1);
	}
//map - every value have  key //map<key,value> map is also  a interface
	Map<Integer,String> m = new HashMap<>();  
	
}
