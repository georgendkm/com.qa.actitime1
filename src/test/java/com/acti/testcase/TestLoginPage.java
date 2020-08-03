package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;

public class TestLoginPage extends BaseTest
{
	/*LoginPage loginPage;
	EnterTimePage enterTimePage;

	public TestLoginPage()
	{
		super(); //super keyword is used to call the parent class constructor.
	}*/
	
	
	
	@Test(priority=0)
	public void verifyLoginPageTitle() throws Exception
	{
	
		String actual = "actiTIME - Login";
		String title = loginPage.verifyLoginPageTitle();
		Thread.sleep(3000);
		System.out.println(title);
		Assert.assertEquals(title, actual);
		
	}
	
	 @Test(priority=2)
	public void validateLoginFunctionality() throws Exception
	{
		
		loginPage.validateLoginFunction("admin", "manager");
		Thread.sleep(2000);
		enterTimePage.clickLogout();
		
		
	}
	 @Test(priority=1)
	 public void verifyActiLogo()
	 {
		
		boolean flag = loginPage.verifyActiLogo();
		Assert.assertTrue(flag);
		
	 }
		
}
