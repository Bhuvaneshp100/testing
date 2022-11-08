package vttigerpom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MAinpage {

	public static void main(String[] args) throws IOException, InterruptedException {
		String path="./recourse/vtiger.properties";
		Propertyuntil proputil=new Propertyuntil();
		String url = proputil.getpropertydata(path, "url");
		String username = proputil.getpropertydata(path, "username");
		String password = proputil.getpropertydata(path, "psd");
		String name = proputil.getpropertydata(path, "name");
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		Loginpage loginpage = new Loginpage(driver);
		loginpage.login(username, password);
		
		Mainloginpage mainpage=new Mainloginpage(driver);
		mainpage.campaginmain();
		
		Capgipage addcapgipage=new Capgipage(driver);
		addcapgipage.getAddcampaign().click();
		
		CreatNewCampagin newcampagin=new CreatNewCampagin(driver);
		newcampagin.createcampagin(name);
		
		Singout singoutpage=new Singout(driver);
		singoutpage.pagesingout();
		driver.quit();
		
	}

}
