package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;


public class EnterTimePage extends DriverScript
{
//***************************************  Page Element  **************************
	@FindBy(id="logoutLink") WebElement logoutLink;
	@FindBy(xpath="//div[@id='container_tasks']") WebElement taskMenu;
	  
//************************************* Page Initialization   ************************************************************	
	
	public EnterTimePage() 
	{
		PageFactory.initElements(driver, this);
	} 
//****************************************************   Page Actions   ******************************************	
	public void clickLogout()
	{
		logoutLink.click();
		
	}
	
	public void clickTaskMenu()
	{
		taskMenu.click();
	}
	
}
