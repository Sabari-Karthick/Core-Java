import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//L27 CONTINUATION
class stud implements Comparable<stud>{//IF we wants to sort any collection we need to implement comparable interface
	int rollno ,mark;
	String name;
	@Override
	public String toString() {
		return "stud [rollno=" + rollno + ", mark=" + mark + ", name=" + name + "]";
	}
	public stud(int rollno,String name,int mark) {
		super();
		this.rollno = rollno;
		this.mark = mark;
		this.name = name;
	}
	
	@Override
	public int compareTo(stud o) {
		// TODO Auto-generated method stub
		return mark<o.mark?1:-1;
	}
}
public class L28 {//Comparable interface
public static void main(String[] args) {
	List<stud> studs = new ArrayList<stud>();
	studs.add(new  stud(21,"SK",496));
	studs.add(new  stud(18,"vk",490));
	studs.add(new  stud(27,"AB",360));
	Collections.sort(studs);
	//WE can override comparable with comparator
	Collections.sort(studs,(i,j)->i.mark>j.mark?1:-1);
	for(stud o: studs) {
		System.out.println(o);//When the object is printed it will call the toString method
	}
	
}
}
