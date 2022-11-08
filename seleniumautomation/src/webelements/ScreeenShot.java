package webelements;

import java.time.LocalDateTime;
import java.util.Date;

public class ScreeenShot {

	public static void main(String[] args) {
							String timeslap = LocalDateTime.now().toString().replace(":","-");
							System.out.println(timeslap);
		Date date = new Date();
		System.out.println(date.toString());
	}

}
