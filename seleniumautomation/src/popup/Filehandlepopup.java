package popup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filehandlepopup {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[text()='Register']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]")).click();
		Runtime.getRuntime().exec("./autoit/AUTOIT.exe");
		//driver.quit();
	}

}
 