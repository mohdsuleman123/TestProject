package Com.Orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Orange.base.BaseClass;

public class SaveSystemUserPage extends BaseClass {


		@FindBy(xpath = "//select[@name='systemUser[userType]']//option[1]")
		WebElement userRole;
		
		@FindBy(xpath = "//input[@name='systemUser[employeeName][empName]']")
		WebElement employeeName;
		
		@FindBy(xpath = "//input[@id='systemUser_userName']")
		WebElement userName;
		
		@FindBy(xpath = "//select[@class='formSelect']//option[2]")
		WebElement status;
		
		@FindBy(xpath = "//input[@name='systemUser[password]']")
		WebElement password;
		
		@FindBy(xpath = "//input[@name='systemUser[confirmPassword]']")
		WebElement confirmPassword;
		
		@FindBy(xpath = "//input[@id='btnSave']")
		WebElement save;
		
		
		public SaveSystemUserPage()
		{
			PageFactory.initElements(driver,this);
		}
		
		
		public void addUserDetails() throws InterruptedException 
		{	
			userRole.click();
			employeeName.sendKeys("John Smith");
			Thread.sleep(2000);
			userName.sendKeys("johnsmith123");
			Thread.sleep(2000);
			status.click();
			Thread.sleep(2000);
			password.sendKeys("Qwerty123");
			Thread.sleep(2000);
			confirmPassword.sendKeys("Qwerty123");
			Thread.sleep(2000);
			save.click();
			Thread.sleep(1000);
	
		}
	}        

