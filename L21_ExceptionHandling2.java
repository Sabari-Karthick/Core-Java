//When Exception occurs:
         //-->We can handle (try and catch)
         //-->Duck the exception (throws)-->it will be used to handle  compile warnings that an exception may occur/ checked exception ->exception checked at compile time by the compiler
        //-->throws does not handle the exception 
         //-->re-throw  the exception(try,catch,throw,throws,finally)-->throwing handled exception
      //-->eg:like  wrong input in one ATM location the handled exception need to be forwarded to bank to block card
public class L21_ExceptionHandling2 {
public static void main(String[] args) throws Exception {
	 System.out.println("Start");
	 Thread.sleep(500 );//ducking using throws
	 System.out.println("End");
	 //if catch block cannot handled the exception  the lines below that will not get executed except the ones in finally
     //if the control is transferring the code only in finally will get executed not any other than that
}
}
