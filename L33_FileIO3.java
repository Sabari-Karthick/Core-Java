
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author karthick
 * 
 * PrintWriter: 
 * => This is the most enhanced Writer to write text data to the file. 
 * => By using FileWriter and BufferedWriter we can write only character data to the File but by using PrintWriter we can write any type of data to the File.
 * 
 * 
 * Character Data => BufferedReader and PrintWriter 
 * Binary Data(img,audio etc...) => InputStream and OutputStream
 *
 */
public class L33_FileIO3 {
public static void main(String[] args) throws IOException {
	PrintWriter pw = new PrintWriter("hello.txt");
	pw.println(10);
	pw.println((char)65);
	pw.println("hello");
	pw.close();
	BufferedReader reader = new  BufferedReader(new FileReader("hello.txt"));
	String line;
	while((line=reader.readLine())!=null) {//It attempts to read next line and return it , from the File. if the next line 	is not available then this method returns null.

	System.out.println(line);

	}

	reader.close(); 
	
	
}
}
