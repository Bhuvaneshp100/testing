package popup;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatebyUSingXpathAcess {

	public static void main(String[] args) {
		 LocalDateTime dateandtime = LocalDateTime.now().plusDays(6);
		 int date=dateandtime.getDayOfMonth();
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		WebElement click = driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']"));
		 Actions action = new Actions(driver);
		// action.click(click).perform();
		 action.click(click).perform();
		 WebElement datess = driver.findElement(By.xpath("//div[text()='October 2021']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']"));
		 action.click(datess).perform();
	}

}
