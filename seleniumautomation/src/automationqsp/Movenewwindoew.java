package automationqsp;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Movenewwindoew {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		Point point =new Point(100, 220);
		driver.manage().window().setPosition(point);
	}

}
