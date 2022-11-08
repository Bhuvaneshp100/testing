package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLLocction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		 WebElement usernamefeild = driver.findElement(By.id("username"));
		 int startx =usernamefeild .getLocation().getX();
		 int starty =usernamefeild.getLocation().getY();
		 System.out.println(startx);
		 System.out.println(starty);
		 driver.quit();		 
		 
	}
			
}
