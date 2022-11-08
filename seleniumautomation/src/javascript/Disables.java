package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disables {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/java/technologies/javase/jdk16-archive-downloads.html");
		Thread.sleep(5100);
		 driver.findElement(By.xpath("//a[text()='jdk-16.0.1_linux-aarch64_bin.rpm']")).click();
		 Thread.sleep(5100);
		 WebElement disablefield =driver.findElement(By.xpath("(//div[@class='obttns'])[4]"));
		 Thread.sleep(5100);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()",disablefield);
		 
		
		
	}

}
