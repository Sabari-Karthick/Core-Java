
public class L23 {//user defined exception
	public static void main(String[] args) {//create your own exception class//create a constructor that accept string//call the super class
		int i=5;
		int j=7;
		try{
			int k=i/j;
			if( k==0)
			throw new zackException("undefined value");
			System.out.println(k);
			
		}
		catch (zackException e) {
			// TODO: handle exception
			System.out.println("error "+e.fillInStackTrace());
		}
		
		
	}

}
