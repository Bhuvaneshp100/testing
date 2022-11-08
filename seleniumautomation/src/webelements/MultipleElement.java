package webelements;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElement {

	public static void main(String[] args) {

	
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.fifa.com/fifa-world-ranking/men?dateId=id13407");
			driver.manage().window().maximize();
				List<WebElement> teamname = driver.findElements(By.xpath("//table[@class='fc-ranking-list-full_rankingTable__1u4hs']/*[2]//tr[*]/td[3]/*[1]"));
				ArrayList<String> list = new ArrayList<String>();
			for(WebElement names:teamname) {
		
				String nameee = names.getText();
				list.add(nameee);
					
			}
			Collections.sort(list);
			for(String names:list) {
					System.out.println(names);
			}
				driver.quit();
	}

}
