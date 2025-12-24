public class L25_LockForCustomObjects {

    private static int counter1 = 0;
    private static int counter2 = 0;

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();


    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                incrementCounter1();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                incrementCounter2();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter1: " + counter1);
        System.out.println("Final Counter2: " + counter2);



        

    }

    private static void incrementCounter1() {

        // It is called as synchronized block
        // It expects to pass an object reference to lock on
        // There are many things we can pass here
        // One pass the class level lock using ClassName.class --> What it do is it locks at the class level.
        // But it is ultimately same as intrinsic lock at method level synchronized static method.
        // The other is we can create custom objects to lock on.
        synchronized (lock1) {
            counter1++;
        }
    }

    // Now we can have different locks for different shared resources.
    // Means we avoid blocking code that is not a shared resource.
    // And also achieved synchronization for multiple shared resources.
    private static void incrementCounter2() {
        synchronized (lock2) {
            counter2++;
        }
    }

    //We used two locks here is because we have two shared resources counter1 and counter2.
    // So if we use a single lock for both the counters then when one thread is updating counter1 the other thread will be blocked even though it wants to update counter2.
    // So to avoid this we used two different locks for two different shared resources.

    // Is it possible to have one lock for multiple shared resources?
    // Yes it is possible by using a common object for multiple shared resources.
    // But it is not recommended because it may lead to unnecessary blocking of threads.


    // But again if the entire method is a shared resource then we can use synchronized method itself.

    
}