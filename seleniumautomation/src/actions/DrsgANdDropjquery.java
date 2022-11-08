package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrsgANdDropjquery {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
			WebElement frame = driver.findElement(By.xpath("//iframe[1]"));
			driver.switchTo().frame(frame);
			
			WebElement box = driver.findElement(By.id("draggable"));
			
			Actions action = new Actions(driver);
			action.dragAndDropBy(box,200,50).perform();
			
			driver.switchTo().parentFrame();
			String text = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
			
			System.out.println(text);

		//	driver.quit();
	}

}
//entry-title