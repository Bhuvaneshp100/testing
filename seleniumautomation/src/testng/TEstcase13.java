package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TEstcase13 {
	@DataProvider(name="credentias")
	public String[][] getdata() {
		String [] []arr= {{"admin","manager"},{"trainee","trainee"}};
		return arr;
	}

	@Test(dataProvider = "credentias")
	public void login(String username,String pasward) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(pasward);
	driver.findElement(By.tagName("a")).click();
	
	driver.findElement(By.id("logoutLink")).click();
	driver.quit();

}
}