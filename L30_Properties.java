import java.io.*;
import java.util.Properties;

public class L30_Properties {
	public static void main(String[] args)throws Exception
	{
	Properties p = new Properties();//properties object is created
	//Creating a FileInputStream to read the data from a file called "database.properties"

	FileInputStream fis = new FileInputStream("database.properties");
	//Data loaded into properties object through _fis
	p.load(fis);
	System.out.println(p);
	System.out.println();
	System.out.println("URL IS :: "+p.getProperty("url"));
	System.out.println("USERNAME IS :: "+p.getProperty("username"));
	System.out.println("PASSWORD IS :: "+p.getProperty("password"));
	p.setProperty("iNeuron","NavinReddy");//Setting a new property
	FileOutputStream fos = new FileOutputStream("database.properties");
	p.store(fos,"MAP operation got concluded");//Added like a comment
	}
}
