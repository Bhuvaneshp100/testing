package automationqsp;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllWIndows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> windowid = driver.getWindowHandles();
		 for(  String idss: windowid) {
			 System.out.println(idss);
		}
	}

}
