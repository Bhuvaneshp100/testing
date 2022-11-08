 package vttigerpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Capgipage {

	public Capgipage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(id="Campaigns_listView_basicAction_LBL_ADD_RECORD")
		private  WebElement addcampaign;

		public WebElement getAddcampaign() {
			return addcampaign;
		}

		public void setAddcampaign(WebElement addcampaign) {
			this.addcampaign = addcampaign;
		}
			
		

	}


