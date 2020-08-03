package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.testcase.BaseTest;

public class TaskListPage extends BaseTest
{
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement addNewButton;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement newCustomerItem;
	@FindBy(xpath="(//input[@placeholer='Enter Customer Name'])[2]") WebElement customerNameTBox;
	
	//*******************************
	
	public TaskListPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddNewButton()
	{
		addNewButton.click();
	}
	
	public void clickNewCustomerItem()
	{
		newCustomerItem.click();
	}
	
	public void enterCustomerNameTBox(String customerName)
	{
		customerNameTBox.sendKeys(customerName);
	}
}
