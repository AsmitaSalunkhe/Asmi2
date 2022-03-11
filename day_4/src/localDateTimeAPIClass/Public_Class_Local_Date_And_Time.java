package localDateTimeAPIClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Public_Class_Local_Date_And_Time {

	public static void main(String[] args)
	{
		LocalDate date=LocalDate.now();
		System.out.println("Current date is : "+date);
		
		LocalTime time=LocalTime.now();
		System.out.println("Current Time is : "+time);
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println("Current date and Time is : "+dt);
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
		String formatDateTime=dt.format(format);
		System.out.println("formated date& Time is: "+formatDateTime);
		Month month =dt.getMonth();
		int day=dt.getDayOfMonth();
		java.time.DayOfWeek dayofweek=dt.getDayOfWeek();
		int sec=dt.getSecond();
		
		System.out.println("Month is:"+month+"day is:"+day+ "dayofweek is:"+dayofweek);
		
		LocalDate d=LocalDate.of(2022,1,26);
		System.out.println("Republic day is : "+d.getDayOfWeek());
		
		LocalDateTime SpecificDate=dt.withDayOfMonth(26).withYear(2022);
		System.out.println(SpecificDate);

	}

}
