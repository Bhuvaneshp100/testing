package paywheel;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApplyForLeave {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://paywheelcloud.paywheel.net/");
		driver.findElement(By.name("userName")).sendKeys("100003");
		driver.findElement(By.name("passWord")).sendKeys("welcome");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		driver.findElement(By.xpath("//span[text()='APPLY FOR LEAVE']")).click();
 		driver.findElement(By.xpath("//span[text()=' March 2022 ']/ancestor::div[@class='calendar']/descendant::div[@id='23']/../..")).click();
		driver.findElement(By.xpath("//fieldset[@id='leaveTypeInput']")).click();
		driver.findElement(By.xpath("//mat-option[@id='mat-option-18']")).click();
		Thread.sleep(1000);
		WebElement reasonforleave = driver.findElement(By.id("mat-input-2"));
		reasonforleave.click();
		Thread.sleep(1000);
		reasonforleave.sendKeys("fever");
		driver.findElement(By.xpath("//span[text()='Send Request']")).click();
		
		driver.findElement(By.xpath("//span[text()='FM']")).click();
		driver.findElement(By.xpath("//li[text()=' Logout ']")).click();
		Thread.sleep(3000);
		
		driver.get("https://paywheelcloud.paywheel.net/");
		driver.findElement(By.name("userName")).sendKeys("155");
		driver.findElement(By.name("passWord")).sendKeys("welcome");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.findElement(By.xpath("//mat-icon[@title='Manager Services']")).click();
		driver.findElement(By.xpath("//span[contains(text(),' Leave ')]")).click();
		WebElement approve= driver.findElement(By.xpath("//span[contains(text(),' Approve ')]/../../.."));
		Thread.sleep(1000);
		approve.findElement(By.xpath("//input[@placeholder='Comment...']")).sendKeys("leave approved");
		Thread.sleep(5000);
		approve.findElement(By.xpath("//span[contains(text(),' Approve ')]/..")).click();
		driver.quit();
		}

}
