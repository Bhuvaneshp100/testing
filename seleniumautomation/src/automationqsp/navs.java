package automationqsp;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class navs {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.flipkart.com/");

		Navigation navigate = driver.navigate();

		/*
		 * nav.back(); nav.forward(); nav.refresh();
		 */
		driver.quit();
	} 

}
