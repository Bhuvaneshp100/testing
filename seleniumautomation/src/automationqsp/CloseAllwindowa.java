package automationqsp;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllwindowa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/");
		 Set<String> windowids = driver.getWindowHandles();
		 for(String ids :windowids) {
			 driver.switchTo().window(ids);
			 Thread.sleep(2000);
			 driver.close();
			 
		 }
	}

}
