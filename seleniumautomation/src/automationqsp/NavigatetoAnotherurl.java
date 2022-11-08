package automationqsp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatetoAnotherurl {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
					URL url = new URL("https://flipkart.com/");
					driver.navigate().to(url);
					driver.quit();
	}

}
