package com.corejava.practice;

public class Aug12_Switch_WhileAndDoWhileLoops {

	public static void main(String[] args) {
		
		

	}
	
	public static void nestedWhileLoopWithBreak()
	{
		int x = 1;
		
		while( x <= 10)
		{
			int y = 1;
			while( y <= 10)
			{
				System.out.println(" The value of x is "+x + " The value of y is "+y);
				if(y == 5)
				{
					break;
				}
				y++;
			}
			System.out.println("==========================");
			if(x == 6)
			{
				break;
			}
			x++;
		}
	}
	
	public static void whileLoopWithBreak()
	{
		int x = 1;
		
		while( x <= 10)
		{
			System.out.println(" The value of x is "+x);
			if( x == 5)
			{
				break;
			}
			x++;
		}
	}
	
	public static void printMultiplicationTable()
	{
	int num = 2;
		
		while( num <= 20) // Outer while loop for numbers from 2 to 20 
		{
			int x = 1;
			while( x <= 10) // Inner loop for 1 to 10
			{
				System.out.println(num+" x "+x+" = "+(num*x));				
				x++;
				
			}
			System.out.println("==============");			
			num++;
		}
		
	}
	
	public static void whileLoopPrintTableOf2()
	{
		int num = 2;
		int x = 1;
		
		while( x <= 10)
		{
			//System.out.println(num*x);
			System.out.println(num+" x "+x+" = "+(num*x));
			x++;			
		}
	}
	
	public static void whileLoopPrintOddNumbers1To100()
	{
		int num = 1;
		
		while ( num <= 100)
		{
			if( num % 2 != 0)
			{
				System.out.println(num); // Prints and moves to next line
				//System.out.print(num+","); // prints on the same line
			}
			num++;
		}
	}
	
	
	public static void whileLoopPrintEvenNumbers1To100()
	{
		int num = 1;
		
		while ( num <= 100)
		{
			if( num % 2 == 0)
			{
				System.out.println(num); // Prints and moves to next line
				//System.out.print(num+","); // prints on the same line
			}
			num++;
		}
	}
	
	public static void whileLoopEx2()
	{

		int x = 10;
		
		while( x >= 1)
		{
			System.out.println(" The value of x is "+x);
			x--;
		}
		
		
	}
	
	public static void whileLoopEx1()
	{
		int x = 1;
		while(x <= 10)
		{
			System.out.println(" The value of x is "+x);
			x++;			
		}
	}
	
	public static void switchCaseEx3()
	{
		String browser = "safari";
		
		switch (browser)
		{
		
			case "chrome":
			{
				System.out.println(" The test cases will be executed using chrome browser...");
				break;
			}
			case "firefox":
			{
				System.out.println(" The test cases will be executed using firefox browser...");
				break;
			}
			case "edge":
			{
				System.out.println(" The test cases will be executed using edge browser...");
				break;
			}
			case "safari":
			{
				System.out.println(" The test cases will be executed using safari browser...");
				break;
			}
			default:
			{
				System.out.println(" Browser not supported...");
				break;
			}
			
				
		
		
		
		}

	}
	
	
	public static void switchEx2()
	{
		int month = 20;		
		
		switch(month)
		{		
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:				
			{
				System.out.println(" Your month has 31 days....");
				break;
			}			
			case 2:
			{
				System.out.println(" Your month has 28 or 29 days");
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11:
			{
				System.out.println(" your month has 30 Days...");
				break;
			}
			default:
			{
				System.out.println(" Please enter correct value for month..");
				break;
			}
			
			

	}
	}
	
}
