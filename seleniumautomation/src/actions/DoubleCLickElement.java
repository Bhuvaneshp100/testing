package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleCLickElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement plusicon = driver.findElement(By.id("add"));
		Actions action = new Actions(driver);
		action.doubleClick(plusicon).perform();
		action.doubleClick(plusicon).perform();
		action.doubleClick(plusicon).perform();
	}

}
