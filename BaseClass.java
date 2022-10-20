package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;

	public static void launchActiTimeApplication()
	{		
		launchBrowser();
		driver.get("https://demo.actitime.com/login.do");
		
		

	}
	
	public static void launchBrowser()
	{
		String browser = "firefox";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./utilities/chromedriver.exe");		
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{		
			System.setProperty("webdriver.gecko.driver", "./utilities/geckodriver.exe");
			driver = new FirefoxDriver();
		
		}
		
		driver.manage().window().maximize();
		// Applying implicit wait . it is applied only once where the driver is created and applicable through out the life cycle of the driver..
		// polling interval is 500 MS ( half second )
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public static void launchApplication(String url)
	{
		launchBrowser();
		driver.get(url);
	}
	
	
	
	public static void closeBrowser()	
	{
		driver.quit();
	}
	
	public static void loginToActitime(String userName, String password) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();		
		Thread.sleep(5000);
	}


}
