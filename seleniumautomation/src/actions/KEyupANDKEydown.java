 
package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KEyupANDKEydown {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/feedback.php");
			List<WebElement> navbar = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li"));
			Actions action = new Actions(driver);
			action.keyDown(Keys.CONTROL);
			for(WebElement ele:navbar) {
				action.click(ele);
				
			}
			action.keyUp(Keys.CONTROL);
			action.perform();
		//	driver.quit();
	}

}
