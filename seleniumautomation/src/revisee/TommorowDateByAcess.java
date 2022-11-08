package revisee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TommorowDateByAcess {

	public static void main(String[] args) {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");		
		WebElement click = driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']"));
		 Actions action = new Actions(driver);
		 action.click(click).perform();
		 driver.findElement(By.xpath("//div[text()='October 2021']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='24']")).click();

	}

}
