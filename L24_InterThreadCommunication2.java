/**
 * @author _karthick
 * 
 *  To reduce the efficiency problem we use the methods given by Object class
 *  a.wait() 
 *  b.notify() 
 *  c.notifyAll()
 *  These methods are in  OBject Class and not in Thread Class
 *  wait on thread is done with objects 
 *  These methods will be used by the thread on different types of Objects
 * 
 * If any thread has to call wait(),notify(),notifyAll() then that thread should be the owner of the thread 
 * We say the thread as owner iff the thread has the lock of the object.
 * 
 * =>methods like join,yield,sleep will be applied only on Threads, so only these methods are part of Thread class not Object class.
 *  
 *  wait() -> Whichever thread is expecting the updated result from the object that thread should call wait method.
 *    Whenever wait() is called automatically that thread will release the lock of the Object to the other thread to use that lock.
 * 
 * join() ->makes the independent main statements wait that results in waste of CPU time
 * 
 *  notify() -> Which ever thread wants to update the object,that  thread should call notify() to other thread(one).
 *  notifyAll() -> Which ever thread wants to update the object,that  thread should call notify() to other thread(many).
 */
class K extends Thread
{
	int res=0;
	@Override
	public void run() {

		// Here this refers to the instance of the K.
		synchronized (this) {//producer
			System.out.println("K thread started, Acquired Lock");
			for(int i=0;i<10;i++){
				res+=i;
			}
			System.out.println("K thread notification sent");

			// notify() sends a signal but DOES NOT release the lock immediately.
			// The lock is only released when we exit this synchronized block.
			this.notify();//it needs to notify the lock is released
		}
		
	}

}

/**
 *
 * It have one intentional Bad design of using thread as lock but the main thing is to show "Lock Handover" between 2 threads using wait and notify methods.
 *
 */
public class L24_InterThreadCommunication2 {
 public static void main(String[] args) throws InterruptedException {
	K k = new K();
	k.start();
	// main thread acts as a consumer here
	synchronized (k) {//here main holds the lock of the k object so the k_thread cannot work
		System.out.println("Main thread is performing");

		/* * k.wait() does two things:
		 * 1. Pauses the Main thread.
		 * 2. RELEASES the lock on 'k' so the K-thread can enter its run() method.
		 */
		k.wait();//the current executing thread releases the lock and it enter the wait(sleep)state until the lock is released by the other thread
		System.out.println(k.res);
		
	}
}
}
