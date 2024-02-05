public class L25 {//RUNNABLE INTERFACE
	public static void main(String[] args)throws Exception {//->main is default thread
		Thread t1 =new Thread(()-> {
			for(int i=1;i<=5;i++) {
				System.out.println("hi "+ Thread.currentThread().getPriority());
				try {Thread.sleep(1000);}catch (Exception e) {};
			}			
		},"my  name is thread 1");
		Thread t2 =new Thread(()-> {
			for(int i=1;i<=5;i++) {
				System.out.println("hello");
				try {Thread.sleep(1000);}catch (Exception e) {};
				}	
		},"my name is thread 2");
		System.out.println(t1.getName());//to get the thread name
		//t2.setName("hello thread");//for rename
		System.out.println(t1.getPriority()+" "+t2.getPriority());//priority is from 0 to 10
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
        try {Thread.sleep(10);}catch (Exception e) {};
		System.out.println(t2.getName());
		t2.start();
		System.out.println(t1.isAlive()+",");
		
		t1.join();
		t2.join();//join make main thread to wait to t1,t2 to join
		System.out.println(t1.isAlive());//to detect a thread is running or not
         System.out.println("bye");
		
		
       //synchronization`// when you don't make the method sync that the method,object count ,class is not thread safe
     	//which means the multi_threads can make use of the same the method// 
         //if method is synchronized only one thread can access the method
		
	}

}

