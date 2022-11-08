package automationqsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrenturl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		driver.quit();
	}

}
