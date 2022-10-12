package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct12_SeleniumWebElementMethodsCont {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		
	}
	
	
	// findElements method will return the list of WebElements
	// The xpath should also return more than one matching tag..
	public static void findElementxEx()
	{

		launchActiTimeApplication();		
		driver.get("file:///D:/MorningBatchSAAG_Aug22/Selenium/SamleLogin.html");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		// to find  the number of links on a page...
		System.out.println(links.size());
		
		// To find the number of employs in the page
		
		List<WebElement> empName = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		
		// To find the number of employs in the page
		System.out.println(empName.size());
		
		for(int x=0; x<empName.size(); x++)
		{
			String eName = empName.get(x).getText();
			System.out.println(eName);
		}
		
		
		System.out.println(" No of buttons on the webPage");
		System.out.println(driver.findElements(By.xpath("//button")).size());
				
		
		
		closeBrowser();
		
	}
	
	public static void getTagNameEx()
	{

		launchActiTimeApplication();		
		
		WebElement okButton = driver.findElement(By.xpath("//a[@id='loginButton']"));	
		System.out.println(okButton.getTagName());
		
		closeBrowser();
	}
	
	public static void getAttributeEx() throws InterruptedException
	{
		launchActiTimeApplication();
		
		driver.get("file:///D:/MorningBatchSAAG_Aug22/Selenium/SamleLogin.html");
		WebElement img = driver.findElement(By.xpath("//img[@id='mylogo']"));
		Thread.sleep(3000);
		String attVal = img.getAttribute("title");
		//String attVal = img.getAttribute("width");
		//String attVal = img.getAttribute("height");
		//String attVal = img.getAttribute("alt");
		
		System.out.println(attVal);
		
		
		closeBrowser();
	}
	
	public static void isEnabledMethodEx()
	{
		launchActiTimeApplication();
		WebElement okButton = driver.findElement(By.xpath("//a[@id='loginButton']"));		
		
		boolean okButtonStatus = okButton.isEnabled();
		
		System.out.println(okButtonStatus);
		
		closeBrowser();
		
	}
	
	public static void clearEx() throws InterruptedException
	{
		launchActiTimeApplication();
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("admin123");
		Thread.sleep(3000);		
		userName.clear();
		Thread.sleep(3000);
		userName.sendKeys("admin");
		closeBrowser();
	}
	
	
	public static void isSelectedEx()
	{
		launchActiTimeApplication();
		
		WebElement remChecBox = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		
		// isSelected method is used for checking the status of a checkbox or Radio button
		boolean chechBoxStatus = remChecBox.isSelected();
		System.out.println(chechBoxStatus);
		if(!chechBoxStatus)
		{
			remChecBox.click();
		}		
		System.out.println(remChecBox.isSelected());
		
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
