package com.corejava.practice;

public class Aug19_MethodOverloadingAndPatterns {

	public static void main(String[] args) {
		
		
	}
	
	/*
	  
	 * * * * *
	 
	 */
	public static void printPattern1()
	{
		
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			
		
		
	}
	
	
	
	/*
	 
	 * * * * *
	 * * * * *
	 * * * * *
	 * * * * *
	 * * * * *
	 
	  
	 */
	
	public static void printPattern2()
	{
	
		for(int i=1; i<=5;i++)
		{		
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}
	
	// same pattern using while loop
	
	/*
	  int i=1;
		while( i <= 5)
		{
			int j=1;
			while(j<= 5)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	  
	  
	 */
	

	/*
	 
	 * 
	 * * 
	 * * * 
	 * * * * 
	 * * * * *
	 
	  
	 */
	
	public static void printPattern3()
	{
	
		for(int i=1; i<=5;i++)
		{		
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}
	
	
	/*
	 
	 1 
	 1 1 
	 1 1 1 
	 1 1 1 1 
	 1 1 1 1 1
	 
	  
	 */
	
	public static void printPattern4()
	{
	
		for(int i=1; i<=5;i++)
		{		
			for(int j=1;j<=i;j++)
			{
				System.out.print("1 ");
			}
			System.out.println();
			
		}
		
	}
	
	/*
	 
	 1 
	 1 2 
	 1 2 3 
	 1 2 3 4 
	 1 2 3 4 5
	 
	  
	 */
	
	public static void printPattern5()
	{
	
		for(int i=1; i<=5;i++)
		{		
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
	}
	
	
	
	public static int addNumbers(int a, int b)
	{
		int sum = ( a + b);
		return sum;	 // The return should be the last statement in the method...
	}
	
	public static int addNumbers(int a, int b, int c)
	{
		int sum = ( a + b + c);
		return sum;	 
	}
	public static int addNumbers(int a, int b, int c,int d)
	{
		int sum = ( a + b + c + d);
		return sum;	
	}
	
	public static String joinNameAndAge(String name, int age)
	{
		String s = (name+"  "+age);
		return s;
	}
	
	public static String joinNameAndAge(int age, String name)
	{
		String s = (name+"  "+age);
		return s;
	}
	
	public static void takeDataFromUserAndPrint(int x)
	{
		System.out.println(x);
	}
	
	public static void takeDataFromUserAndPrint(String x)
	{
		System.out.println(x);
	}
	
	public static void takeDataFromUserAndPrint(boolean x)
	{
		System.out.println(x);
	}
	
	
	

}
