package com.corejava.practice;

import java.util.Scanner;

public class Aug29_ScannerClass {

	public static void main(String[] args) {
	
		

	}
	
	/*
	System.out.println("Please enter your name");
	
	Scanner src = new Scanner(System.in);
	
	String name = src.nextLine();		
	
	System.out.println("Please enter your place");		
	
	Scanner src1 = new Scanner(System.in);
	
	String place = src1.nextLine();
	
	System.out.println(joinNameAngPlace(name, place));
		*/	
	
	public static String joinNameAngPlace(String name, String place)
	{
		String s = name+" "+place;
		return s;
	}
	
	
	public static int findLengthOfString(String name)
	{
		int s = name.length();
		return s;
		
	}
	
	/*
	System.out.println("Please enter the number for which you want to find the factorial.");
	
	Scanner src = new Scanner(System.in);
	
	int num = src.nextInt();
	
	System.out.println(findFactorialUsingForLoop(num));
	*/
	public static int findFactorialUsingForLoop(int x)
	{
		int fact = 1;
		
		for(int num=x; num>1;num--)
		{
			fact=( fact * num);
		}
		
		return fact;
		
	}
	
	
	/*	
	
	    * 
	   * * 
	  * * * 
	 * * * * 
	* * * * *

	*/
	
	public static void patternPrintingEx10()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
	
			
		}
	

}
