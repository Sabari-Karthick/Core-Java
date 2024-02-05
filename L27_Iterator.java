import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author _karthick
 * 
 * Difference way to access data in collection:
 *                     -->normal for_loop is not suited as some collections does not support index accessing
 *                     -->so for-each works
 *                     -->But we use iterator which will act like a cursor to travel and extract the data
 *                     -->hasNext()->whether the next element is present or not
 *                     -->next()->will move the iterator and extract the data
 *                     -->ListIterator can be used for list based classes to iterated in different direction and also with index
 *                     -->where ever there is no indexed based accessing we cannot use for loop
 *                     
 *  For Legacy classes like vector,stack,dictionary Enumerators are used.                   
 * 
 *
 */
public class L27_Iterator {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	List l = new ArrayList();
	l.add(1);
	l.add(11);
	l.add(111);
	l.add(1111);
	l.add(11111);
	l.add("hello");
	Iterator itr = l.iterator();
	LinkedList list = new LinkedList();
	while(itr.hasNext()) {
		//System.out.println(itr.next());
		list.add(itr.next());
		
	}
	
	ListIterator itr1 = list.listIterator(list.size());//to point the iterator at the back of the list
	while (itr1.hasPrevious()) {
		System.out.println(itr1.previous());
		
	}
   Iterator itr2 =list.descendingIterator();//to do the same reverse operation above
   //only in linked_list,array_deque,tree_set
   while(itr2.hasNext()) {//descending next
	   System.out.println(itr2.next());
   }
	
	
}
}
