package vttigerpom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) throws IOException {
		
		String path="./recourse/vtiger.properties";
		Propertyuntil proputil=new Propertyuntil();
		String mainurl = proputil.getpropertydata(path,"mainurl");
				
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(mainurl);
		
		Mainloginpage mainpage=new Mainloginpage(driver);
		mainpage.campaginmain();
	}

}
