package automationqsp;



import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CLoseonlyParentwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com");
	Set<String> windowsids = driver.getWindowHandles();
	for( String ids :windowsids) {
		driver.switchTo().window(ids);
		driver.close();
		
		
	}

}}
 