package automationqsp;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseonlyChildwindowaap2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/");
		  String parentids = driver.getWindowHandle();
		  Set<String> allwindowisds = driver.getWindowHandles();
		  allwindowisds.remove(parentids);
		  for(  String ids:allwindowisds){
			  driver.switchTo().window(ids);
			  if(!ids.equals(parentids)) {
				  driver.close();
			  }
		  }
	}

}
