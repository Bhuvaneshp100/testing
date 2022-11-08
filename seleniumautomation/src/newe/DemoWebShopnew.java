package newe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWebShopnew {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		driver.get("http://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("bhuvanesh");
		driver.findElement(By.id("LastName")).sendKeys("p");
		driver.findElement(By.id("Email")).sendKeys("bhuvaneshp88552975@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("bhuvane");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("bhuvane");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		 WebElement computer = driver.findElement(By.xpath("//a[contains(text(),'Computers')]/ancestor::li[@class='inactive']"));
		Actions action=new Actions(driver);
		action.click(computer).perform();
		
		
		//driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
		WebElement element = driver.findElement(By.xpath("//div[@class='block block-category-navigation']/*//li[2]"));
		WebElement elements = driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']"));
	}

}
