import java.util.Scanner;

//Abstract keyword is  used only with:
//   1.method and 2. class
//abstract method has only method signature not the body;//no body
//if minimum one method in the class is abstract the class must be also abstract
// ****normal(concrete) methods also allowed
//we cannot create object(instantiate) of abstract class but we can create reference to achieve polymorphism.
//when we extend a abstract class it is compulsory to provide body for abstract methods
//a class  or method can be either abstract or final--> not both --> as they contradicts each other
//with abstract keyword we cannot achieve 100% abstraction because we can have concrete method also
abstract class Shape {
	float area;
	Scanner sc = new Scanner(System.in);

	abstract void input();

	abstract void compute();

	void display() {
		System.out.println("The area is:" + area);
	}
}

class Rectangle extends Shape {
	float length;
	float breadth;

	void input() {
		System.out.println("Enter the length of rectangle:");
		length = sc.nextFloat();
		System.out.println("Enter the breadth of rectangle:");
		breadth = sc.nextFloat();
	}

	void compute() {
		area = length * breadth;
	}
}

class Square extends Shape {
	float length;

	void input() {
		System.out.println("Enter the length of square:");
		length = sc.nextFloat();
	}

	void compute() {
		area = length * length;
	}
}

class Circle extends Shape {
	float radius;
	final double pi = 3.14;

	void input() {
		System.out.println("Enter the radius of circle:");
		radius = sc.nextFloat();

	}

	void compute() {
		area = (float) pi * (radius * radius);
	}
}

class Geomentry {
	static void areaOfShape(Shape shapes) {
		shapes.input();
		shapes.compute();
		shapes.display();
	}
}

public class L16_Abstraction {
	public static void main(String[] args) {
		Shape r = new Rectangle();
		Shape s = new Square();
		Shape c = new Circle();
		
		Geomentry.areaOfShape(r);
		Geomentry.areaOfShape(s);
		Geomentry.areaOfShape(c);
	}
}
