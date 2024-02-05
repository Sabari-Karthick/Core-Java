/**
 * @author _karthick
 * 
 * to have own range of data
 * it is used when there is a predefined set of values that do not change
 * Any class Extending _Enum  Becomes _Enum
 * 
 *
 */
enum Days{//predefined set of values that do not change so new key word is not possible
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	}
enum Heros{
	BATMAN(100),SPIDERMAN(90),IRONMAN(85);
	final int levelOFPower;//to not to change the value
	
	 Heros(int levelOfPower) {//the constructor is called times as the number of elements there here it will be called three time if four elements four times
	
		 this.levelOFPower=levelOfPower;
	}
}
public class L34_Enum {
	
public static void main(String[] args) {
		Days day = Days.THURSDAY;//now day have the value of Thursday
		if(day==Days.THURSDAY) {
			System.out.println("It is Thursdday");
		}
		for  (Days i : Days.values()) {
			System.out.println(i);
		}
		System.out.println("The power level of Iron-Man: "+Heros.IRONMAN.levelOFPower);

}
}
