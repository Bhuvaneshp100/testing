package demoactitime11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Operation {
  public Operation(WebDriver driver) {
	  PageFactory.initElements(driver, this);
}
  @FindBy(xpath="//div[text()='Tasks']")
  public WebElement taskbutton;
public WebElement getTaskbutton() {
	return taskbutton;
}
public void setTaskbutton(WebElement taskbutton) {
	this.taskbutton = taskbutton;
}
}
