package automationqsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsizee {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		Dimension dimension=new Dimension(200, 500);
		driver.manage().window().setSize( dimension);
		driver.quit();
	}

}
