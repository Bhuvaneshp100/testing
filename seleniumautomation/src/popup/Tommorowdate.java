  package popup;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tommorowdate {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");

		LocalDateTime dateandtime = LocalDateTime.now(); //.plusDays(6);
		int date=dateandtime.getDayOfMonth();
		String month = dateandtime.getMonth().name();
		String editmonth = month.substring(0, 1)+month.substring(1, 3).toLowerCase();
		String waek = dateandtime.getDayOfWeek().name();
		String editweak = waek.substring(0, 1)+waek.substring(1, 3).toLowerCase();
		int year = dateandtime.getYear();
		String todaysdate = editweak+" "+editmonth+" "+date+" "+year;
		System.out.println(todaysdate);

		WebElement click = driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']"));
		Actions action = new Actions(driver);
		action.click(click).perform();
		WebElement datess = driver.findElement(By.xpath("//div[@aria-label='"+todaysdate+"']"));
		action.click(datess).perform();

	}

}
//div[text()='October 2021']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='22']