package selectdropdownoptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssiDropDown {

	public static void main(String[] args) {
		
		String expectedcarname = "Volvo";
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu"); 
		WebElement dropdown= driver.findElement(By.name("cars"));
		Select select = new Select(dropdown);
		List<WebElement> allelement = select.getOptions();
	for(WebElement element:allelement) {
			String allcars = element.getText();
			if(expectedcarname.equals(allcars)) {
				System.out.println("test is pass Volvo is present in dropdown ");
				break;
			}
			else
			{
				System.out.println(" test is fail  Volvo is not present in dropdow ");
				break;
			}
		}
	driver.quit(); 
	}
}
