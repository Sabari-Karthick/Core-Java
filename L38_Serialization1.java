import java.io.*;
/**
 * @author karthick
 * 
 * =======================
 * During default Serialization there may be a chance of lose of information due to transient keyword.
 * -> We can recover this loss of information by using customized serialization.
 * 
 * We can implements customized serialization by using the following two methods. :
 * 1. private void writeObject(ObjectOutputStream os) throws Exception. 
 *        => This method will be executed automatically by jvm at the time of  serialization. 
 *        => It is a callback method. Hence at the time of serialization if we want to perform any extra work we have to define that in this method only. (prepare encrypted password and write encrypted password seperate to the file )
 * 2. private void readObject(ObjectInputStream is) throws Exception. 
 * => This method will be executed automatically by JVM at the time of Deserialization. 
 * Hence at the time of Deserialization if we want to perform any extra activity ->we have to define that in this method only.(read encrypted password , perform decryption and assign decrypted password to the current object password variable )
 *
 */
@SuppressWarnings("serial")
class Acccount implements Serializable{
String name="sachin";
transient String password="tendulkar";//here using transient result in loss of data instead of null we need something otherr represnts this
private void writeObject(ObjectOutputStream oos) throws Exception
{
	oos.defaultWriteObject();//write all the properties
	String encryptedPassword ="#41"+password+"$56";
	oos.writeObject(encryptedPassword);//write the encrypted(transient)
}
private void readObject(ObjectInputStream ois) throws Exception
{
	ois.defaultReadObject();//read all properties

	String encryptedPassword = (String)ois.readObject();
	password = encryptedPassword.substring(3,encryptedPassword.length()-3);


}
}
		
public class L38_Serialization1 {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Acccount acc=new Acccount();
	System.out.println(acc.name +"=====> "+ acc.password);
	System.out.println("Serialization Started");
	FileOutputStream fos= new FileOutputStream("abc.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(acc);//it is callback method called by JVM based on the reference passed
	System.out.println("Serialization ended");
	System.out.println("***********************************");
	System.out.println("DeSerialization Started");
	FileInputStream fis= new FileInputStream("abc.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
    acc=(Acccount)ois.readObject();
	System.out.println(acc.name +"=====> "+ acc.password);
	System.out.println("DeSerialization ended");
	oos.close();
	ois.close();

	
}
}
