package automationqsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetpagesourcCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		String actualpagesourcecode=driver.getPageSource();
		System.out.println(actualpagesourcecode);
		driver.quit();
		
	}

}
