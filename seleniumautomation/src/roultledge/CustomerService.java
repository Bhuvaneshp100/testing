package roultledge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CustomerService {

	public static void main(String[] args) throws InterruptedException {
		
		//open chromebrowser 
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		//naviagte routledge home page 
		driver.get("https://www.routledge.com/india");
		
		//Accepct  cookies
		driver.findElement(By.xpath("//a[text()='Accept']")).click();
        Thread.sleep(2000);
        
        //scroll down to footer
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        
        //Navigate to customer service page
        WebElement customeservice = driver.findElement(By.xpath("//a[text()='Customer Service']"));
        Thread.sleep(1000); 
        customeservice.click();
        
        //select support area from customer service -custumer service
        WebElement list= driver.findElement(By.xpath("//select[@id='topic']"));
		Select select = new Select(list);
		select.selectByValue("customer");
		
		//Enter email  in email text filed 
		driver.findElement(By.id("email")).sendKeys("bhuvaneshp100@Ggmail.com");
		Thread.sleep(1000); 
		
		//scroll down  
	    js.executeScript("window .scrollBy(130,300)");
		Thread.sleep(1000);
		
		//click on yes requesting a refund
		driver.findElement(By.xpath("//label[@id='refund-yes']")).click();
		
		//enter your message
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("change the product");
		Thread.sleep(1000); 
		js.executeScript("window .scrollBy(130,600)");
		Thread.sleep(1000);
		Actions action =new Actions(driver);
		
		//click on submit button
        WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary cs-non-deskcopy-submit']"));
        action.click(submit).perform();
        
        //verifying message sucessful dispalyed
        String message = driver.findElement(By.xpath("//h1[@class='text-success']")).getText();
        Assert.assertNotNull("Success!",message);
        System.out.println("Your submission was successful"); 
         
        driver.findElement(By.xpath("//a[text()='Editorial Contacts']")).click();
        
        //close brower
      //  driver.quit();
	}

}
