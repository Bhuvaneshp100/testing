package popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionAssig2 {

	public static void main(String[] args) {

		String expectedtittle = "Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com";

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		String actualtittle = driver.getTitle();
		String parentids = driver.getWindowHandle();
		Set<String> allwindowisds = driver.getWindowHandles();
		allwindowisds.remove(parentids);
			System.out.println(	driver.getTitle());
		for(  String ids:allwindowisds){
			driver.switchTo().window(ids);
			driver.close();
		}
			if(actualtittle.equals(expectedtittle)){
				System.out.println("test is pass correct tittle");
			}
			else {
				System.out.println("test is fail wrong tittle");
			}

			driver.quit();
		}

	}
