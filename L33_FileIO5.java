import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

//Requirement => Write a program to perform extraction of mobile no only if there is no duplicates
public class L33_FileIO5 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("E8.txt");
		// copy from file1.txt to file3.txt
		BufferedReader br1 = new BufferedReader(new FileReader("mob.txt"));
		String line ;
		BufferedReader br2 = null;
		while ((line =br1.readLine())!= null) {
			boolean isAvailable = false;
			br2 = new BufferedReader(new FileReader("dupmob.txt"));
			String target ;
			while ((target= br2.readLine()) != null) {
				if (line.equals(target)) {
					isAvailable = true;
					break;
				}
				
			}
			if (isAvailable == false) {
				pw.println(line);
				pw.flush();// flush to ensure all data is written to the file
			}
		
		}
		// closing the resources
		br1.close();
		br2.close();
		pw.close();

		BufferedReader br = new BufferedReader(new FileReader("E8.txt"));
		String lines;
		while ((lines = br.readLine()) != null) {
			System.out.println(lines);
		}
		br.close();

	}
}
