package com.corejava.practice;

public class Aug22_PatternPrinting {

	public static void main(String[] args) {
		
		printPattern10();
	}
	
	/*
	 1
	 2 3
	 4 5 6
	 7 8 9 10
	 11 12 13 14 15	 
	 
	 */

	
	public static void printPattern6()
	{
		int counter=1;
		for(int i=1; i<=5;i++)
		{		
			for(int j=1;j<=i;j++)
			{
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
			
		}
		
	}
	
	/*
	 * * * * * 
	 * * * * 
	 * * * 
	 * * 
	 * 
	 */
	
	public static void printPattern7()
	{
		for(int i=1; i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	

	/*
	
	* * * * * 
	  * * * * 
	    * * * 
	      * * 
	        * 
	  */ 
	
	public static void printPattern8()
	{
		for(int i=1; i<=5;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print("  ");
			}
			
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
/*
	
	* * * * * 
	 * * * * 
	  * * * 
	   * * 
	    * 
	  */ 
	
	public static void printPattern9()
	{
		for(int i=1; i<=5;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	/*	
	
	    * 
	   * * 
	  * * * 
	 * * * * 
	* * * * *

	*/
	

	public static void printPattern10()
	{
		for(int i=1; i<=5;i++)
		{
			for(int k=5;k>i;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
}
