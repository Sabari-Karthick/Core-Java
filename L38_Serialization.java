import java.io.*;
/**
 * @author karthick
 * 
 * Serialization: (1.1 v):
 *  => The process of saving (or) writing state of an object to a file is called serialization but strictly speaking it is:
 * --------------->The process of converting an object from java supported form to either network supported form (or) file supported form.
 * 
 * => By using FileOutputStream and ObjectOutputStream classes we can achieve serialization process.
 * 
 * De-Serialization: => The process of reading state of an object from a file is called DeSerialization  but strictly speaking :
                                ->it is the process of converting an object from file supported form (or) network supported form to java supported form. 
 * => By using FileInputStream and ObjectInputStream classes we can achieve DeSerialization.
 *
 * If we are trying to serialize a non-serializable object then we will get RuntimeException saying "NotSerializableException"
 * 
 * 
 *  We can add any no. Of objects to the file and we can read all those objects from the file 
 *  but in which order we wrote objects in the same order only the objects will come back. That is order is important.if there is a mismatch in order it would result in  "ClassCastException".

 * Object graph in serialization: 
 * 1. Whenever we are serializing an object the set of all objects which are reachable from that object will be serialized automatically. This group of objects is nothing but object graph in serialization. 
 * 2. In object graph every object should be Serializable otherwise we will get runtime exception saying "NotSerializableException".
 */
@SuppressWarnings("serial")
class Dog implements Serializable{//every object need to be serializable must implement this  marker interface
	String name;
//	static transient int id;------->//it is a useless combination as static is out of the object that is one copy for all object it can be accessed with the class name
	   final transient  int id=21; //in case of final the value get directly participated not the variable  so  transient have no effect

	public Dog(String name) {
		this.name = name;
        //this.id =id; -->here final won't help against transient as during de-serialization constructor is not invoked
	}

}
	@SuppressWarnings("serial")
	class Cat implements Serializable{
		String name;
	transient	int id;//->not to serialize-> only applicable for variables -> here JVM ignores the original value and save the default value
		public Cat(String name,int id) {
		
			this.name = name;
			this.id = id;
		}
	
	
	
}
public class L38_Serialization {

public static void main(String[] args) throws IOException, ClassNotFoundException {
	Dog myDog = new Dog("Spike");
	Cat myCat = new Cat("Tom",18);

	FileOutputStream fos=new  FileOutputStream("dog.ser");//it creates the file
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(myCat);
	oos.writeObject(myDog);//which objects need to get to ability of network/file supported form that is serializable it should implements  serializable
	oos.close();
	System.out.println("Ended");
	FileInputStream fos1=new  FileInputStream("dog.ser");//it creates the file
	ObjectInputStream ois = new ObjectInputStream(fos1);
	/**
	 * Cat is first serialized so it must be first deserialized otherwise ClassCast Exception will be thrown
	 * 
	 *If Order is not known simply collect using object reference:
	 *                                                      Object obj = ois.readObject();
	 *                                                      and use instanceof  to find which reference it is like cat/dog and perform the operation
	 *                                                      
	 */
//	Object obj=ois.readObject();
//	if(obj instanceof Dog) {
//		Dog myDog1=(Dog)myDog;
//	}
	  Cat myCat1 =(Cat)ois.readObject();
	  Dog myDog1=(Dog)ois.readObject();//it returns object so only any type of object can be deserialized
   
    System.out.println("My Dog name is:"+myDog1.name+" ID is:"+myDog1.id);
  System.out.println("My Cat name is:"+myCat1.name+" ID is:"+myCat1.id);
  ois.close();
   
}
}
