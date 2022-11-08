package demoactitime11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webelements.Sendkey;

public class Testcase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		Loginpage loginpage = new Loginpage(driver);
		loginpage.getUsernametextfiled().sendKeys("admin");
		loginpage.getPasswordtextfiled().sendKeys("manager");
		loginpage.getLoginbutton().click();

	}

}
