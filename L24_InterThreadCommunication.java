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
 */
class Account {
	private int balance;
	boolean valueSet= false;//semaphore
	

	public synchronized void setBalance(int balance) {
		while (valueSet) {
			try {
				wait();//wait belongs to object method
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("credited:" + balance);
		this.balance = balance;
		valueSet= true;
		notify();
	}

	public synchronized void getBalance() {
		while(!valueSet) {
			try {
				wait();//when wait is used the method must be synchronized
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("debited:" + balance);
		valueSet=false;
		notify();
	}
}

class Producer implements Runnable {
	Account account;//producer produces for this object

	public Producer(Account account) {

		this.account = account;
		Thread t = new Thread(this, "Producer");
		t.start();

	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			account.setBalance(i++);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
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
