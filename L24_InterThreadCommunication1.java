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
 *                                                   
 *                                 
 */
class Producer1 extends Thread
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
	    		  sb.append(i+",");
				Thread.sleep(100);
				System.out.println("appending");
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
	      }
	      dataProvider=true;
     }
}
class Consumer1 extends Thread
{
	Producer1 producer;//producer object to get the get the produced object of SB
	
	public Consumer1(Producer1 producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
		while(producer.dataProvider==false)
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
