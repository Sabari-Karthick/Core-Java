/**
 * @author karthick
 * Clone () method: 1. The process of creating exactly duplicate object is called cloning. 
 * 2. The main objective of cloning is to maintain backup purposes. 
 * 
 *  -> We can perform cloning only for Cloneable objects. 
 *  -> An object is said to be Cloneable if and only if the corresponding class implements Cloneable interface. 
 *  -> Cloneable interface present in java.lang package and does not contain any methods. It is a marker interface where the required ability will be provided automatically by the JVM. 
 *  -> If we are trying to perform cloning on non-clonable objects then we will get RuntimeException saying "CloneNotSupportedException".
 * 
 * 
 * 
 * 
 * Note: => Shallow cloning is the best choice , if the Object contains only primitive values. 
 * => In Shallow cloning by using main object reference , if we perform any change to the contained object then those changes will be reflected automatically in cloned copy. => To overcome this problem we should go for Deep cloning
 *
 *
 * Singleton classes : For any java class if we are allow to create only one object, such type of class is said to be singleton class. Example: 1) Runtime class 2) ActionServlet 3) ServiceLocator 4) BusinessDelegate
 *
 * Advantage of Singleton class : If the requirement is same then instead of creating a separate object for every person we will create only one object and we can share that object for every required person we can achieve this by using singleton classes.
 *
 *
 */

class Cats
{
int i;
Cats(int i){
this.i=i;
}
}
class Dogs implements Cloneable
{
Cats cat;
int j;
Dogs(Cats cat,int j){
this.cat=cat;
this.j=j;
}
@Override
public Object clone()throws CloneNotSupportedException{
return super.clone();
}
/**
 * Deep Cloning:
 * 1. The process of creating exactly independent duplicate object(including contained objects also) is called deep cloning. 
 * 2. In Deep cloning , if main object contain any reference variable then the corresponding Object copy will also be created in cloned object. 
 * 3. Object class clone( ) method meant for Shallow Cloning , if we want Deep cloning then the programmer is responsible to implement by overriding clone( ) method.
 * Note: 
 * In Deep cloning by using main Object reference if we perform any change to the contained Object those changes won't be reflected to the cloned object.
 * 
 * 
 * 
 * public Object clone()throws CloneNotSupportedException { Cat c1= new
 * Cat(cat.i); Dog d1=new Dog(c1,j); return d1; }
 * 
 * 
 */
}
class Demo12{//Singleton class
	private static Demo12 d = null;//create a private static  object
	private Demo12() {}//private constructo
		public static Demo12 getDemo() {
			if(d==null)
				d=new Demo12();
			return d;
		}
	
	
}

public class L39_ObjectCreation implements Cloneable{//shallow clonng

		public static void main(String[] args)throws CloneNotSupportedException{
		Cats cat=new Cats(10);
		Dogs d1=new Dogs(cat,200);
		System.out.println("Acutal object => "+d1.cat.i+" "+d1.j);

		System.out.println("Perfoming cloning");
		Dogs d2=(Dogs)d1.clone();//the cat is not cloned the reference variable is cloned and point to the old  value
		d2.cat.i=100;
		d2.j=2000;
		System.out.println("Acutal object after cloning => "+d1.cat.i+" "+d1.j);

		System.out.println("Cloned object data => "+d2.cat.i+" "+d2.j);
		Runtime r1 = Runtime.getRuntime();//using the class name we call a method and the method return the object of same class is called factory methods
		Runtime r2 = Runtime.getRuntime();
		System.out.println(r1==r2);//here runtime singleton class
	
		}
}
/**
 * newInstance( ) is a method , present in class Class , which can be used to create
an object .
We can use the newInstance( ) method , If we don't know class name at the beginning and
available dynamically Runtime.
Object o=Class.forName(arg[0]).newInstance( );
 */

//public class L39_ObjectCreation implements  Cloneable{
//	public static void main(String[] args) throws CloneNotSupportedException {
//		Test167 t = new Test167();
//		Test167 t1 =(Test167) t.clone();
//		t1.i=2;
//		System.out.println(t1.i+"        :"+t.i);
//		System.out.println(t1.hashCode()==t.hashCode());
//		
//	}
//}
//class Test167 implements Cloneable {
//	int i=23;
//	public Object clone()throws CloneNotSupportedException{
//		return super.clone();
//	}
//}
