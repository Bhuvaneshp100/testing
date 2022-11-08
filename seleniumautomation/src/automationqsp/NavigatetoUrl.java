package automationqsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatetoUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.flipkart.com/");
		driver.quit();
	}

}
