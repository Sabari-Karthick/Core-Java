import java.io.*;

/**
 * @author karthick
 * 
 *  If parent class implements Serializable then automatically every  child class by default implements Serializable. That is Serializable nature is inheriting from parent to child. Object class doesn't implement Serializable interface
 * 
 *
 */
class Animal11 {
	 int i = 10;

	Animal11() {
		System.out.println("No arg Animal constructor");
	}
}
/**
 * @author karthick
 * 
 * 1. Even though parent class does not implements Serializable we can serialize child object if child class implements Serializable interface.
 * 
 * 2.At the time of serialization JVM ignores the values of instance variables which are coming from non Serializable parent
 *             ---> then instead of original value JVM saves default values for those variables to the file.
 *
 *
 * 3. At the time of Deserialization JVM checks whether any parent class is non Serializable or not. 
 *              ->If any parent class is nonSerializable JVM creates a separate object for every non Serializable parent and shares its instance variables to the current object.
 *
 * 4. To create an object for non-serializable parent JVM always calls no arg constructor(default constructor) of that non Serializable parent hence every non Serializable parent should compulsory contain no arg constructor otherwise we will get runtime exception "InvalidClassException".
 * 
 * 
 * 5. If case of non-serializable parent class then just instance control flow will be performed and share it's instance variable to the current object.
 * 
 */


@SuppressWarnings("serial")
class Dogie extends Animal11 implements Serializable {
	int j = 20;

	Dogie() {
		System.out.println("No arg Dog constructor");
	}
}

public class L38_Serialization2 {
	public static void main(String[] args)throws
	IOException,ClassNotFoundException{
	Dogie d=new Dogie();
	d.i=888;
	d.j=999;//non-serializable parent class properties doen not perform in serialization only default value of type iis stored
	System.out.println("Serialization started");
	FileOutputStream fos=new FileOutputStream("abcd.ser");	
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(d);
	System.out.println("Serialization ended");
	System.out.println("******************************");
	System.out.println("DeSerialization started");
	FileInputStream fis=new FileInputStream("abcd.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Dogie d1=(Dogie)ois.readObject();
	System.out.println(d1.i+"====> "+d1.j);//during de-serialization JVM calls the no-arg constructor  of non-serializable class to initialize the field
	System.out.println("DeSerialization ended");
	oos.close();
	ois.close();
	 }
	}

