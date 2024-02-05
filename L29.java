
import java.util.HashSet;
import java.util.Set;
public class L29 {//Set interface
	public static void main(String[] args) {
		Set<Integer> b = new HashSet<>();//Class that implements Set is hashset
		//TREESET() class to store in ascending order
		b.add(26);
		b.add(36);
		b.add(37);
		b.add(89);
		b.add(97);//SET we can't have duplicates
		
		for (int x : b) {
			System.out.println(x);//The printing sequence is not same
			//HAShset uses hashing technique which fetch the values that are nearly stored in the heap
		}
		
		
	}

}
