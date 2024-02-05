class hi extends Thread
{
	public void run() {//start always call run
		for(int i=1;i<=5;i++) {
			System.out.println("hi");
			try {Thread.sleep(1000);}catch (Exception e) {};
			
		}
	}
}
class hello extends Thread
{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("hello");
			try {Thread.sleep(1000);}catch (Exception e) {};
		}
	}
}


public class L24 {//multitasking->(Thread-a unit of process)using more thread
	public static void main(String[] args) {//->main is default thread
		
		hi h =new hi();
		hello h2 = new hello();
		h.start();
		try {Thread.sleep(10);}catch (Exception e) {};//to stop  the random execution
	
		h2.start();
	}

}
