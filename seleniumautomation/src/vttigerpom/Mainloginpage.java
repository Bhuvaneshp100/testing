package vttigerpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mainloginpage {
	public Mainloginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

		@FindBy(id="appnavigator")
		private WebElement threelinetool;
		
		@FindBy(id="MARKETING_modules_dropdownMenu")
		private WebElement marcketing;
		
		@FindBy(xpath ="//span[contains(text(),' Campaigns')]")
		private WebElement Campaigns;

		public WebElement getThreelinetool() {
			return threelinetool;
		}

		public void setThreelinetool(WebElement threelinetool) {
			this.threelinetool = threelinetool;
		}

		public WebElement getMarcketing() {
			return marcketing;
		}

		public void setMarcketing(WebElement marcketing) {
			this.marcketing = marcketing;
		}

		public WebElement getCampaigns() {
			return Campaigns;
		}

		public void setCampaigns(WebElement campaigns) {
			Campaigns = campaigns;
		}
		
	public void campaginmain() {
		threelinetool.click();
		marcketing.click();
		Campaigns.click();
		
	}
			
		
		
		
		
	}


