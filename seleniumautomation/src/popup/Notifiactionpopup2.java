package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Notifiactionpopup2 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
		FirefoxOptions option=new FirefoxOptions();
		option.addPreference(" ", false);
		FirefoxDriver driver = new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
	Robot s = new Robot();

	}

}
