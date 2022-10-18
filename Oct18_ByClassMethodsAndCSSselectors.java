package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
 * xpath = //input[@id='username']
 * css = input[id'username']
 * css = input#username
 * css= #username.textField
 * 
 * 
 * xpath = //table[@class='footer']
 * css = table[class='footer']
 * css = table.footer
 * css = .footer
 * 
 * xpath = //table[@class='footer']/tbody/tr/td[1]
 * css = table.footer tbody tr td:nth-child(1) // To find  the nth child..
 * css = table.footer tbody tr td:first-child // to find the first child 
 * css = table.footer tbody tr td:last-child // to find the last child
 * 
 * In x path to navigate from parent to child we use / ( forward slash )
 * In css to navigate from parent to child we use space or > ( space or greater than symbol)
 * 
 * 
 * using the portion of any attribute value ( like ID, class , name etc )
 * xpath = //a[contains(@id,'loginBu')]
 * css = a[id*='loginBu'] // similar to contains of x path .. But contains cant be used wrt text in css
 * 
 * 
 * limitations of CSS
 * 
 * x path supports text based identification using text() or contains(text(),'TEXT')
 * 1) CSS doen't support text based identification...
 * 
 * 
 * Using xpath we can navigate to the parent node from a child node using .. or Parent::*
 * 2) Css doesn't support navigating to parent from child 
 * 
 * 
 * 
 * 
 *  
 * 
 */

public class Oct18_ByClassMethodsAndCSSselectors extends BaseClass {

	public static void main(String[] args) {

		launchActiTimeApplication();
		
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		// finding the element using its id
		driver.findElement(By.id("username")).sendKeys("admin");
		
		// finding element using its name
		driver.findElement(By.name("pwd")).sendKeys("manager"); //input[@name='pwd']
		
		// finding the element using its Text ( used for links)
		driver.findElement(By.linkText("actiTIME Inc.")).click(); //a[text()='actiTIME Inc.']
		
		// finding the link using text portion ( just like contains )
		driver.findElement(By.partialLinkText("actiTIME")).click(); //a[contains(text(),'actiTIME')]
	
		// finding the element using its class name , the value of class attribute
		driver.findElement(By.className("footer"));  //table[@class='footer']
		
	    List<WebElement> links = driver.findElements(By.tagName("a"));  //a
	    
	    // finding an element using css selector...
	    driver.findElement(By.cssSelector("a[id*='loginBu']")).click();
		
	    
	  //table[@class='footer']/tbody/tr[1]/td[1]/nobr
	    
	    
		

	}

}
