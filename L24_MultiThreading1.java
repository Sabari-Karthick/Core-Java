/**
 * @author _karthick
 *
 *Implementing  Runnable is good because it will allow to extend some other class 
 *-->RACING problem -- it is phenomenon in multi_threading where all threads race to use the CPU time without considering the other process
 */

class Bank3 implements Runnable{
	@Override
	public void run() {
      System.out.println("Enter login details");
      for(int i=0;i<3;i++) {
    	  System.out.println("Logging.....");
    	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
      System.out.println("Login completed");
	}
}
class Transaction1 implements Runnable{
	@Override
	public void run() {
		 System.out.println("Starting transaction");
	      for(int i=0;i<3;i++) {
	    	  System.out.println("transacting");
	    	  try {
				Thread.sleep(2000);//sleep() -> To stop/pause the execution of a thread for sometime
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
	      System.out.println("Transaction completed");
	}
}
class Receipt1 implements Runnable{
	@Override
	public void run() {
	
		 System.out.println("Preparing receipt");
	      for(int i=0;i<3;i++) {
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
public class L24_MultiThreading1 {//Using Runnable Interface
public static void main(String[] args) throws Exception {
	Bank3 b = new Bank3();
	Transaction1 t  = new Transaction1();
	Receipt1 r = new  Receipt1();
	Thread t1 = new Thread(b);//Thread needs a runnable object
	Thread t2 = new Thread(t);
	Thread t3 = new Thread(r);
//	System.out.println(t1.isAlive());//to check whether the thread have life or not
//	System.out.println(t2.isAlive());
//	System.out.println(t3.isAlive());
	t1.start();
	t1.join();//asks main method to join with the t1 thread
	t2.start();
	t2.join();//join() -> To make another thread to wait till it finish the execution that is the Thread to die
	t3.start();
	
	
	t3.join();
//	System.out.println(t1.isAlive());
//	System.out.println(t2.isAlive());
//	System.out.println(t3.isAlive());
	
}
}
