import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * @author _karthick
 *If we did not have the source class to implement the comparable interface we can use comparator interface to sort 
 * 
 *If we wanted  that the class itself have the power to sort its object then we can use comparable like the Number class
 * but its not good to implement all class with the comparable interface 
 * 
 * if the class does not implement the comparable interface use comparator
 */
class Compare implements Comparator<Student>{//Comparator is a functional interface so we can use Lambda Expression
	@Override     // Comparable have the power of self comparison so just the value to compare with is passed
	public int compare(Student o1, Student o2) {//here we need pass two values to compare

		return o1.name.compareTo(o2.name);
	}
}
public class L27_Collections2 {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();//here the source of Student is not available so we cannot implement comparable interface
		students.add(new Student(18, "Zack", "Java"));
		students.add(new Student(19, "Sk", "JavaScript"));
		students.add(new Student(20, "Abdul", "Python"));
		students.stream().filter(n->n.course.equals("Java")).forEach(n->System.out.println(n));
		System.out.println("Before.......");
		System.out.println(students);
		System.out.println("**********************");
		System.out.println("After.................");
	    Comparator<Student > c= new Compare();
	    
	    Collections.sort(students,c);//we need to pass the comparator object ->object of the implementation class
	    System.out.println(students);
	    System.out.println("Sorting based on Nmae Length...............");
	    Comparator<Student> com = ( o1, o2) -> o1.name.length()-o2.name.length();;
	    Collections.sort(students,com);
	    System.out.println(students);
	}

}
