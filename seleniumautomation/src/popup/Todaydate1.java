package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Todaydate1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		String date = "Fri Oct 22 2021";
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		
		WebElement click = driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']"));
		 Actions action = new Actions(driver);
		 action.click(click).perform();
		 action.click(click).perform();
		 
		
		
		//WebElement dates = driver.findElement(By.xpath("//div[@aria-label='Fri Oct 22 2021']"));
		//action.doubleClick(dates).perform();
		WebElement dates = driver.findElement(By.xpath("//div[@aria-label='"+date+"']"));
		 action.click(dates).perform();
		

	}

}
