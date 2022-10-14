package com.selenium.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct14_NavigateAndManageMethods extends BaseClass{

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

	}
	
	public static void manageWindowMethods() throws InterruptedException
	{

		launchActiTimeApplication();
		
		// Dimension class has instance variables to get height and width...
		Dimension d= driver.manage().window().getSize();
		
		int ht= d.getHeight();		
		int wd = d.getWidth();
		
		System.out.println("height is "+ht);
		System.out.println("width is "+wd);
				
		
		WebDriver.Options wo = driver.manage();
		
		WebDriver.Window ww =  wo.window();
		
		ww.maximize();
		
		//driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();		
		Thread.sleep(2000);
		// To set the size of the window..
		
		Dimension d1 = new Dimension(400, 400);
		driver.manage().window().setSize(d1);
		
		// Point class is used to move the window to a particular point
		Point p = 	driver.manage().window().getPosition();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		
		Point p1 = new Point(100,100);
		
		driver.manage().window().setPosition(p1);
		System.out.println(driver.getTitle());
		
		System.setProperty("webdriver.chrome.driver", "./utilities/chromedriver.exe");		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://google.com");
		
		driver1.manage().window().setSize(new Dimension(400,400));
		
		driver1.manage().window().setPosition(new Point(700,100));
		
		System.out.println(driver1.getTitle());
		
		
		//closeBrowser();

	}
	
	public static void navigateMethods() throws InterruptedException, MalformedURLException
	{
		launchActiTimeApplication();
		
		driver.get("https://google.com");
		
		// The navigate method returns reference to WebDriver.Navigation
		WebDriver.Navigation wn = driver.navigate();
		
		// driver.navigate().back(); using the back method in a single line..
		//String s = driver.getTitle();		s.toLowerCase().length();	driver.getTitle().toLowerCase().length();
		
		// Back method is present in webDriver.navigation interface..
		wn.back();		
		Thread.sleep(2000);
		
		// Forward method
		wn.forward();
		Thread.sleep(2000);
		
		// Refresh Method..
		wn.refresh();
		Thread.sleep(2000);

		// to method is used for navigating to a new URL..
		wn.to("https://yahoo.com");
		
		// URL object can also be used to navigate 
		URL url = new URL("https://yahoo.com");
		driver.navigate().to(url);
		
		closeBrowser();
		
	}

}
