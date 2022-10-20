package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Oct20_JavaScriptExecutorAndFirefoxBrowser extends BaseClass {

	//href="/mozilla/geckodriver/releases/download/v0.32.0/geckodriver-v0.32.0-win64.zip"
	public static void main(String[] args) {
		
	launchActiTimeApplication();	

	}
	
	public static void javaScriptExecuteEx()
	{		
		launchActiTimeApplication();
		
		// Down casting driver to JavaScriptExecutor interface level;
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		// casting java Object to String 
		String title = (String) js.executeScript("return document.title");
		System.out.println(title);
		
		
		// Casting java Object to Long 
		long links = (Long) js.executeScript("return document.getElementsByTagName('a').length");
		System.out.println(links);
		
		// Casting Java Object to WebElement 
		//WebElement userName1 = (WebElement) js.executeScript("return document.getElementById('username')");
		//userName1.sendKeys("admin");		
		
		
		WebElement userName = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		WebElement loginButton = driver.findElement(By.cssSelector("a#loginButton"));
		
		js.executeScript("arguments[0].value='admin'", userName);
		js.executeScript("arguments[0].value='manager'", password);
		js.executeScript("arguments[0].click()", loginButton);
		
		closeBrowser();
	}

}
