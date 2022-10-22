package com.selenium.practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Oct21_22_ActionsClass extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		runningCommandsFromCmd();
		
		

	}
	
	
	public static void actionsClassEx3()
	{
		launchActiTimeApplication();
		WebElement userName = driver.findElement(By.id("username"));	
		
		Actions act = new Actions(driver);
		
		// Holding the SHIFT key and then sending admin to username
		act.keyDown(Keys.SHIFT).sendKeys(userName,"admin").build().perform();
		
		// releasing the shift key...
		act.keyUp(Keys.SHIFT).build().perform();
	}
	
	public static void actionsClasEx2() throws InterruptedException
	{
		launchActiTimeApplication();
		
		Actions act = new Actions(driver);
		
		
		
		WebElement userName = driver.findElement(By.id("username"));	
		
		act.sendKeys(userName,"admin");		
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).build().perform();	
		Thread.sleep(2000);	
		act.sendKeys("manager").build().perform();		
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).build().perform();		
		Thread.sleep(2000);		
		act.sendKeys(Keys.SPACE).build().perform();		
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).build().perform();		
		Thread.sleep(2000);		
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	public static void actionsClassEx1() throws InterruptedException
	{
		launchActiTimeApplication();
		
		WebElement link  = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		
		// Create the object of Actions  class and pass driver as the constructor argument
		Actions act = new Actions(driver);
		
		//Action a = act.build();
		//a.perform();
		
		// this is the syntax to use actions class method
		act.contextClick(link).build().perform();		
		act.sendKeys(Keys.RIGHT).build().perform();
		
		act.sendKeys(Keys.UP).build().perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.UP).build().perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		
		

	}

	
	public static void contextClick() throws InterruptedException
	{
		launchApplication("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act = new Actions(driver);		
		
		
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(button).build().perform();		
		
		act.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.DOWN).build().perform();
		
	}
	
	public static void actionClassDragAndDropEx() throws InterruptedException 
	{

		launchApplication("https://code.makery.ch/library/dart-drag-and-drop/");
		
		Actions actions = new Actions(driver);
		
		driver.switchTo().frame(1);
		
	
		WebElement src = driver.findElement(By.xpath("(//img[@src='images/document.png'])[1]"));		
		WebElement dest = driver.findElement(By.xpath("(//div[@class='trash'])[1]"));	
		
		
		Thread.sleep(3000);
		actions.dragAndDrop(src, dest).build().perform();
		
		
	}
	
	
	public static void scrollingOperations() throws InterruptedException
	{
		launchApplication("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		js.executeScript("window.scrollTo(0,2000)"); // To scroll to a pixel y axis ( height) ( no matter where evert he current position is)
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)");// from the current location scroll By another few pix cells
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // To scroll to the bottom of the page
		Thread.sleep(3000);
		js.executeScript("location.reload()"); // To refresh a Page using java Script
		
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Flipkart.com']"));
		Thread.sleep(3000);		
		// To scroll up to the element and the element should be visible on the page
		js.executeScript("arguments[0].scrollIntoView(true)",element);		
	}
	
	public static void fileUploadUsingSendKeys() 
	{
		launchApplication("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_fileupload_get");
		driver.switchTo().frame(1);
		
		// Uploading file using absolute Path as a String
		//driver.findElement(By.id("myFile")).sendKeys("D:\\test.txt");
		
		File f = new File("utilities/test.txt");
		String filePath = f.getAbsolutePath();				
		System.out.println(filePath);		
		
		// Uploading file using relative path, Fetching absolute path using relative path... 
		driver.findElement(By.id("myFile")).sendKeys(filePath);

	}
	
	
	public static void runningCommandsFromCmd() throws IOException 
	{
		// USed for running any commands ( whatever we can run using cmd prompt can be run )
		
		Runtime.getRuntime().exec("taskkill /IM firefox.exe /F"); // To close all the firefox.exe process
		//Runtime.getRuntime().exec("taskkill /im chromedriver.exe /F");	// To close all chrome process
		
		//Runtime.getRuntime().exec("C:\\Users\\sudhapat\\Downloads\\jdk-11.0.16_windows-x64_bin.exe");
		
		Runtime.getRuntime().exec("calc");
		
		
	}
	
}
