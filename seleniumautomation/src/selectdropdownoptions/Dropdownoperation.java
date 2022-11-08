package selectdropdownoptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownoperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/"); 
		WebElement drop = driver.findElement(By.xpath("//select"));
		Select select = new Select(drop);
		boolean flag = select.isMultiple();
		if(flag) {
			System.out.println("it is multiple dropdown");
		}
		else {
			System.out.println("it is single dropdown");
		}
		driver.quit();
	}

}
