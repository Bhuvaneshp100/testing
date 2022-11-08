package automationqsp;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class PrinttittleinAccending {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			ChromeDriver driver =new ChromeDriver();
			driver.get("https://www.naukri.com/");
			Set<String> windowids = driver.getWindowHandles();
			ArrayList<String> list = new ArrayList<String>();
			for(  String ids :windowids) {
				driver.switchTo().window(ids);
				list.add(driver.getTitle());
			}
			System.out.println(list);
			Collections.sort(list);
			for(   String tittle:list) {
				System.out.println(tittle);
			}
		driver.quit();
	}

}
