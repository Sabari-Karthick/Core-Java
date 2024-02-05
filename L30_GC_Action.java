class Employee5{
	@Override
	public void finalize() throws Throwable {
		System.out.println("Cleaning");
	}
}
public class L30_GC_Action {
@SuppressWarnings("unused")
public static void main(String[] args) throws Exception {
	Employee5 e = new Employee5();
	;;;;;;;;;
	;;;;;;;;;;
	e=null;//Here JVM doesn't call GC due to performance issue,it wait for the end of code
	System.gc();//Call JVM to activate GC thread
	Thread.sleep(2000);
	System.out.println("cleaned");
}
}
