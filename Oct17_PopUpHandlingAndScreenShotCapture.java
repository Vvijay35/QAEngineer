package com.selenium.practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class Oct17_PopUpHandlingAndScreenShotCapture extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException, IOException {		
		boolean logoutLink = false;		
		try {
			launchActiTimeApplication();		
			loginToActitime("admin", "manager");		
			logoutLink = driver.findElement(By.xpath("//a[@id='logoutLink12']")).isDisplayed();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Could not log in  Login_001 Test case Failed");						
		}
		
		if(logoutLink)
		{
			System.out.println("Successfully logged in Login_001 Test case Pass");
			// captureScreenShotOnFailure("Login_001"); // in case it is needed  to capture the screenshot for successful test cases..
		}
		else
		{
			System.out.println("Could not log in  Login_001 Test case Failed");
			captureScreenShotOnFailure("Login_001");
			
		}
		
		closeBrowser();
	}
	
	public static void captureScreenShotOnFailure(String fileName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;		
		// this method will return an object of File class
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		// Creating an object of File class where we want to save  the screenshot
		File dest = new File("./results/screenshots/"+fileName+".png");
		
		// Copy the screenshot to the destination mentioned above
		Files.copy(src, dest);	
		
	}
	
	
	public static void capturingScreenShot() throws IOException
	{

		launchActiTimeApplication();
		
		// Down casting driver  to the TakeScreenshot level to access the methods present in the Takescreenshot interface.
		TakesScreenshot ts = (TakesScreenshot)driver;
	
		// this method will return an object of File class
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		// Creating an object of File class where we want to save  the screenshot
		File dest = new File("D:\\screenshot.png");
		
		// Copy the screenshot to the destination mentioned above
		Files.copy(src, dest);	
		
		//Animal a = new dog();
		//Dog d = (Dog)a;
	}
	
	public static void popUpHandling() throws InterruptedException
	{
		launchApplication("https://erail.in/");
		
		driver.findElement(By.xpath("//a[@title='View the route of the train on the map']")).click();
		Thread.sleep(3000);
		
		// To get the text from the alert
		String alertText = driver.switchTo().alert().getText();		
		System.out.println(alertText);
		
		// To enter the text in to a text box which is on the alert
		//driver.switchTo().alert().sendKeys("entering in to the text box on the alert");
		
		// To click on Yes or Ok button of the alert
		driver.switchTo().alert().accept();
		
		// To click on dismiss or no button on the alert..
		//driver.switchTo().alert().dismiss();
		
		closeBrowser();
	}

}
