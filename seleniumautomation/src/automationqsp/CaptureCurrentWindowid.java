package automationqsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureCurrentWindowid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		String windowid = driver.getWindowHandle();
		System.out.println( windowid );
		 driver.quit();
	}

}
