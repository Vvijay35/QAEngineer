package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Oct13_SeleniumDropDownHandling extends BaseClass {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		launchApplication("file:///D:/MorningBatchSAAG_Aug22/Selenium/SamleLogin.html");
		
		
		// Create the webelement for the dropdown you want to handle
		WebElement carSelect = driver.findElement(By.xpath("//select[@id='carslist']"));
		

		// Create the object of the select class by passing the Webelement of dropdown as constructor argument
		Select selectCar = new Select(carSelect);
		
		Boolean isMultipleType = selectCar.isMultiple();
		
		System.out.println(isMultipleType);
		
	
		selectCar.selectByVisibleText("BMW200");
		Thread.sleep(2000);
		selectCar.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		selectCar.deselectByVisibleText("Volvo");
		Thread.sleep(2000);
		selectCar.selectByVisibleText("Ford");
		
		List<WebElement> items = selectCar.getAllSelectedOptions();
		
		// To get the list Items selected
		System.out.println(items.size());
		
		for(int x = 0; x<items.size(); x++)
		{
			System.out.println(items.get(x).getText());
		}
		
		
		selectCar.deselectAll();
		Thread.sleep(2000);
		closeBrowser();

	}
	
	public static void handlingDropwnBoxes() throws InterruptedException
	{
		launchApplication("https://erail.in/");	
		
		// Create the webelement for the dropdown you want to handle
		WebElement quotaSelect = driver.findElement(By.xpath("//select[@id='cmbQuota']"));
		
		// Create the object of the select class by passing the Webelement of dropdown as constructor argument
		Select selectQuota = new Select(quotaSelect);
		
		System.out.println(selectQuota.isMultiple());
		
		// Select an item using the Visible Text
		selectQuota.selectByVisibleText("Defence");		
		Thread.sleep(3000);		
		// Select an item using the Index
		selectQuota.selectByIndex(2);		
		Thread.sleep(3000);		
		// Select an item using the value attribute
		selectQuota.selectByValue("FT");
		
		// To find which Item of the dropdown is selected..
		String itemSelected = selectQuota.getFirstSelectedOption().getText();
		
		System.out.println(itemSelected);
		
		// To find all the items present in the dropdown
		List<WebElement> items = selectQuota.getOptions();
		
		// To print no of items in dropdown
		System.out.println(items.size());
		
		//To iterate over the list and get the text of every item( Every item is webelement
		for(WebElement m : items)
		{
			System.out.println(m.getText());
		}
		
		
		closeBrowser();
		
		
	}
	
	// The isDisplayed method will throw an exception if the element matching to the xpath is not found....
	public static void handlingNoSuchElementException() throws InterruptedException
	{
		launchActiTimeApplication();		
		
		loginToActitime("admin", "manager");
		
		boolean logouLink = false;
		
		try
		{
			logouLink = driver.findElement(By.xpath("//a[@id='123logoutLink']")).isDisplayed();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		if(logouLink)
		{
			System.out.println(" The login test case passed");
		}
		else
		{
			System.out.println(" The login test case Failed..");
		}	
		
		closeBrowser();
	
	}

}
