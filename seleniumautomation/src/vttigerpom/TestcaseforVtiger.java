package vttigerpom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestcaseforVtiger {

	public static void main(String[] args) throws IOException, InterruptedException {
		String path="./recourse/vtiger.properties";
		FileInputStream file = new FileInputStream(path);
		Properties properties = new  Properties();
		properties.load(file);
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("psd");
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		
		Loginpage loginpage = new Loginpage(driver);
		loginpage.login(username, password);
		//driver.quit();   
	}

}
