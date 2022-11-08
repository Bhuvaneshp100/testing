package paywheel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//sign in to admin account
		driver.get("https://paywheelcloud.paywheel.net/");
		driver.findElement(By.name("userName")).sendKeys("100003");
		driver.findElement(By.name("passWord")).sendKeys("welcome");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	 
		driver.findElement(By.xpath("//span[text()='OFFSITE ATTENDANCE']")).click();
		Thread.sleep(3000);
	  List<WebElement> approved = driver.findElements(By.xpath("//div[@class='calendar']/descendant::span[contains(text(),'Approved')]"));
	    System.out.println(approved);
	}

}
