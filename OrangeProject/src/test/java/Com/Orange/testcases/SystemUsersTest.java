package Com.Orange.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Orange.base.BaseClass;
import Com.Orange.pages.HomePage;
import Com.Orange.pages.SystemUsersPage;

public class SystemUsersTest extends BaseClass {

       HomePage homepage;
	
	@Test(priority = 4)
	public void searchTest() throws InterruptedException
	{
		homepage=loginpage.login();
		homepage.clickOnAdmin();
		Thread.sleep(3000);
		
		SystemUsersPage userpage=new SystemUsersPage();
		 userpage.searchUser();
		 
		 System.out.println("searchButtonTest passed");
	}
	
}
