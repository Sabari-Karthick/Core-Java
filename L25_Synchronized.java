/**
 * @author _karthick 
 *  if you want to allow one thread to work with the method we can use synchronized keyword
 *  for example:
 *         --> all methods in StringBuffer are synchronized 
 *         
 *         
 *         
 */
class Counter{
	int count;
	public synchronized void count() {
		count++;
	}
}
public class L25_Synchronized {
public static void main(String[] args) throws Exception{
	Counter c =new Counter();
	
	Thread  t1 =  new Thread(()->{
		for(int i=1;i<=1000;i++) {
			c.count(); 
		}
		
		
	});
	Thread  t2 =  new Thread(()->{
		for(int i=1;i<=1000;i++) {
			c.count(); 
		}
		
		
	});
	t1.start();
	t1.join();
	t2.start();

	t2.join();
	System.out.println("Count is :"+c.count);
}
}
