package Exercises;

import java.text.SimpleDateFormat;
import java.util.Calendar;
class Example
{
	public static void main(String args[])
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal = Calendar.getInstance();
		System.out.println("Current Date: "+sdf.format(cal.getTime()));
		cal.add(Calendar.DAY_OF_MONTH, 1);  
		String newDate = sdf.format(cal.getTime());  
		System.out.println("Incremnted current date by one: "+newDate);
	}
}