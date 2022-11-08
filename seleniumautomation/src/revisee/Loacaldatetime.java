package revisee;

import java.time.LocalDateTime;

public class Loacaldatetime {

	public static void main(String[] args) {
						 LocalDateTime dateandtime = LocalDateTime.now();
						 int date=dateandtime.getDayOfMonth();
						 String month = dateandtime.getMonth().name();
						String editmonth = month.substring(0,1).toLowerCase()+month.substring(1, 3).toLowerCase();
						String waek = dateandtime.getDayOfWeek().name();
						String editweak = month.substring(0,1).toLowerCase()+waek.substring(1, 3).toLowerCase();
						int year = dateandtime.getYear();
						
	}

}
