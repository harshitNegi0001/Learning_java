import java.time.*;
import java.time.format.DateTimeFormatter;
public class Java_DateTimeFormatter {
	public static void main(String[] args) {
		
		LocalDate d= LocalDate.now();
		System.out.println(d);
		
		LocalDateTime dt= LocalDateTime.now();
		System.out.println(dt);
		
		LocalTime t= LocalTime.now();
		System.out.println(t);
		
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yy");
		
		System.out.println(dt.format(df1));
		
		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/LLLL/u");
		
		System.out.println(dt.format(df2));
		
		
		
		DateTimeFormatter df3 = DateTimeFormatter.ofPattern("hh:mm:ss a EEEE-dd/LLLL/u");
		
		System.out.println("Current Date Time : " +dt.format(df3));
	}
}