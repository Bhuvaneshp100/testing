package revisee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1424 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fifa.com/fifa-world-ranking/men?dateId=id13407");
		List<WebElement> countryname = driver.findElements(By.xpath("//table[@class='fc-ranking-list-full_rankingTable__1u4hs']/tbody/*/*[3]"));
		ArrayList<String> list = new ArrayList<String>();
		for( WebElement name:countryname) {
			//System.out.println(name.getText());
			String names = name.getText();
			list.add(names);
		}
	
		
		
		for(String countrynames:list) {  
			 System.out.println(countrynames);
		 }
		

	}

}
