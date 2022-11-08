package revisee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo09 {
	public Demo09(WebDriver driver)	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement ursernametextfiled;
	
	@FindBy(id="psd")
	private WebElement paswardtextfiled;
	
	@FindBy(name="psdd")
	private WebElement loginbutton;

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}

	public WebElement getUrsernametextfiled() {
		return ursernametextfiled;
	}

	public void setUrsernametextfiled(WebElement ursernametextfiled) {
		this.ursernametextfiled = ursernametextfiled;
	}

	public WebElement getPaswardtextfiled() {
		return paswardtextfiled;
	}

	public void setPaswardtextfiled(WebElement paswardtextfiled) {
		this.paswardtextfiled = paswardtextfiled;
	}
	
}
