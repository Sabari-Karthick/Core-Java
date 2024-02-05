import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

/**
 * @author _karthick
 * Period object can be used to represent quantity of time
 * Leap Year:
 * => A year may be a leap year if it is evenly divisible by 4. 
 * => Years that are divisible by 100 (century years such as 1900 or 2000) cannot be leap years unless they are also divisible by 400.
 * 
 *
 * Date -> LocalDate(C) 
 * Time -> LocalTime(C) 
 * Date & Time -> LocalDateTime(c)
 * now() --->Current information
 * of() --> user specific information
 * 
 * ZoneId -> Setting up the particular zone to fetch the information
 * ZondDateTime-> To get the Date and time information of any zone.
 * 
 * Period ---> To find difference b/w 2 date Objects
 * Year ---> To check whether the supplied year is leapYear or not.
 */
public class L35_DateTimeAPI3 {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		LocalDate birthOfDate = LocalDate.of(2003, 06, 20);
		Period p = Period.between(birthOfDate, currentDate);
		System.out.printf("age is %d year %d months %ddays\n",p.getYears(),p.getMonths(),p.getDays());
		
		Integer data=Integer.parseInt(args[0]);
		Year year = Year.of(data);
		if(year.isLeap()) {
			System.out.println(args[0]+" is Leap Year!!");
		}
		else {
		System.out.println("Note Leap Year!!");
		}
	}

}
