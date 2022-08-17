package com.corejava.practice;

public class Aug17_ForLoopAndForEachLoop {

	public static void main(String[] args) {
		
		

	}
	
	public static void forEachLoopEx2()
	{
		String[] s = {"java","Selenium","Automation"};
		
		for(String m : s)
		{
			System.out.println(m);
		}
		
		
	}
	
	
	public static void forEachLoopEx1()
	{
		int[] x = {10,20,30,40};
		
		for(int i=0; i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		// Using for each loop or enhanced for loop
		
		for(int m: x)  // here m is any variable or counter and x is the array 
		{
			System.out.println(m);
		}
	}
	public static void checkNumberPrimeUsingForLoop()
	{
		int num = 5;
		boolean isPrime = false;
		
		for(int x=2; x<num;x++)
		{
			if(num % x == 0)
			{
				isPrime = false;
				break;
			}
			else
			{
				isPrime = true;
			}
		}
		
		if(isPrime)
		{
			System.out.println(" The number is prime number");
		}
		else
		{
			System.out.println(" The number is not prime...");
		}	
	}
	
	public static void printMultiplicationTableUsingForLoop()
	{
		for(int x=1; x<=15;x++)
		{
			for(int y=1; y<=10;y++)
			{
				System.out.println(x+" * "+y+" = "+(x*y));
			}
			System.out.println("=========================");
		}
	}
	
	
	public static void findFactorialUsingForLoop()
	{
		int fact = 1;
		
		for(int num=5; num>1;num--)
		{
			fact=( fact * num);
		}
		
		System.out.println(fact);
		
	}
	public static void forLoopEx2()
	{
		for(int x=1; x<=100;x++)
		{
			if(x % 2 != 0)
			{
				System.out.println(x);
			}
		}
		
	}
	
	public static void forLoopExample1()
	{
		for(int x=0;x<=10;x++)
		{
			System.out.print(x+" ");			
		}
		
		System.out.println();
		
		for(int x=10; x>=0;x--)
		{
			System.out.print(x+" ");
		}
	}

	
}
