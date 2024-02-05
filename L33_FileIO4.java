import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class L33_FileIO4 {
public static void main(String[] args) throws IOException {
	BufferedReader reader1 = new  BufferedReader(new FileReader("hello.txt"));
	BufferedReader reader2= new  BufferedReader(new FileReader("output.txt"));
	PrintWriter pr = new PrintWriter("Example.txt");
	String line1;
	while((line1=reader1.readLine())!=null) {
		pr.println(line1);
	}
	String line2;
	while((line2=reader2.readLine())!=null) {
		pr.println(line2);
	}
//	while(((line1=reader1.readLine())!=null)|((line2=reader2.readLine())!=null)) {
//		if(line1!=null) {
//		pr.println(line1);
//		}
//		if(line2!=null) {
//		pr.println(line2);
//		}
//	}

	
	pr.flush();
	pr.close();
	reader1.close();
	reader2.close();
	
	
	
	
	
	BufferedReader br = new BufferedReader(new FileReader("Example.txt"));
	String line;
	while((line=br.readLine())!=null) {
		System.out.println(line);
	}
	br.close();
	
}
}
