package automationqsp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseperticulaerWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> windowids = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>( windowids);
		String thridwindowid = list.get(2);
		driver.switchTo().window(thridwindowid);
		driver.close();
		
	}

}
