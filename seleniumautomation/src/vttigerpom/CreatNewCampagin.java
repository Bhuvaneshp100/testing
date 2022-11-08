package vttigerpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatNewCampagin {
	public CreatNewCampagin(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	@FindBy(name ="campaignname")
	private WebElement newname;
	
	@FindBy(id="Campaigns_editView_fieldName_closingdate")
	private WebElement calenderdate;
	
	@FindBy(xpath ="//span[text()='Oct']/ancestor::div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-top']/descendant::td[text()='25']")
	private WebElement selectdate;
	
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement save;

	public WebElement getSave() {
		return save;
	}

	public void setSave(WebElement save) {
		this.save = save;
	}

	public WebElement getNewname() {
		return newname;
	}

	public void setNewname(WebElement newname) {
		this.newname = newname;
	}

	public WebElement getCalenderdate() {
		return calenderdate;
	}

	public void setCalenderdate(WebElement calenderdate) {
		this.calenderdate = calenderdate;
	}

	public WebElement getSelectdate() {
		return selectdate;
	}

	public void setSelectdate(WebElement selectdate) {
		this.selectdate = selectdate;
	}
	
	
	public void createcampagin(String name) {
		newname.sendKeys(name);
		calenderdate.click();
		selectdate.click();
		save.click();
	}
	
		
	
}
