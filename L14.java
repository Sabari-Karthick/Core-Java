class employer{//to ensure the safety of variables that the users should not change it
	private int ID;
    private	String name;
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		System.out.println("SECURITY BREACH");
		this.ID = ID;//this means current running object
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class L14 {//ENCAPSULATION-> Binding data with methods//variables can only be accessed by methods can't initialize in main method
	public static void main(String[] args) {
		employer e1 = new employer();
		e1.setID(1);
		System.out.println(e1.getID());
		
		
	
		
	}

}

