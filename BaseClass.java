package com.selenium.practice;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;

	public static void launchActiTimeApplication()
	{		
		launchBrowser();
		driver.get(getConfigData("url"));		

	}
	
	public static void launchBrowser()
	{
		String browser = getConfigData("browser");
		
		switch(browser)
		{
			case "firefox":
			{
				System.out.println(" Running the test cases using Firefox browser.....");
				System.setProperty("webdriver.gecko.driver", "./utilities/geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			}
		
			case "chrome":
			{	
				System.out.println(" Running the test cases using chrome browser.....");
				System.setProperty("webdriver.chrome.driver", "./utilities/chromedriver.exe");		
				driver = new ChromeDriver();
				break;
			}
			default :
			{
				System.out.println(" Browser not specified , using chrome as the default browser..");
				System.setProperty("webdriver.chrome.driver", "./utilities/chromedriver.exe");		
				driver = new ChromeDriver();
				break;
			}
		}	
		
		driver.manage().window().maximize();
		// Applying implicit wait . it is applied only once where the driver is created and applicable through out the life cycle of the driver..
		// polling interval is 500 MS ( half second )
		String s = getConfigData("timeout"); // fetching the timeout from properties file and converting it to Long
		Long t = Long.parseLong(s);		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(t));
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
	
	public static String getConfigData(String key) 
	{		
				
			Properties prop = new Properties();
				try {				
					File f = new File("config.properties");	
					FileInputStream fio = new FileInputStream(f);
					prop.load(fio);					
				} catch (Exception e) {
					e.printStackTrace();
				}			
				String val = prop.getProperty(key);					
				return val;
				
				
	}


}
