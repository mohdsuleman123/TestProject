package Com.Orange.testcases;

import org.testng.annotations.Test;

import Com.Orange.base.BaseClass;
import Com.Orange.pages.HomePage;
import Com.Orange.pages.SaveSystemUserPage;
import Com.Orange.pages.SystemUsersPage;

public class SaveSystemUserTest extends BaseClass {


    HomePage homepage;
    SaveSystemUserPage save;
	
	@Test(priority = 5)
	public void searchTest() throws InterruptedException
	{
		homepage=loginpage.login();
		homepage.clickOnAdmin();
		Thread.sleep(2000);
		
		homepage.addBtn();
		save=new SaveSystemUserPage();
	    save.addUserDetails();
		System.out.println("AddButton and Add user is passed");
	}
}
