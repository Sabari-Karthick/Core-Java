import java.util.ArrayList;
import java.util.List;

/**
 * @author karthick
 * 
 * Data about the data/code is known as metaData
 * Metadata like  comments are removed at the start phase of compilation and they are not part of .class file and at runtime 
 * If some metadata need to be part of .class file and the metadata needs to be in the runtime also there comes annotation  
 * Annotation ->Extra information embedded inside the code that holds till runtime
 * ->Marker,single,multi-valued annotation
 * Annotation worked based on the mechanism of interfaces 
 * 
 * @-> used to represent annotation
 *
 */
@FunctionalInterface//->gives compilation error when adding another method -->heere the metadata will not be removed at the begining and of compilation and with stand till end
interface Add{
	void add();
	//void sub();
}
class calc72 {
	void add() {
		System.out.println("adding");
	}
}
class calc45 extends calc72{
	@Override //->gives error if different name is used other than the inherited one

	void add() {
		
	}
}

public class L36_Annotation {
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
	List l = new ArrayList();
		
	}

}
