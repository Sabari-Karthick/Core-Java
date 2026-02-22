/**
 * @author _karthick
 * InterThread Communication 
 * --------------------------------------
 *    Two threads should interact with each other, how? 
 *    _Eg: Producer Consumer Problem:
 *               ProducerEnd: => Producer duty is to produce the data and once the data is produced update the variable called "DataProvider" to true
 *                         => This action should be done by "Producer Thread"
 *  
 *  Consumer End: => Consumer Thread should consume the data produced by the Producer 
 *  => Consumer Thread should check the _dataprovider status,if it is true consume the data otherwise sleep for some time and again check for the _dataprovider status
 *
 *
 *
 *  * FLAWS TO NOTE (For later comparison):
 *  * 1. Low-level primitives: Uses wait/notify instead of higher-level Concurrency APIs like BlockingQueue, which can lead to more complex and error-prone code.
 *  * 2. Tight Coupling: The Producer/Consumer are tightly coupled to the Account class.
 *  * 3. Thread Management: Threads are started inside the constructor (a "leaky" practice).
 *
 */
class Account {
	private int balance;

	//State flag
	private boolean valueSet = false;//semaphore

	/**
	 * Producer calls this.
	 * If data is already set, it yields the lock and waits.

	 */
	public synchronized void setBalance(int balance) {
		// CRITICAL: We use 'while' instead of 'if' to handle "Spurious Wakeups".
		// Spurious Wakeups are a phenomenon where a thread can wake up from the wait state without being notified, interrupted, or timing out. This can lead to unexpected behavior if we use 'if' to check the condition before waiting.
		// For example, if we used 'if' there is a possibility that the thread wakes up without the notify() being called and the condition being true , and it will proceed to execute the code that assumes the condition is true, which can lead to incorrect behavior.
		// By using 'while', we ensure that even if a spurious wakeup occurs, the thread will re-check the condition and only proceed when it is actually true.
		while (valueSet) {
			try {
				// It is a short hand for this.wait() because the wait method is called on the current object which is the instance of Account class, so we can directly call wait() without specifying the object reference.

				// wait() can be only called when we have the lock of the object, and when wait() is called the current thread will release the lock of the object and enter into waiting state until another thread calls notify() or notifyAll() on the same object to wake it up.
				// Here a synchronised method is similar to syncronised block with the lock of the current object, so when we call wait() inside a syncronised method it will release the lock of the current object and wait for the notify() to be called by another thread to wake it up.
				wait();//wait belongs to object method
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("credited:" + balance);
		this.balance = balance;
		valueSet= true;
		notifyAll();
	}

	public synchronized void getBalance() {
		while(!valueSet) {
			try {
				wait();//when wait is used the method must be synchronized
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("debited:" + balance);
		if(balance == 10){
			System.out.println("Balance is 10, exiting...");
			System.exit(0);
		}
		valueSet=false;
		notifyAll();
	}
}

class Producer implements Runnable {
	Account account;//producer produces for this object

	public Producer(Account account) {
		this.account = account;
		Thread t = new Thread(this, "Producer"); //Here this refers to the current instance of Producer class which implements Runnable interface, so we can pass this as the target for the Thread constructor.
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			account.setBalance(i++);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}

			if(i == 10){ // Not exiting ,as the producer is still producing and the consumer is consuming, so we need to check the balance in the consumer thread and exit when it reaches 10.
				System.out.println("Producer has produced 10 items, exiting...");
				break;
			}
		}

	}

}

class Consumer implements Runnable {
	Account account;

	public Consumer(Account account) {

		this.account = account;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	@Override
	public void run() {
		while (true) {
			account.getBalance();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

	}
}

public class L24_InterThreadCommunication {
	public static void main(String[] args) {
		Account account = new Account();
		new Producer(account);
		new Consumer(account);
	}
}
