package vttigerpom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase {

	public static void main(String[] args) throws IOException, InterruptedException {
		String path="./recourse/vtiger.properties";
		Propertyuntil proputil=new Propertyuntil();
		String url = proputil.getpropertydata(path, "url");
		String username = proputil.getpropertydata(path, "name");
		String password = proputil.getpropertydata(path, "psd");
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		
		Loginpage loginpage = new Loginpage(driver);
		loginpage.login(username, password);
		driver.quit();   

	}

}
