/**
 * 
 * @author _karthick
 *
 *
 *--->Synchronization: => this concept is applicable at method level and block level. 
 *   => if we apply synchronization at block level or at method level then only one thread is allowed to execute the block or a method. 
 *   => Advantage -> it resolves the problem of "Data Inconsistency/race condition". 
 *   => DisAdvantage->It increase the waiting time for other threads so it affects the performance of the system.
 *
 *In java we have 2 levels of lock: 
 *           -->Class level lock : A thread needs to execute static synchronized block/method needs class level lock
 *                          -->>this lock is very unique at class level that is only one.
 *
 *           -->Object level lock : A thread needs to execute synchronized block/method needs class level lock
 *                                 -->>this lock is very unique at Object level
 *                                 
 *                     
 *                                 
 */
class Producer1 implements Runnable
{
	StringBuffer sb;//producer producing the data
	boolean dataProvider = false;// variable for thread communication
	
	 public Producer1() {
       sb = new StringBuffer();// SB is created with default  value 16
	
	}

	@Override
	public void run() 
	 {
	      for(int i=1;i<=10;i++)
	      {
	    	  try {
				  sb.append(i);
				  if (i < 10) {
					  sb.append(",");
				  }
				Thread.sleep(100);
				System.out.println("appending");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      }

	      dataProvider=true;
     }
}
class Consumer1 implements Runnable
{
	Producer1 producer;//producer object to get the produced object of SB
	
	public Consumer1(Producer1 producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
		while(!producer.dataProvider)
		{
			try {Thread.sleep(50);} catch (InterruptedException e) {e.printStackTrace();}
		}
		//consume the data
		System.out.println(producer.sb);
	}
}
/**
 *@author _karthick
 *In the above code when the interaction happens b/w 2 threads, always the consumer thread is ready for consumption,but the consumer thread will get the data only when the dataProvider value is set to true. 
 *This increases the waiting time of a thread and makes the CPU time idle,through which communication b/w 2 threads wont be efficient.
 */

// Busy waiting is a technique where a thread continuously checks for a condition to be true without releasing the CPU time, which can lead to inefficient use of resources and increased waiting time for other threads.
// In the above code, the consumer thread is in a busy waiting state as it continuously checks for the dataProvider variable to be true without releasing the CPU time, which can lead to inefficient use of resources and increased waiting time for other threads.
// Here were the wait() and notify() methods come into play to make the communication between threads more efficient by allowing the consumer thread to release the CPU time while waiting for the producer thread to produce the data, and allowing the producer thread to notify the consumer thread when the data is ready for consumption.
public class L24_InterThreadCommunication1 {//here the code is not efficient because the consumer needs to be in sleep state until  the producer thread finishes its sleep and release the lock
 public static void main(String[] args) {
	Producer1 p = new Producer1();
	Consumer1 c = new Consumer1(p);
	Thread t1 = new Thread(p);
	Thread t2 = new Thread(c);
	t2.start();//consumer should be started first
	t1.start();
	
}
}
