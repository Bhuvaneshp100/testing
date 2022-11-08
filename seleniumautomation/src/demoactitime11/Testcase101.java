package demoactitime11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class Testcase101 {

	public static void main(String[] args) throws IOException, InterruptedException {
		String filepath="./recourse/actitimeloginpage.properties";
		FileInputStream file=new FileInputStream(filepath);
		Properties propties = new Properties();
		propties.load(file);

		String url = propties.getProperty("url");
		String username = propties.getProperty("username");
		String password = propties.getProperty("password");


		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
		
		Loginpageactitim loginpage=new Loginpageactitim(driver);
		loginpage.login(username, password);
		
		Thread.sleep(3000);	
		Operation operate=new Operation(driver);
		operate.getTaskbutton().click();		

      
	}

}
