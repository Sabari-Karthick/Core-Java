/**
 * @author karthick
 * 
 * 
 * The main advantage of externalization over serialization is we can save either total object or part of the object based on our requirement.
 *  Externalizable interface is child interface of serializable interface.
 *  
 * At the time of deserialization JVM will create a seperate new object by executing public no-arg constructor on that object JVM will call readExternal() method.
 *  Every Externalizable class should compusory contains public no-arg constructor otherwise we will get RuntimeExcepion saying "InvaidClassException" .
 * 
 *
 */
import java.io.*;
class ExternalizableDemo implements Externalizable{
String i;
int j;
int k;
ExternalizableDemo(String i,int j,int k){
this.i=i;
this.j=j;
this.k=k;
}
public ExternalizableDemo(){
System.out.println("Zero arg constructor");
}
//Performing Serialization as per our requirement
public void writeExternal(ObjectOutput out) throws IOException{
System.out.println("call back method used while Serialization");
out.writeObject(i);
out.writeInt(j);
}
//Performing DeSerialization as per our requirement
public void readExternal(ObjectInput in) throws
IOException,ClassNotFoundException{
System.out.println("call back method used while DeSerialization");
i=(String)in.readObject();
j=in.readInt();
}
}	
public class L38_Externalization {
	public static void main(String[] args)throws
	IOException,ClassNotFoundException{
	ExternalizableDemo d=new ExternalizableDemo("nitin",100,200);
	System.out.println("Serialization started");
	FileOutputStream fos=new FileOutputStream("abc.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(d);//call writeExternal()->callback 
	System.out.println("Serialization ended");
	System.out.println("******************************");
	System.out.println("DeSerialization started");
	FileInputStream fis=new FileInputStream("abc.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	d=(ExternalizableDemo)ois.readObject();
	System.out.println(d.i+"======>"+d.j+"======>"+d.k);
	System.out.println("DeSerialization ended");
	oos.close();
	ois.close();
	 }


}
