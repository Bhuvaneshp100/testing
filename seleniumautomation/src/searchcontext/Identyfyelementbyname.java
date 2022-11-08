package searchcontext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identyfyelementbyname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("q")).sendKeys("java");
	}

}
