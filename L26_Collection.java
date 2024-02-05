import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 * @author _karthick
 * For Collection Interface the parent is "_Iterable"
 * There are totally 7 class:
 *               -->ArrayList,LinkList,ArrayDeque,PriorityQueue,TreeSet,HashSet,LinkedHashSet
 *               -->Maps
 *               
 *->ArrayList:
 *            -->it internally make use of dynamic array data structure
 *            -->ArrayList also uses contiguous memory location
 *            -->It takes Object as input by using autoBoxing
 *            -->Order is retained that is is index is supported 
 *            -->Heterogeneous type of data can be stored
 *            -->One Collection can be added with another
 *            -->But array is  faster than ArrayList
 *            -->When the size is dynamic in that situation only we should go with ArrayList
 *            -->adding elements based on index is not recommended as it consumes more time
 *            -->Element is added at rear end
 *            -->It implements list interface
 *            -->If the frequent operation is read operation use ArrayList
 *            -->Here Reading is fast because it implements a interface "RandomAccess"
 * 
 * ->LinkedList:          
 *             -->it internally make use of Doubly Linked List data structure 
 *             -->Order is retained that is is index is supported and recommended 
 *             -->Heterogeneous type of data can be stored
 *             -->One Collection can be added with another
 *             -->LinkedList also uses dispersed memory location
 *             -->It implements both list and dequeue
 *             -->Element can be added at any place using _addfirst,_addlast
 *             -->If the frequent operation is delete operation use LinkedList
 *             
 * ->ArrayDeque:
 *             -->it internally make use of Double Ended Queue data structure     
 *             -->Index based accessing is not allowed only possible at front and rear end 
 *             -->It implements dequeue  which is a sub interface of  queue
 *             -->Null value is not accepted
 * 
 * ->PriorityQueue:
 *             -->it internally make use of minimum heap data structure -->high priority element should be in top of the heap
 *             -->Order is -->not<-- Retained and Index is not supported
 *             -->Highest priority element available at the front of the collection
 *             -->It implements Queue data structure
 *             -->Duplicates can be added but not recommended
 *             -->Null values are not accepted
 *             -->Elements are only added at rear end
 *             -->Using with Homogeneous elements is preferable
 *             
 * ->TreeSet:
 *             -->It follows Balanced Binary Tree Data Structure and Red-Black Algorithm -->In-Order Traversal ->Left-Value-Right
 *             -->Order it is not retained, It will be ascending Sorted Order
 *             -->TreeSet is best for searching iff the tree is BST(log n) if it is skewed tree it is slower O(n)
 *             -->It implements SortedSET which is sub_interface of SET
 *             -->Duplicates,null value are not allowed, you can add but set ignores it
 *            
 * ->HashSet and LinkedHashSet:
 *             -->Internally follows Hash table(Hash Function)
 *             --> It arrange the data in the table by performing the hash function and ensure no two item in same location
 *             --> It is the fasted way to search the complexity O(1)
 *             -->In LinkedHashSet order of insertion is retained and in HashSet it is not Retained
 *             -->Duplicates are not accepted
 *             
 */
public class L26_Collection{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	    HashSet h = new HashSet();
	    h.add(100);
	    h.add(105);
	    h.add(50);
	    h.add(25);
	    h.add(21);
	    System.out.println(h);
	    
	    LinkedHashSet l =new LinkedHashSet();
	    l.add(100);
	    l.add(105);
	    l.add(50);
	    l.add(25);
	    l.add(21);
	    System.out.println(l);
   //*****************************************************************//	
			TreeSet t =new TreeSet();
			t.add(100);
			t.add(25);
			t.add(50);
			t.add(5);
			t.add(130);
			t.add(125);
		
			t.add(75);
			t.add(1);
			t.add(150);
			System.out.println(t);
			System.out.println(t.higher(125) );
			System.out.println(t.ceiling(124));//give the nearest higher value iff the mentioned one is not present else the same value
			
	//*****************************************************************//	
		LinkedList list = new LinkedList();
		list.add(21);
		list.add("sk");
		list.add("batman");
		System.out.println(list);
		list.add(2, 1);//Here not shifting happen like ArrayList so no delay for shifting just referring the new nod
		System.out.println(list);
	//*****************************************************************//		
		LinkedList item = new LinkedList();
		item.add("rcb");
		item.offer("csk");//Collection may accept or decline the offer
		System.out.println(item);
	//*****************************************************************//		
		ArrayDeque q = new  ArrayDeque();
		q.add(12);
		q.add("rr");
		q.addFirst(1);
		q.addLast("last");
		System.out.println(q);
	//*****************************************************************//	
		PriorityQueue p = new PriorityQueue();
		p.add(100);
		p.add(50);
		p.add(150);
		p.add(25);
		p.add(75);
		p.add(125);
		p.add(125);
		System.out.println(p);
		}
	//*****************************************************************//	
	
	    
	
	
	
}
