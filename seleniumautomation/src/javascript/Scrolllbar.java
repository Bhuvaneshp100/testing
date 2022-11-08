package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolllbar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window .scrollBy(100,600)");
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(100,0)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(-20,0)");
		driver.quit();
	}

}
