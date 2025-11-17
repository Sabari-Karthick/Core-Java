/**
 * @author _karthick
 *         if you want to allow one thread to work with the method we can use
 *         synchronized keyword
 *         for example:
 *         --> all methods in StringBuffer are synchronized
 * 
 * 
 * 
 */
class Counter {
	int count;

	int synchronizedCount;

	public void count() {
		count++;
	}

	public synchronized void synchronizedCount() {
		synchronizedCount++;
	}
}

public class L25_Synchronized {
	public static void main(String[] args) throws Exception {
		Counter c = new Counter();

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 10000; i++) {
				c.count();
			}

		});
		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 10000; i++) {
				c.count();
			}

		});

		Thread t3 = new Thread(() -> {
			for (int i = 1; i <= 10000; i++) {
				c.synchronizedCount();
			}

		});

		Thread t4 = new Thread(() -> {
			for (int i = 1; i <= 10000; i++) {
				c.synchronizedCount();
			}

		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		t3.start();
		t4.start();

		t3.join();
		t4.join();



		// Here we never get 20000 because of the thread interference.
		// Because It is a non-atomic operation.
		// What is atomic operation? 
		// Lets Consider the count++ operation.
		// It consists of 3 steps
		// 1. Read the value of count variable
		// 2. Increment the value
		// 3. Write the value back to count variable
		// Now consider two threads are executing the count++ operation simultaneously.
		// Both the threads read the same value of count variable.
		// Both increment the value.
		// Both write the same value back to count variable.
		// So the final value of count variable is incremented only once instead of twice.
		// At Some Time they may one after another and we may get the expected result.
		// But most of the time we will not get the expected result.
		// Here the operation is non-atomic because it is not indivisible.
		// To make it atomic we need to use synchronized keyword.
		// In Concurrent Programming this is called as Race Condition. And the Counter is called as Shared Resource.
		// The Golden Rule in Concurrent Programming is "Never allow multiple threads to access a shared resource simultaneously".
		System.out.println("Count is :" + c.count);


		System.out.println("Syncronized Count :: " + c.synchronizedCount);
		// Note : But if the scenario is we need to make a Shared resource thread safe synchronized is never the solution.
		// Eg : Say in a Booking Application we have 1 ticket available.
		// Now ten users are trying to book the ticket simultaneously.
		// We cant simultaneously allow one user to book the ticket and make other users wait.
		// Like in Code we cant simply put book() method as synchronized. It will make other users wait. And that is not a good user experience.
		// There are many Better strategies Used But for Application Startup Kinda things and we need synchronization needed means we can go for synchronized keyword.
		// But even for that instead of method level synchronization we can go for block level synchronization to improve performance. // We see that later.
	}
}
