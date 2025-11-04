class Hi extends Thread
{
	public void run() {//start always call run
		for(int i=1;i<=5;i++) {
			System.out.println("hi");
			try {Thread.sleep(1000);}catch (Exception e) {};
			
		}
	}
}
class Hello extends Thread
{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("hello");
			try {Thread.sleep(1000);}catch (Exception e) {};
		}
	}
}

/**
 * When a class extends Thread class, It can be used to create a thread with the help of Thread Lifecycle methods.
 * 
 * First start() method is called which internally calls run() method.
 * 
 * 
 */
public class L24 {//multitasking->(Thread-a unit of process)using more thread
	public static void main(String[] args) {//->main is default thread
		
		Hi hi =new Hi();
		Hello hello = new Hello();
		hi.start(); // Here the Hi Thread is started means the start() method is called which internally calls the run() method of Hi class.
		// But the main thing is Main thread no need to wait for the Hi thread to complete its execution, As Main is also a thread it will continue its execution.


		// ** Note ** : Calling hi.run() here will not create a new thread instead it will behave like a normal method call and the Main thread will wait for the completion of hi.run() method.
		try {Thread.sleep(10);}catch (Exception e) {};//to stop  the random execution
	
		hello.start(); // Here the Third Thread Hello is started means the start() method is called which internally calls the run() method of Hello class.

		// So this example Hi and Hello threads Gets executed simultaneously in a separate thread each means Multitasking.
		// Meanwhile the Main thread will also continue its execution.

		// But here is a point to be noted that the order of execution of Hi and Hello threads is not guaranteed.
		// And After hello.start() we have no lines, but if we have any lines after that, those lines will be executed by Main thread simultaneously with Hi and Hello threads.
		//Which is not Ideal in all the Scenarios. To avoid this we have a method called join() which is used to make the Main thread wait for the completion of Hi and Hello threads before executing any further lines of code in Main thread.
	}

}
