package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		//WebElement homeandlive = driver.findElement(By.xpath("//a[contains(text(),'Home & Living')]"));
		WebElement homeandlive = driver.findElement(By.linkText("HOME & LIVING"));
		Actions action = new Actions(driver);
		
		action.moveToElement(homeandlive).perform();

	}

}
