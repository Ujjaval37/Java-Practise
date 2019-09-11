import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Mytime {

	public static void main(String[] args) 
	{
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalTime timeobj = LocalTime.now();
		System.out.println(timeobj);
		LocalDateTime dttime = LocalDateTime.now();
		System.out.println(dttime);	
		LocalDateTime dat1 = LocalDateTime.now();
		
		System.out.println("Before Formating"+ dat1);
		Scanner sc = new Scanner(System.in);
		String userdate=sc.next();
		
		DateTimeFormatter form =DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		String formatedDate = form.format(dat1);
		System.out.println("After Formating"+ formatedDate);
		
		System.out.println();

	}

}
