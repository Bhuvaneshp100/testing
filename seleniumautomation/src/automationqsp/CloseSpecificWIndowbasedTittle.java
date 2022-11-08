package automationqsp;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWIndowbasedTittle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/");
		 String expectedtittle = "Cognizant";
		 Set<String> windowids = driver.getWindowHandles();
		 for( String ids :windowids ) {
			 driver.switchTo().window(ids);
			 System.out.println(driver.getTitle());
			String actualtittle = driver.getTitle();
			if(actualtittle.equals(expectedtittle)) {
				driver.close();
				break;
			}
			
		 }

	}

}
