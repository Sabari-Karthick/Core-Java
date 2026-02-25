class Producer2 implements Runnable
{
	StringBuffer sb;

	 public Producer2() {
       sb = new StringBuffer();

	}

	@Override
	public void run()
	 {
	      synchronized (sb) {
			for (int i = 1; i <= 10; i++)
			{

				try {
					sb.append(i + " ");
					Thread.sleep(100);
					System.out.println("appending");
				} catch (InterruptedException e) {e.printStackTrace();}
			}
			sb.notify();
		}

     }
}
class Consumer2 implements Runnable
{
	Producer2 producer;
	
	public Consumer2(Producer2 producer) {
		this.producer = producer;
	}

	@Override
	public void run() 
	{ 
		synchronized (producer.sb) {
			try {
				producer.sb.wait();
			   
				System.out.print(producer.sb);
				
			}
			catch (Exception e) {}
		}
	}

}
public class L24_InterThreadCommunication3
{
	public static void main(String[] args)
	{
	
	Producer2 p = new Producer2();
	Consumer2 c = new Consumer2(p);
	Thread t1 = new Thread(p);
	Thread t2 = new Thread(c);
	t2.start();
	t1.start();

 }
}
