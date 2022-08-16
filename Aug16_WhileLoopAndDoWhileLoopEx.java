package com.corejava.practice;

public class Aug16_WhileLoopAndDoWhileLoopEx {

	public static void main(String[] args) {		
		
		
		
	}
	
	public static void doWhileLoopEx()
	{

		/*
		 * int x = 10; 
		 * while ( x < 10) 
		 * { 
		 * System.out.println(" The value of x is "+x);
		 * x--; 
		 * }
		 * 
		 * System.out.println(" After the while loop...");
		 */
		
		int x = 10;
		
		do {			
			System.out.println(" The value of x is "+x);			
		   }while (x < 10);
		
		
	}
	
	public static void checkPrimne1()
	{
		int num = 15;
		int x = 2;
		
		boolean result = true;
		
		
		while( x < num)
		{
			if( num % x == 0)
			{
				result = false;				
				break;
			}			
			x++;
		}
		
		
		if(result)		
			System.out.println(" The number is a prime number");		
		else		
			System.out.println(" The number is not a prime number");
	

		
	}
	
	public static void checkNumPrime()
	{
		int num = 15;
		int x = 2;
		
		boolean result = false;
		
		
		while( x < num)
		{
			if( num % x == 0)
			{
				result = false;				
				break;
			}
			else
			{
				result = true;
			}
			x++;
		}
		
		
		if(result)		
			System.out.println(" The number is a prime number");		
		else		
			System.out.println(" The number is not a prime number");
	

	}
	
	public static void swapValuesOf2Numbers()
	{
		int a = 10;
		int b = 20;
		int temp = a;
		
		System.out.println(" before  swapping the value of a is "+a + " The value of b is "+b);
		
		a = b;
		b = temp;
		
		System.out.println(" after swapping the value of a is "+a + " The value of b is "+b);
		
		
		
	}
	
	public static void findFactorial()
	{
		int num = 5;
		int temp = num;
		int fact = 1;
		
		while(num > 1 )
		{
			fact = (fact * num);
			num--;
		}
		//System.out.println( " The factorial of the num "+num + " is "+fact);
		System.out.println( " The factorial of the num "+temp + " is "+fact);
	}

}

