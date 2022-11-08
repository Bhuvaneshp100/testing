package webelements;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotActiTIme {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		File tempfile = driver.findElement(By.xpath("//div[text()='Login ']")).getScreenshotAs(OutputType.FILE);
String timestamp = LocalDateTime.now().toString().replace(":", "-");

File destfile = new File("./screenshot/"+timestamp+"robot.png");

FileUtils.copyFile(tempfile, destfile);
driver.quit();

	}

}
