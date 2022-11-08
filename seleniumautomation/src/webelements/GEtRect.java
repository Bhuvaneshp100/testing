package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GEtRect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		 Rectangle usernamefeild = driver.findElement(By.id("username")).getRect();
		 int height = usernamefeild.getHeight();
		int width = usernamefeild.getWidth();
		 int xvalue = usernamefeild.getX();
		int yvalue = usernamefeild.getY();
		System.out.println(height);
		System.out.println(width);
		System.out.println(xvalue);
		System.out.println(yvalue);
		driver.quit();
		}
	

}
