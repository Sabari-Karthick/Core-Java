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
		synchronized (this) {//producer
			System.out.println("K thread started");
			for(int i=0;i<10;i++){
				res+=i;
			}
			System.out.println("notification sent");
			this.notify();//it needs to notify the lock is released 
		}
		
	}

}
public class L24_InterThreadCommunication2 {
 public static void main(String[] args) throws InterruptedException {
	K k = new K();
	k.start();
	//consumer
	synchronized (k) {//here main holds the lock of the k object so the k_thread cannot work
		System.out.println("Main thread is performing");
		k.wait();//the current executing thread releases the lock and it enter the wait(sleep)state until the lock is released by the other thread
		System.out.println(k.res);
		
	}
}
}
