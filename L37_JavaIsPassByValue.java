//Java is always Pass bY VALUE
//Reference is also passed always by value -.that is the reference is passed as a value
class Cheese{
	private int  levelOfStickiness;

	public int getLevelOfStickiness() {
		return levelOfStickiness;
	}

	public void setLevelOfStickiness(int levelOfStickiness) {
		this.levelOfStickiness = levelOfStickiness;
	}
	
}
public class L37_JavaIsPassByValue {
public static void main(String[] args) {
	Cheese myCheese = new Cheese();
	myCheese.setLevelOfStickiness(15);
	increaseStickiness(myCheese);//Here the changes made to the cheese object in the increase() will have effect but still java is pass by value 
	/**
	 * myCheese actually holds the reference of cheese object in memory which have the value 15
	 *      ->if the  reference is passed as  the parameter to the function the cheese in the function then get the reference as value and start to point towards the object in the memory(15)
	 *      ->so both variables share(have) same refernce values and pointing towards the same object and the changes also reflect
	 *      
	 * 
	 * 
	 * 
	 */
	System.out.println("My cheese's Stickiness is :"+myCheese.getLevelOfStickiness());
}
private static void increaseStickiness(Cheese cheese) 
{
	cheese.setLevelOfStickiness(cheese.getLevelOfStickiness()+5);
	/**
	 * cheese = new Cheese();
	 * chhese.setLevelOfStinkiness(20)->Here the changes won't reflecct as both have different reference
	 * 
	 */
		
}
}
