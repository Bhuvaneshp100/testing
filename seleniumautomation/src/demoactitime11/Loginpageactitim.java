package demoactitime11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpageactitim {
	public Loginpageactitim (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		@FindBy(id="username")
		private WebElement usernametextfiled;
		

		@FindBy(name="pwd")
		private WebElement passwordtextfiled;
		
		@FindBy(xpath ="//div[text()='Login ']")
		private WebElement loginbutton;

	
		public void login(String username,String password) {
			usernametextfiled.sendKeys(username);
			passwordtextfiled.sendKeys(password);
			loginbutton.click();
		}
		

}
