 package popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HiddenDivisonpopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://licindia.in/Home/Policy-Loan-Options");
		driver.findElement(By.xpath("//b[contains(text(),'Pay through Customer Portal')]")).click();
		driver.switchTo().alert().accept();
		String parnetwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		allwindow.remove(parnetwindow);
		for(String window:allwindow) {
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
		}
		driver.quit();
	}
}
//Life Insurance Corporation of India





/*if(actualtittle.equals(expectedtitle)) {
	System.out.println("test is passe tittil is match");
}
else
{
	System.out.println("test is fail tittle is not mathc");
}


*/