package revisee;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.flipkart.com/");
		Navigation navi=driver.navigate();
		navi.back();
		navi.forward();
		navi.refresh();
	}

}
