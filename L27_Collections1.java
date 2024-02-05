/**
 * @author _karthick
 *If you want to have the power of sorting you need to implement Comparable interface
 *the method need to implement is compareTo 
 * 
 */
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{//to use comparable interface we need the source code 
	int age;
	String name;
	String course;
	public Student(int age, String name, String course) {
		
		this.age = age;
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString() {//to print the object itself instead of Hash_code
		return "Student [age=" + age + ", name=" + name + ", course=" + course + "]";
	}
	@Override
	public int compareTo(Student o)//if compareTo return positive it will swap  
	{
		//return (this.name.length()-o.name.length())*-1;
		//return this.name.length()-o.name.length();
		return this.name.charAt(1)-o.name.charAt(1);
			
	}
	
}
public class L27_Collections1 {
public static void main(String[] args) {
	ArrayList<Student> students = new ArrayList<Student>();
	students.add(new Student(18, "Zack", "Java"));
	students.add(new Student(19, "Sk", "JavaScript"));
	students.add(new Student(20, "Abdul", "Python"));
	System.out.println("Before.......");
	System.out.println(students);
	System.out.println("**********************");
	System.out.println("After.................");
    Collections.sort(students );//here java does not know to sort students
 	//Java Knows how to sort Numbers is because number implement Comparable Interface
    System.out.println(students);
}
}
