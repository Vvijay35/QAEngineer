package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Java doc for selenium
//https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html

public class Oct11_SeleniumBasics {	
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {	
		
		//login_001();
		//login_002();
		
		// Login_003 Verifying for the forgot Password link to be displayed and verifying for the text of the link..
		String expectedPasswordLinkText = "Forgot your password?";
		launchActiTimeApplication();
		
		boolean linkStatus = driver.findElement(By.xpath("//a[@id='toPasswordRecoveryPageLink']")).isDisplayed();
		
		if(linkStatus)
		{
			System.out.println(" The forgot password link is displayed");
			String ActualPasswordLinkText = driver.findElement(By.xpath("//a[@id='toPasswordRecoveryPageLink']")).getText();
			
			if (expectedPasswordLinkText.equals(ActualPasswordLinkText))			
				System.out.println("Login_003 is  Pass");
			else
				System.out.println("Login_003 is  Fail");
			
		}
		else
		{
			System.out.println(" The forgot password link is not displayed");
			System.out.println("Login_003 is  Fail");
		}
	
		
	}
	
	public static void login_002() throws InterruptedException
	{
		launchActiTimeApplication();	
		loginToActitime("admin","manager123");
		
		boolean result = driver.findElement(By.xpath("//span[contains(text(),'Username or Password')]")).isDisplayed();
		
		if(result)		
			System.out.println("Login_002 is Pass");		
		else
			System.out.println("The error message is not seen .....Login_002 is Failed!!");		
		
		closeBrowser();
	}
	
	
	
	public static void login_001() throws InterruptedException
	{		
		launchActiTimeApplication();
		/*
		 * By b = By.xpath("//input[@id='username']");
		 * 
		 * WebElement userName = driver.findElement(b);
		 * 
		 * userName.sendKeys("admin");
		 * 
		 * WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		 * password.sendKeys("manager");
		 * 
		 * driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		 * 
		 * Thread.sleep(5000);
		 */
		
		loginToActitime("admin", "manager");
		boolean status = driver.findElement(By.xpath("//a[@id='logoutLink']")).isDisplayed();
		
		if(status)
		{
			System.out.println("Login Test case Login_001 Pass");
		}
		else
		{
			System.out.println("Login Test case Login_001 Failed..!!");
		}
		
		closeBrowser();
		
	}
	
	public static void launchActiTimeApplication()
	{
		System.setProperty("webdriver.chrome.driver", "./utilities/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
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
