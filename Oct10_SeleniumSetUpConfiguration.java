package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


 
/*
 
    To download selenium with Java
     
	https://www.selenium.dev/downloads/
	
	To download chrome driver based on your chrome browser version
		
	https://chromedriver.chromium.org/downloads
	
	*/

public class Oct10_SeleniumSetUpConfiguration {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Selenium..... it is very easy and fun to learn...");
		
		// Setting the path to chromedriver  to redirect all the code to chrome browser..
		System.setProperty("webdriver.chrome.driver", "D:\\MorningBatchSAAG_Aug22\\chromedriver.exe");
		
		// To launch the chrome browser...
		WebDriver driver = new ChromeDriver();
		
		// To navigate to an URL
		driver.get("https://demo.actitime.com/login.do");
		
		// To get the page Title
		String pageTitle = driver.getTitle();		
		
		System.out.println(pageTitle);
		
		// To get the current URL
		System.out.println(driver.getCurrentUrl());
		
		// To get the page source..
		//System.out.println(driver.getPageSource());
		 
		// Handling web Elements
		
		
		By b = By.xpath("//input[@id='username']");
		
		WebElement userName = driver.findElement(b);
		
		userName.sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		//driver.quit();
		
		

	}

}
