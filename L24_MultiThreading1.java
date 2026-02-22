/**
 * @author _karthick
 *
 *Implementing  Runnable is good because it will allow to extend some other class 
 *-->RACING problem -- it is phenomenon in multi_threading where all threads race to use the CPU time without considering the other process
 */
class Bank3 implements Runnable { // Runnable is preferred way to create thread as it overcomes the limitation of single inheritance and since it is a functional interface we can use lambda expression also !!
	@Override
	public void run() {
		System.out.println("Enter login details");
		for (int i = 0; i < 3; i++) {
			System.out.println("Loging In.....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Login completed");
	}
}

class Transaction1 implements Runnable {
	@Override
	public void run() {
		System.out.println("Starting transaction");
		for (int i = 0; i < 3; i++) {
			System.out.println("transacting");
			try {
				Thread.sleep(2000);// sleep() -> To stop/pause the execution of a thread for sometime
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Transaction completed");
	}
}

class Receipt1 implements Runnable {
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

public class L24_MultiThreading1 {// Using Runnable Interface and Use of join() method to orchestrate the threads in a particular order.
	public static void main(String[] args) throws Exception {
		Bank3 b = new Bank3();
		Transaction1 t = new Transaction1();
		Receipt1 r = new Receipt1();
		Thread t1 = new Thread(b);// Thread needs a runnable object
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(r);
		// System.out.println(t1.isAlive());//to check whether the thread have life or not
		// System.out.println(t2.isAlive());
		// System.out.println(t3.isAlive());
		t1.start();
		t1.join();// asks the thread executing this method (main in this case) to join with the t1 thread

		t2.start();
		t2.join();// join() -> To make another thread to wait till it finish the execution that is the Thread to die

		t3.start();
		t3.join();


		// Ohoo now we have login first then transaction next and receipt last in order without any jumbled print statements.
 
		// How ? We used main not to start the next thread until the previous thread is completed using join() method. 
		// Join ask the thread running here the main thread to wait till the thread on which join is called is completed.


		// Good we have achieved the orchestration of threads using join() method. But why we are not seeing this start and join method in real time applications.
		// Because using join() method basically makes the multithreading to a single threading as one thread is waiting for the other to complete its execution.
		// So the ideal way is to use some other inter thread communication techniques to orchestrate.

		// What is that ? ITC is a concept where one thread can communicate with another thread to share the information about the execution state.
		// How ? wait(), notify(), notifyAll() methods are used for ITC. 


		// System.out.println(t1.isAlive());
		// System.out.println(t2.isAlive());
		// System.out.println(t3.isAlive());

	}
}
