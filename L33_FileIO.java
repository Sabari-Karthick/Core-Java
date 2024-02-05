import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * @author karthick
 * BufferedWriter: It can't communicate with the file directly, it can communicate only with writer Object.
 * 
 * 
 * All IO operations are checked Exceptions
 */
public class L33_FileIO {
	public static void main(String[] args) throws Exception {
		String names[] = {"Zack","SK","Ashok"};
		try {//_buferedwriter is used to write many things and file is one of them
			BufferedWriter writer = new  BufferedWriter(new FileWriter("output.txt"));//it is a relative path or you can use absolute path with double slash
			writer.write("Writing\n");
			writer.write(8+2+"\n");
			for (String string : names) {
				writer.write(string);
				writer.newLine();
			}
			writer.flush();
			writer.close();//IF WE DON't close file is just created and nothing is written
		} catch (IOException e) {
			e.printStackTrace();
		}
		//To read
		try {
			BufferedReader reader = new  BufferedReader(new FileReader("output.txt"));
			String line;
			while((line=reader.readLine())!=null) {//It attempts to read next line and return it , from the File. if the next line 	is not available then this method returns null.

			System.out.println(line);
		
			}
		
			reader.close(); 
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}
		
	}

}

