package actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragANdDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.id("box3"));
		WebElement destination = driver.findElement(By.id("box103"));
		WebElement sourcee = driver.findElement(By.id("box6"));
		WebElement destinations = driver.findElement(By.id("box106"));
		WebElement sourcess = driver.findElement(By.id("box2"));
		WebElement destinationss = driver.findElement(By.id("box102"));
		WebElement sourceeee = driver.findElement(By.id("box7"));
		WebElement destinationse = driver.findElement(By.id("box107"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).perform();
		action.dragAndDrop(sourcee, destinations).perform();
		action.dragAndDrop(sourcess,destinationss).perform();
		action.dragAndDrop(sourceeee , destinationse).perform();
	}

}
