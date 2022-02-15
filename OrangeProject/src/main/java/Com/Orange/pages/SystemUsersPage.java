package Com.Orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Orange.base.BaseClass;

public class SystemUsersPage extends BaseClass {

	@FindBy(xpath = "//input[@name='searchSystemUser[userName]']")
	WebElement username;
	

	@FindBy(xpath = "//select[@name='searchSystemUser[userType]']//option[2]")
	WebElement userRole;
	

	@FindBy(xpath = "//input[@name='searchSystemUser[employeeName][empName]']")
	WebElement employeename;
	

	@FindBy(xpath = "//select[@id='searchSystemUser_status']//option[2]")
	WebElement status;
	

	@FindBy(xpath = "//input[@class='searchbutton']")
	WebElement search;
	
	
	public SystemUsersPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void searchUser() throws InterruptedException
	{	
		username.sendKeys("aliyah");
		Thread.sleep(2000);
		userRole.click();
		Thread.sleep(2000);
		employeename.sendKeys("khan");
		Thread.sleep(2000);
		status.click();
		Thread.sleep(2000);
		search.click();
	   
	}
	
	
}
