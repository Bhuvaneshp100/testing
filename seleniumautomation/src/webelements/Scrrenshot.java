package webelements;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrrenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		String timeslap = LocalDateTime.now().toString().replace(":","-");
		File destfile = new File("./screenshot/"+timeslap+"webpage.png");
		tempfile.renameTo(destfile);
		driver.quit();
		
		
	}

}
