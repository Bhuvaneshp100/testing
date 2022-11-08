package automationqsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gettittle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		String expectedtittle="Selenium";
		driver.get("https://www.selenium.dev/");
		String actualtittle=driver.getTitle();
		System.out.println(actualtittle);
		if(expectedtittle.equals(actualtittle)) {
			System.out.println("tastcase is pass");
		}else
		{
			System.out.println("tastcase is fail");
		}
		driver.quit();
	}

}
