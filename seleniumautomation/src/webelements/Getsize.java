package webelements;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Dimension dimenson = driver.findElement(By.id("username")).getSize();
		int heightofusernametextfiled = dimenson.getHeight();
		int widthofusernametextfiled = dimenson.getWidth();
		System.out.println(heightofusernametextfiled);
		System.out.println(widthofusernametextfiled);
		driver.quit();
	}

}
