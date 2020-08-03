package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/*Tester Name:
 * date:
 * approved by:
 * 
 * 
 * 
 */

public class LoginPage extends DriverScript
{
	@FindBy(id="username") WebElement usernameTbox;
	@FindBy(name="pwd") WebElement passwordTbox;
	@FindBy(id="loginButton") WebElement loginButton;
	@FindBy(xpath="//div[@class='atLogoImg']") WebElement actiLogo;
	
//***********************************************************************************	
	
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	} 
	// here in this page you can do three actions and make it as methods and the web elements kept it as an aruguments for each actions
	
	public void validateLoginFunction(String username, String password)
	{
		usernameTbox.sendKeys(username);
		passwordTbox.sendKeys(password);
		loginButton.click();
	
	}
	
	public boolean verifyActiLogo()
	{
		return actiLogo.isDisplayed();
	}
	
	public String verifyLoginPageTitle(){
		return driver.getTitle();
	}
}
