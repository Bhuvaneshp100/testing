package revisee;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getposition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		Point point = driver.manage().window().getPosition();
		int positionx = point.getX();
		int positiony = point.getY();
		System.out.println(positionx );
		System.out.println(positiony);
	}

}
