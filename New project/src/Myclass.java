import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Myclass {

	public static void main(String[] args)
	{
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalTime timeobj = LocalTime.now();
		System.out.println(timeobj);
		LocalDateTime dttime = LocalDateTime.now();
		System.out.println(dttime);		

	}

}
