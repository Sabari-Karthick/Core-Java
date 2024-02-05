import java.time.ZoneId;
import java.time.ZonedDateTime;
/**
 * @author _karthick
 * ZoneId object can be used to represent Zone.
 * 
 * 
 *
 */
public class L35_DateTimeAPI2 {
public static void main(String[] args) {
	ZoneId zone = ZoneId.systemDefault();
	System.out.println(zone);//Asia_Calcutta
	ZonedDateTime zone1 = ZonedDateTime.now();
	System.out.println(zone1);//2023-01-13T23:58:13.320012200+05:30[Asia_Calcutta]
	ZoneId la = ZoneId.of("America/Los_Angeles");
	ZonedDateTime zt = ZonedDateTime.now(la);
	System.out.println(zt);
	
}
}
