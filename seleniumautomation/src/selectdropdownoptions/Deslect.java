package selectdropdownoptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deslect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu"); 
		WebElement dropdown= driver.findElement(By.name("cars"));
		Select select = new Select(dropdown);

	/*	select.selectByIndex(0);
		Thread.sleep(3000);
		select.selectByValue("saab");
		Thread.sleep(3000);
		select.selectByVisibleText("Audi");
		Thread.sleep(3000);

		Thread.sleep(3000);
		WebElement first = select.getFirstSelectedOption();
		System.out.println(first.getText());
		Thread.sleep(3000);
*/
		List<WebElement> allelement = select.getAllSelectedOptions();
		for(WebElement element:allelement) {
			System.out.println(element.getText());
		}
		//driver.quit();
	}

}
