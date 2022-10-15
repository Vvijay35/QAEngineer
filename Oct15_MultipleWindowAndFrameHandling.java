package com.selenium.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class Oct15_MultipleWindowAndFrameHandling extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

	
		
	
		multipleFrameHandling();
		
		

	}
	
	public static void multipleFrameHandling()
	{
		launchApplication("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		//switching between multiple frames
		
		// first way using Name or ID of the frame
		//driver.switchTo().frame("iframeResult");
		
		// second way using the Index of the frame.. index starting from zero in the odrer of the frames from top to bottom of html 
		//driver.switchTo().frame(1);
		
		// 3d way to Switch to Frame using  WebELement
		
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe1);		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		// to switch to the main window from frame
		driver.switchTo().defaultContent();
		
		System.out.println(driver.getTitle());
	}
	
	public static void creatingAndSwitchingToNewWidnow()
	{

		launchActiTimeApplication();
		
		String firstWinId = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://google.com");
		
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(firstWinId);
		
		System.out.println(driver.getTitle());
		
	}
	
	public static void multipleWindowHandling() throws InterruptedException
	{
		launchActiTimeApplication();
		
		// to fetch the window ID or Handle for the current active window
		//System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		
		Set<String> wids =driver.getWindowHandles();
		
		Iterator<String> itr = wids.iterator();
		
		String firstWindowID = itr.next();		
		String secondWinID = itr.next();
		
		System.out.println(firstWindowID);
		System.out.println(secondWinID);
		
		driver.switchTo().window(secondWinID);		
		Thread.sleep(2000);
		System.out.println("Title of Second window "+driver.getTitle());
		driver.close(); // closes only the active window.
		//driver.quit(); // closes all the window opened by Selenium
		driver.switchTo().window(firstWindowID);
		Thread.sleep(2000);
		System.out.println("Title of first window "+driver.getTitle());
		//driver.close();
		driver.quit();
		
	}

}
