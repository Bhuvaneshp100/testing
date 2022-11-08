package javascript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTOVisible {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2100);
		Set<String> allwindow = driver.getWindowHandles();
		String parentid = driver.getWindowHandle();
		allwindow.remove(parentid);
		WebElement cojoblink = driver.findElement(By.xpath("//a[text()=' CEO Jobs']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", cojoblink);
		
		Thread.sleep(1000);
		for(String windows:allwindow) {
			driver.switchTo().window(windows);
		
			driver.close();
		}
	}

}
