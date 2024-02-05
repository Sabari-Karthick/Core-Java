import java.util.Enumeration;
import java.util.Vector;

//for legacy classes -->enumeration is used
public class L27_Enumerator {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	Vector v = new Vector();
	v.add(1);
	v.add(2);
	
	Enumeration e= v.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
}
}
