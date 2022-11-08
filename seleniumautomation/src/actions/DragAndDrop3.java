package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
			WebElement frame = driver.findElement(By.xpath("(//iframe)[4]"));
			driver.switchTo().frame(frame);
			
			WebElement source = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
			WebElement destination = driver.findElement(By.xpath("//div[@id='trash']"));
			
			Actions action = new Actions(driver);
			action.dragAndDrop(source, destination).perform();
			//driver.quit(); 
	}

}
