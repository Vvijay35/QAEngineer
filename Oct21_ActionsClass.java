package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Oct21_ActionsClass extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		

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

}
