import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author karthick
 * 
 * Constructors: 
 *         ->FileWriter fw=new FileWriter(String name); 
 *         ->FileWriter fw=new FileWriter(File f);
 *         The above 2 constructors meant for overriding the data to the file. 
 * Instead of overriding if we want append operation then we should go for the following 2 constructors.:
 *            -> FileWriter fw=new FileWriter(String name,boolean append); 
 *            ->FileWriter fw=new FileWriter(File f,boolean append); 
 * If the specified physical file is not already available then these constructors will create that file.
 * 
 * FileReader: => By using FileReader object we can read character data from the file.
 * Constructors: 
 *          ->  FileReader fr=new FileReader(String name); 
 *          ->FileReader fr=new FileReader (File f);
 * 
 *
 * Usage of FileWriter and FileReader is not recommended because of following reason 
 * 1. While writing data by FileWriter compulsory we should insert line separator(\n) manually which is a bigger headache to the programmer. 
 * 2. While reading data by FileReader we have to read character by character instead of line by line which is not convenient to the programmer
 *  To overcome these limitations we should go for BufferedWriter and BufferedReader concepts.
 */
public class L33_FileIO2 {
public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter("info.txt");//will create a file then it will write/override
	//FileWriter fw = new FileWriter("info.txt",true); -> It will append instead of override 
	fw.write("Sabari Karthick\n2017121 ");// here (/n) type of things vary from system to system which conflict the WORA nature so it is one of a drawback
	char[] ch = {'G','C','T',' '};
	fw.write(ch);
	fw.write(73);;
	fw.flush();//good practice //to keep flush To give the guarantee the total data include last character also written to the file.
	fw.close();
	File f = new File("info.txt");
	FileReader fr = new FileReader(f);
//	int x=fr.read();//It attempts to read next character from the file and return its Unicode value. If the next character is not available then we will get -1
//   //if casted as char it return the  character
//	while(x!=-1) {
//	System.out.print((char)x);//Since filereader reads character by character it is slow in performance 
//	x=fr.read();
//	}
	char c[]=new char[(int) f.length()];//in array only maximum size possible of type int
	fr.read(c);//read  and store in array
	for (char d : c) {
		System.out.print(d);
	}
	
	fr.close();
	
	
	
}
}
