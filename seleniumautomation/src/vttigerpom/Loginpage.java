package vttigerpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement usernametextfiled;
	

	@FindBy(id="password")
	private WebElement passwordtextfiled;
	
	@FindBy(xpath ="//button[text()='Sign in']")
	private WebElement loginbutton;

	public WebElement getUsernametextfiled() {
		return usernametextfiled;
	}

	public void setUsernametextfiled(WebElement usernametextfiled) {
		this.usernametextfiled = usernametextfiled;
	}

	public WebElement getPasswordtextfiled() {
		return passwordtextfiled;
	}

	public void setPasswordtextfiled(WebElement passwordtextfiled) {
		this.passwordtextfiled = passwordtextfiled;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}
	public void login(String username,String password) throws InterruptedException {
		usernametextfiled.clear();
		usernametextfiled.sendKeys(username);
		passwordtextfiled.clear();
		passwordtextfiled.sendKeys(password);
		Thread.sleep(2000);
		loginbutton.click();
	}
	}


