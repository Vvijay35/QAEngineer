package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Oct19_Synchronization extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {		
		
		
		launchActiTimeApplication();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton")).click();
		
		//Thread.sleep(5000);
		
		// Create the object of WebDriver wait class with constructor arguments , mention the max time out
		// Polling interval is 500 MS 
		
		// FluentWait - > ExplictWait with configurable polling interval.. and we can also ignore some exceptions with fluent wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));		
		
		
		boolean logoutLink = false;
		
		try {
			logoutLink = driver.findElement(By.id("logoutLink")).isDisplayed();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Test case Login_001 Failed..");
		}
		
		if(logoutLink)		
			System.out.println("Test case Login_001 Pass");	

		
		closeBrowser();
	}

}
