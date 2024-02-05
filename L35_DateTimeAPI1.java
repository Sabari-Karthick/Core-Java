/**
 * @author _karthick
 * 
 * @since 1.8
 * Joda_API: Use Java.time package
 *      
 * new -> is never a efficient way of creating object ->Costly 
 * If we want to represent both Date and Time then we should go for LocalDateTime object.
 *
 */
import java.time.*;
public class L35_DateTimeAPI1 {
public static void main(String[] args) {
	   LocalDate  date =  LocalDate.now();//returns date object
	   System.out.println(date);
	   LocalTime time  = LocalTime.now();//returns time object
	   System.out.println(time);//for time also there are methods to extract data separately
	 int day = date.getDayOfMonth();
	 int month = date.getMonthValue();
	 int year = date.getYear();
	 System.out.println(day+"|"+month+"|"+year);//it is not possible in java.util.Date
	 System.out.printf("%d-%d-%d",day,month,year);//_printf() deals with format specifiers
	 int h = time.getHour();
	 int m = time.getMinute();
	 int s = time.getSecond();
	 int n = time.getNano();
	 System.out.printf("\n%d:%d:%d:%d\n",h,m,s,n);//23:22:41:169454700
	 System.out.println(LocalDateTime.now());
	 LocalDateTime dob= LocalDateTime.of(2003,6,20,6,30);
	 System.out.println(dob+"AM");//our own Time
	 System.out.println("My First Birthday date is:"+dob.plusMonths(12));
	 
}
}
