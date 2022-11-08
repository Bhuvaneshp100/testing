package popup;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SlelectAllNAme {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.marimallappawomenscollege.org/index.php");
	List<WebElement> names = driver.findElements(By.xpath("//ul[@style=\"padding:12px 0 0 12px;\"]/li"));
	for(WebElement name:names) {
		System.out.println(name.getText());
	}
	driver.quit();
		
	}

}
