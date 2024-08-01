import java.util.*;

public class Calendar_Class {
	public static void main(String[] args) {
		Calendar c1= Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
		
		
		System.out.println("Type of this calendar is "+c1.getCalendarType());
		
		System.out.println("Timezone ID of this calendar is "+c1.getTimeZone().getID());
		
		
		System.out.println("Year = "+c1.getWeekYear());
		
		System.out.println("Time in milis = "+c1.getTimeInMillis());
		
		System.out.println("Current time is : "+c1.get(Calendar.HOUR)+":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));
		System.out.println("Date = "+c1.get(Calendar.DATE)+"/"+c1.get(Calendar.MONTH)+"/"+c1.get(Calendar.YEAR));	
	}
}