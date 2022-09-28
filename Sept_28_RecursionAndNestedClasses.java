package com.corejava.recursionAndNestedClasses;

public class Sept_28_RecursionAndNestedClasses {
	
	// Print Febonaci Series using recursion
	// Reverse the String using Recursion

	public static void main(String[] args) {

		System.out.println(findFactUsingRecursion(5));
	}
	
	public static void printNumbersRev(int num)
	{
		
		System.out.print(num+" ");
		
		if( num > 0)		
			printNumbersRev(num-1);
		
		
		
	}
	
	public static void printNumbers(int num)
	{			
		
		if( num > 0)		
			printNumbers(num-1);
		
		
		System.out.print(num+" ");
		
		
		
	}

	public static void findFactorialEx(int num)
	{
		int fact=1;
		
		while (num >=1 )
		{
			fact = (fact * num);
			num--;	
			
		}
		
		System.out.println(fact);
		
	}

	public static int findFactUsingRecursion(int num)
	{
		if(num == 1)		
			return 1;		
		else		
			return (num * (findFactUsingRecursion(num-1)));
		
	}
	
}
