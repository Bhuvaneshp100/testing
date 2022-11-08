package revisee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		String expectedtittle="actiTIME - Enter Time-Track";
		String actualtittle = driver.getTitle();
	
		if(actualtittle.equals(expectedtittle)) {
			System.out.println("test is pass correct tittle");
		}
		else
		{
		System.out.println("test is fail wrong tittle");	
		}
		Thread.sleep(1000);
		driver.findElement(By.id("logoutLink")).click();
		driver.quit();

	}
	

}
