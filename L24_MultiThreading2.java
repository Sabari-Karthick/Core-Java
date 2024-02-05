/* @author _karthick
 * 
 * Life Cycle of Thread:
 *            new/born -----start()--------> ready/runnable --- Thread Scheduler allocates CPU time---------> running----run() completes---------> dead_state
 * 
 * States: 
 *    -->new , runnable , running , dead,sleep,blocked
 *    
 * DaemonThread-- less priority ,_-->by default all threads are non-Daemon
 * Garbage Collector is a Daemon Thread
 * 
 */

class Weapon implements Runnable {
	String weapon1 = new String("Leviathan Axe");
	String weapon2 = new String("Blades of Chaos");
	String weapon3 = new String("Draupnir Spear");
  //after start both _kratos,_odin are in runnable state and only one get into run(running) state
	public void run() {
		try {
			String name = Thread.currentThread().getName();
			if (name.equals("Kratos")) {
				kratosGetWeapon();
			} else {
               odinGetWeapon();
			}

		} catch (Exception e) {
			System.out.println("intreption!!");
		}
	}

	public void kratosGetWeapon() {
		try {
			Thread.sleep(4000);// to get weapon they need to go meditation
			//here a chance for next waiting thread is given
			synchronized (weapon1) {// synchronized so _odin can't get weapon //to lock the resource
				System.out.println("Kratos got :" + weapon1);
				Thread.sleep(3000);//to get more weapon
				synchronized (weapon2) {
					System.out.println("Kratos got :" + weapon2);
					Thread.sleep(3000);
					synchronized (weapon3) {
						System.out.println("Kratos got :" + weapon3);
						Thread.sleep(3000);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void odinGetWeapon() {
		//this will cause Deadlock
		//when multiple threads are stuck in block state due to mutual dependencies of the requires resources
//		try { 
//			Thread.sleep(4000);// to get weapon they need to go meditation
//			synchronized (weapon3)//to put lock to resource
//			 {// synchronized so _Kratos can't get weapon
//				System.out.println("Odin got :" + weapon3);
//				Thread.sleep(3000);//to get more weapon
//				synchronized (weapon2) 
//				{//if one thread hold one resource and another also request for same resource the thread go to blocked state and get to runnable only after the resource is released 
//					System.out.println("Odin got :" + weapon2);
//					Thread.sleep(3000);
//					synchronized (weapon1) 
//					{
//						System.out.println("Odin got :" + weapon1);
//						Thread.sleep(3000);
//					}
//				}
//			}
			try {
				Thread.sleep(4000);// to get weapon they need to go meditation
				synchronized (weapon1)//to put lock to resource
				 {// synchronized so _Kratos can't get weapon
					System.out.println("Odin got :" + weapon1);
					Thread.sleep(3000);//to get more weapon
					synchronized (weapon2) 
					{//if one thread hold one resource and another also request for same resource the thread go to blocked state and get to runnable only after the resource is released 
						System.out.println("Odin got :" + weapon2);
						Thread.sleep(3000);
						synchronized (weapon3) 
						{
							System.out.println("Odin got :" + weapon3);
							Thread.sleep(3000);
						}
					}
				}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}

public class L24_MultiThreading2 {
	public static void main(String[] args) {
		Weapon w = new Weapon();
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		t1.setName("Kratos");
		t2.setName("Odin");
		t1.start();
		t2.start();

	}
}
