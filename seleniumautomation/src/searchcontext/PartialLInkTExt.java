package searchcontext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLInkTExt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	  driver.findElement(By.partialLinkText("Forgotten password")).click();
	}

}
