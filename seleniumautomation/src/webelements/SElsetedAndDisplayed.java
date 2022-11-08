package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SElsetedAndDisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement checkbox = driver.findElement(By.name("remember"));
		checkbox.click();
		boolean flag = checkbox.isDisplayed();
		boolean flag2 = checkbox.isSelected();
		if(flag && flag2) {
			System.out.println("elsemet is displayed and checked ,taestcase is pass");
		}else
		{
			System.out.println(" elsementgis not displayed");
		}
		driver.quit();
		
	}

}
