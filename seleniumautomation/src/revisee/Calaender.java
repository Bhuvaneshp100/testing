package revisee;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class Calaender {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now().plusDays(3);
		
	String waek = date.getDayOfWeek().name();
		
	String editweak = waek.substring(0, 1)+waek.substring(1, 3).toLowerCase();
	System.out.println(editweak);
		
		 String month = date.getMonth().name();
		 String editmonth = month.substring(0, 1)+month.substring(1, 3).toLowerCase();
		System.out.println(editmonth);
		
		int day = date.getDayOfMonth();
		int year = date.getYear();
		
		
		String calender = editweak+" "+editmonth+" "+day+" "+year;
		System.out.println(calender);
		
	}

}
//Fri Oct 22 2021