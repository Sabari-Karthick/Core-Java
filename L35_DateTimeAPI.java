import java.util.Date;

/**
 * @author _karthick
 * API -> refers to collection of .class files in a package
 * DateTime -> Used in application that is in database connectivity for persistence
 * 
 * We cannot store it in primitives or String as we cannot perform logical operation  based on date and time like the time and date difference
 * 
 *  Deprecated ->no enhancement(Old) is made ->use a higher version
 *  util.Date -> deprecated and not high performance and not  so _Joda-time API is introduced
 *            -> It represents both Date and Time
 *            
 *  java.sql.Date => It is designed class to handle Dates w.r.t DB operations  
 *                => It represents only Date,but not Time.
 *  
 *  
 *  In _sql package:
 *            -> Time(C) represents only => Time value 
 *            ->TimeStamp(C) represents both => Date and Time value
 *  
 *  
 *  
 *  
 */
public class L35_DateTimeAPI {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date date = new Date();//To use Date in general operations like printing the date and time
		System.out.println(date);//Fri _Jan 13 22:27:50 IST 2023 ->Output
		
		long hour = date.getHours();
		long time = date.getTime();
		System.out.println(time);//1673629526773 in _ms
		java.sql.Date datesq = new java.sql.Date(hour);//To use Date in DB operations like insert,update,delete query we use sqlDate //get  milliseconds as parameter
		System.out.println(datesq);//1970-01-01 //from when this function is started
		System.out.println(new java.sql.Date(time));//2023-01-13 
	}

}
