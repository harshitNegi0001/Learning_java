import java.util.*;

public class GregoryCalendar {
	public static void main(String[] args) {
		GregorianCalendar c2= new GregorianCalendar(TimeZone.getTimeZone("Asia/Kolkata"));
		
		System.out.println("Current time is : "+c2.get(Calendar.HOUR)+":"+c2.get(Calendar.MINUTE)+":"+c2.get(Calendar.SECOND));
		System.out.println("Date = "+c2.get(Calendar.DATE)+"/"+c2.get(Calendar.MONTH)+"/"+c2.get(Calendar.YEAR));
		
		c2.add(Calendar.DATE,1);
		System.out.println("after updating date , Date :"+c2.get(Calendar.DATE));
		System.out.println("Type of this calendar is "+c2.getCalendarType());
			
		System.out.println("Timezone ID of this calendar is "+c2.getTimeZone().getID());
			
		System.out.println("Timezone of this calendar is : "+c2.getTimeZone());
	}
	
}