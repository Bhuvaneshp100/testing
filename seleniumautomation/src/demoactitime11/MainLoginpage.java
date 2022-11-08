package demoactitime11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainLoginpage {
	public  MainLoginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="container_tt")
	private WebElement timetracker;
	
	@FindBy(id="container_tasks")
	private WebElement tasks;
	
	@FindBy(xpath ="//a[text()='Logout']")
	private WebElement logout;

	public WebElement getTimetracker() {
		return timetracker;
	}

	public void setTimetracker(WebElement timetracker) {
		this.timetracker = timetracker;
	}

	public WebElement getTasks() {
		return tasks;
	}

	public void setTasks(WebElement tasks) {
		this.tasks = tasks;
	}

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}
	
	
	
	
		
	

}
