/**
 * @author _karthick
 *
 *Thread-->line of execution/flow control of execution/small unit of program 
 *the main method is a default thread 
 *  
 * Two ways of creating Threads:
 *      ->Extending thread class
 *      ->implementing runnable interface
 *  
 *  If a new thread is created by user it will only execute the run method from there we can call any other needed method
 *  -->run() is the definition of the thread
 *  
 *  
 *-->start() method gives the thread to the thread to thread scheduler and it will internally call the run method
 *-->if we call the run() it will behave like a single threaded program  and there  is no use
 *
 *
 */
class Bank2 extends Thread {
	@Override
	public void run() {
		System.out.println("Enter login details");
		for (int i = 0; i < 3; i++) {
			System.out.println("Logging.....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Login completed");
	}
}

class Transaction extends Thread {
	@Override
	public void run() {
		System.out.println("Starting transaction");
		for (int i = 0; i < 3; i++) {
			System.out.println("transacting");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Transaction completed");
	}
}

class Receipt extends Thread {
	@Override
	public void run() {

		System.out.println("Preparing receipt");
		for (int i = 0; i < 3; i++) {
			System.out.println("creating.....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Here is your receipt");
	}

}

public class L24_MultiThreading {// Thread Based multitasking in application to show the problem of multithreading the random rate of execution.
	public static void main(String[] args) {
		Bank2 b = new Bank2();
		Transaction t = new Transaction();
		Receipt r = new Receipt();
		b.start();
		t.start();
		r.start();


		// This Example if you see the output the three threads are executing simultaneously without waiting for each other.
		// So the print statements wont make any sense as they are jumbled up. and this is the problem with Multithreading.

		// We need to orchestrate the threads in such a way that the Transaction thread should start only after the completion of Bank thread.
		// And the Receipt thread should start only after the completion of Transaction thread.
		// How ? Then there comes the another Thread Lifecycle method called join().


		// What join() means ? join() methods tells the current thread or the main thread to wait for the completion of the thread on which the join() method is called.
	}
}
