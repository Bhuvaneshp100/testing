package newe;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWebShop {

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
		driver.findElement(By.id("Email")).sendKeys("bhuvaneshp87@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("bhuvane");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("bhuvane");
		driver.findElement(By.id("register-button")).click();
		
		driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
		WebElement element = driver.findElement(By.xpath("//div[@class='block block-category-navigation']/*//li[2]"));
		WebElement elements = driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']"));
	
		Actions action=new Actions(driver) ;
		action.click(element).perform();
		action.click(elements).perform();
		WebElement elementss = driver.findElement(By.id("add-to-cart-button-2"));
		WebElement repname = driver.findElement(By.id("giftcard_2_RecipientName"));
		WebElement repemail = driver.findElement(By.id("giftcard_2_RecipientEmail"));
		action.click(repname).perform();
		action.sendKeys("giftcard_2_RecipientName").perform();
		action.click(repemail).perform();
		action.sendKeys("rep200@gmail.com").perform();
		action.click(elementss).perform();
		Thread.sleep(1000);
		//action.click(elementss).perform();
	}
//add-to-cart-button-2
}////input[@class='button-1 register-continue-button']
