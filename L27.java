//import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
//import java.util.Iterator;
public class L27 {//Collection
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		/*Collection value  = new ArrayList();//Collection is a interface and we can't create object of interface
		//we need a class that implements the interface and that is array_list
		//we can create reference of interface and object of the class 
		value.add(6);
		value.add(9);
		System.out.println(value);
		Iterator  i =  value.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		
			 	}
			 */
		//collection doesn't support index so we can use list
	//	List value = new ArrayList();//List is a collection of object not a particular data type//List are mutable
		//if we want to restrict the data type
/*Comparator<Integer> c = new Comparator<Integer>() {//comparator for the own logic of its sorting
			
			@Override
			public _int compare(Integer i, Integer j) {
				// TODO Auto-generated method stub
			if (i%10>j%10) 
				return 1;
		  else 
				return -1;
			
			}
		};*/
		//Since comparator is a functional interface the above codes can be modified with lamda expression
		Comparator<Integer> c =(i,j)-> i%10>j%10?1:-1;
		//System.out.println(c+".....");
		
		List<Integer>value= new ArrayList<>();
		value.add(0, 202);//here it is not _int it is a wrapper class of integer
		value.add(1, 409);//Integer x = new Integer(4);
		value.add(187);
		value.add(325); 
		
		ArrayList a = new ArrayList();
        a.add(value);
        System.out.println(a);//we can add one collection to another//merge two collection
        //value.add("hi");
		//Collections.sort(value, c);//Collections is a class
		//Collections.shuffle(value);
		Collections.reverse(value);
		for(int i=0;i<value.size();i++) {
			System.out.println(value.get(i));//get() method used to get index in list
		}
		for(int i=value.size()-1;i>=0;i--) {//to reverse
			System.out.println(value.get(i));//get() method used to get index in list
		}
		for (Integer x : value) {
			System.out.println(x);
		}
		
	}

}
