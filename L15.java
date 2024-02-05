
public class L15 {//Wrapper class/AutoBoxing//there of some frameworks that only support wrapperclass
	public static void main(String[] args) {
		int j=5;//here int is a primitive data type
		
		@SuppressWarnings("removal")
		Integer i = new Integer(2);//storing value in object -- is called wrapper class(Here <integer>)
		@SuppressWarnings("removal")
		Integer x = new Integer(j);//putting primitive variable in object--is boxing(wrapping in java)
		System.out.println(x);
		j= i.intValue();//unwrapping
		System.out.println(j);
		Integer y =j;//auto boxing
        int a=y;//auto_unboxing  	
        String  s="123";
        int b =Integer.parseInt(s);//parseInt is a Static method so we need to mention the integer class
        System.out.println(a+b);
	}

}
