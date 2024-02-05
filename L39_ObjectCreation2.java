/*
 * Singleton classes : For any java class if we are allow to create only one
 * object, such type of class is said to be singleton class. Example: 1) Runtime
 * class 2) ActionServlet 3) ServiceLocator 4) BusinessDelegate eg#1 Runtime
 * r1=Runtime.getRuntime();//getRuntime() method is a factory method Runtime
 * r2=Runtime.getRuntime(); Runtime r3=Runtime.getRuntime();
 * .................................................
 * .................................................
 * System.out.println(r1==r2);//true System.out.println(r1==r3);//true Advantage
 * of Singleton class : If the requirement is same then instead of creating a
 * separate object for every person we will create only one object and we can
 * share that object for every required person we can achieve this by using
 * singleton classes.
 * 
 * That is the main advantages of singleton classes are Performance will be
 * improved and memory utilization will be improved. Creation of our own
 * singleton classes: We can create our own singleton classes for this we have
 * to use private constructor, static variable and factory method. class Test {
 * 
 * private static Test t=null; private Test(){}//to avoid object creation by the
 * user using new
 * 
 * keyword
 * 
 * public static Test getTest() //getTest() method is a factory method {
 * if(t==null){ t=new Test(); } return t; }
 * 
 * } class Client{
 * 
 * public static void main(String[] args){
 * System.out.println(Test.getTest().hashCode());//1671711
 * System.out.println(Test.getTest().hashCode());//1671711
 * System.out.println(Test.getTest().hashCode());//1671711
 * System.out.println(Test.getTest().hashCode());//1671711 }
 * 
 * } We can create any xxxton classes like(double ton,triple ton...etc) Example:
 * class Test {
 * 
 * private static Test t1=null; private static Test t2=null private Test(){}
 * public static Test getTest()//getTest() method is a factory method {
 * if(t1==null){ t1=new Test(); return t1; } else if(t2==null){ t2=new Test();
 * return t2; } else{ if(Math.random()<0.5) //Math.random() limit : 0<=x<1
 * return t1; else return t2;
 * 
 * }
 * 
 * } } public class Client{ public static void main(String[] args){
 * 
 * System.out.println(Test.getTest().hashCode());//1671711
 * 
 * System.out.println(Test.getTest().hashCode());//11394033
 * System.out.println(Test.getTest().hashCode());//11394033
 * System.out.println(Test.getTest().hashCode());//1671711
 * 
 * } } Factory method: By using class name if we are calling a method and that
 * method returns the same class object such type of method is called factory
 * method. Example: Runtime r=Runtime.getRuntime();//getRuntime is a factory
 * method. DateFormat df=DateFormat.getInstance(); If object creation required
 * under some constraints then we can implement by using factory method.
 * Calendar calendar = Calendar.getInstance();//static factory methods String
 * result = "name".toUpperCase();//instance factory methods Different ways of
 * Creating an Object 1. using new Operator Test t=new Test(); 2. using
 * newInstance() Class.forName("com.abc.main.Test").newInstance() 3. using
 * clone() Test t2=(Test)t1.clone(); 4. using factorymethods Runtime
 * r=Runtime.getRuntime(); DateFormat df=DataFormat.getInstance(); 5. using
 * Serialization and DeSerialization FileInputStream fis=new
 * FileInputStream("abc.ser"); ObjectInputStream ois=new ObjectInputStream(fis);
 * Test t=(Test)ois.readObject(); new Vs newInstance( ) : 1. new is an operator
 * to create an objects , if we know class name at the beginning then we can
 * create an object by using new operator . 2. newInstance( ) is a method
 * presenting class " Class " , which can be used to create object. 3. If we
 * don't know the class name at the beginning and its available dynamically
 * Runtime then we should go for newInstance() method public class Test { public
 * static void main(String[] args) throws Exception { Object
 * o=Class.forName(arg[0]).newInstance( ) ;
 * System.out.println(o.getClass().getName( ) ); } } If dynamically provide
 * class name is not available then we will get the RuntimeException saying
 * ClassNotFoundException To use newInstance( ) method compulsory corresponding
 * class should contains no argument constructor , otherwise we will get the
 * RuntimeException saying "InstantiationException".
 * 
 * if the constuctor is private then it would result in "IllegalAccessException"
 * Difference between new and newInstance( ) : new === new is an operator ,
 * which can be used to create an object. We can use new operator if we know the
 * class name at the beginning. Test t= new Test( ); If the corresponding .class
 * file not available at Runtime then we will get RuntimeException saying
 * NoClassDefFoundError , It is unchecked. To used new operator the
 * corresponding class not required to contain no argument constructor
 * newInstance( ) ============ newInstance( ) is a method , present in class
 * Class , which can be used to create an object . We can use the newInstance( )
 * method , If we don't class name at the beginning and available dynamically
 * Runtime. Object o=Class.forName(arg[0]).newInstance( ); If the corresponding
 * .class file not available at Runtime then we will get RuntimeException saying
 * ClassNotFoundException , It is checked. To used newInstance( ) method the
 * corresponding class should compulsory contain no argument constructor , Other
 * wise we will get RuntimeException saying InstantiationException. Difference
 * between ClassNotFoundException & NoClassDefFoundError : 1. For hard coded
 * class names at Runtime in the corresponding .class files not available we
 * will get NoClassDefFoundError , which is unchecked
 * 
 * Test t = new Test( ); In Runtime Test.class file is not available then we
 * will get
 * 
 * "NoClassDefFoundError" 2. For Dynamically provided class names at Runtime ,
 * If the corresponding .class files is not available then we will get the
 * RuntimeException saying "ClassNotFoundException".
 * 
 * Ex : Object o=Class.forname("Test").newInstance( ); At Runtime if Test.class
 * file not available then we will get the "ClassNotFoundException" , which is
 * checked exception. Difference between instanceof and isInstance( ) :
 * instanceof instanceof an operator which can be used to check whether the
 * given object is particular type or not We know at the type at beginning it is
 * available. eg: String s = new String("sachin"); System.out.println(s
 * instanceof Object );//true //If we know the type at the beginning only.
 * isInstance( ) isInstance( ) is a method , present in class Class , we can use
 * isInstance( ) method to checked whether the given object is particular type
 * or not We don't know at the type at beginning it is available Dynamically at
 * Runtime. class Test { public static void main(String[] args) {
 * 
 * Test t = new Test( ) ;
 * 
 * System.out.println(Class.forName(args[0]).isInstance(t));////arg[0] --- We
 * don't know the type at beginning } } java Test Test //true java Test String
 * //false java Test Object //true
 */