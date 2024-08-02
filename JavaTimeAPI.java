import java.time.*;

public class Java_Time_API {
	public static void main(String[] args) {
		
		LocalDate d= LocalDate.now();
		System.out.println(d);
		
		LocalDateTime dt= LocalDateTime.now();
		System.out.println(dt);
		
		LocalTime t= LocalTime.now();
		System.out.println(t);
		
		
	}
}