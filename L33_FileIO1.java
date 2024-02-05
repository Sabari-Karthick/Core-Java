import java.io.File;
import java.io.IOException;

public class L33_FileIO1 {
public static void main(String[] args) throws IOException{
	File f = new File("First.txt");
	/**
	 * This line 1st checks whether abc.txt file is already available (or) not, if it is already available then "f" simply refers that file. 
	 * If it is not already available then it won't create any physical file just creates a java File object represents name of the file.
	 * A java File object can represent a directory also
	 */
    File fd = new File("firstdir");
    System.out.println(fd.exists());
	System.out.println(f.exists());
    fd.mkdir();
	f.createNewFile();
	System.out.println(f.exists());
	System.out.println(fd.exists());
	File d = new File("firstdir","second.txt");
	d.createNewFile();
	System.out.println(d.exists());
	System.out.println(fd.isDirectory());
	System.out.println(d.isFile());
	File movies = new File("D:\\DC");
	String [] dir = movies.list();
  int 	count=0;
	for (String string : dir) {
		File files = new File(movies,string);
		if(files.isFile()) {
		System.out.println(string);
		count+=1;
	}
		
	}
	System.out.println("Movie count:"+count);
	/**
	 * In UNIX everything is a file, java "file IO" is based on UNIX operating system ;hence in java also we can represent both files and directories by File object only.
	 * 
	 */

	
}
}
