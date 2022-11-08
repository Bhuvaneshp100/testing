package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckIsdesapled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		boolean flag = driver.findElement(By.xpath("//input[@class='form-control']")).isDisplayed();
		if(flag) {
			System.out.println("it is enabled");
		}else
		{
			System.out.println("it is disabled");
		}
		driver.quit();
	}

}
