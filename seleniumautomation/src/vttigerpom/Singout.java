package vttigerpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Singout {

		public Singout(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath = "//a[@class='userName dropdown-toggle pull-right']")
		private WebElement  singoutlogo;
		
		@FindBy(id="menubar_item_right_LBL_SIGN_OUT")
		private WebElement signout;

		public WebElement getSingoutlogo() {
			return singoutlogo;
		}

		public void setSingoutlogo(WebElement singoutlogo) {
			this.singoutlogo = singoutlogo;
		}

		public WebElement getSignout() {
			return signout;
		}

		public void setSignout(WebElement signout) {
			this.signout = signout;
		}
	
	public void pagesingout() {
		singoutlogo.click();
		signout.click();
	}
		
	}

