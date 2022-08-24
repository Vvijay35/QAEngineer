package com.corejava.practice;

public class Aug24_ArraysContinued {

	public static void main(String[] args) {
		
		
	}
	
	// This method takes String parameters and puts them in to a String Array...
	
//	String[] s = joinDetailsOfEmpIntoAnArray("Ramu","Hyderabad","India");
	
//	for(String m : s)
	//{
	//	System.out.println(m);
	//}
	public static String[] joinDetailsOfEmpIntoAnArray(String name, String place, String country)
	{
		//String[] s = new String[3];
		
		String[] s = {name,place,country};
		
		return s;
	}

	// This method takes int array and int key as arguments and searches for the keyinside the int array and returns true or false
	
	//int[] x = {10,20,30,40};
	//boolean isPresent  = searchForAnElementInIntArray(x,200);
	//System.out.println(isPresent);

	
	public static boolean searchForAnElementInIntArray(int[] x, int k)
	{
		
		boolean isPresent = false;
		
		for(int i=0; i<x.length;i++)
		{
			if(x[i] == k)
			{
				isPresent = true;
				break;
			}
			else
			{
				isPresent = false;
			}
				
		}
		
		return isPresent;
	}
	
	
	// This method takes an int array as argument and adds the elements of the int array and returns the sum.....
	//int[] x = {10,20,30,40};	
	//int sum = addElementsOfIntArray(x);
	//System.out.println(sum);
	
	public static int addElementsOfIntArray(int[] x)
	{
		int sum = 0;
		
		for( int m : x)
		{
			sum = (sum+m);
		}
		return sum;
	}
	
	// Methods can take arrys as arguments..
	//String[] s = {"Ramu","BE","Bangalore","India"};
	//takeEmplDetailsAndPrint(s);
	public static void takeEmplDetailsAndPrint(String[] s)
	{
		for(int i=0; i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
	
	
	public static void breakingInArraysUsingBothLoops()
	{
		int[] x = {10,20,30,40};
		
		
		for(int i = 0; i<x.length;i++)
		{
			
			System.out.println(x[i]);
			if(i == 2) // breaking the for loop based on the counter value
			{
				break;
			}
		}
		
		System.out.println("=====================");
		
		for(int m : x)
		{
			System.out.println(m); 
			if(m == 30) // Breaking the for each loop using the value and the counter...
			{
				break;
			}
		}
	}
	
	
	public static void searchForElementinIntArray()
	{
		int[] x = {10,20,30,40};
		boolean isPresent = false;
		
		for(int i=0; i<x.length;i++)
		{
			if(x[i] == 30)
			{
				isPresent = true;
				break;
			}
			else
			{
				isPresent = false;
			}
				
		}
		
		if(isPresent)
		{
			System.out.println(" The required element is present in the array");
		}
		else
		{
			System.out.println(" The required element is not  present in the array");
		}
		
		// Searching for an element in int array using for each loop
		boolean isPresent1 = false;

		for(int m : x)
		{
			
			if(m == 300)
			{
				isPresent1=true;
				break;
			}
			else
			{
				isPresent1=false;
			}
			
			
			
		}
		
		if(isPresent1)
		{
			System.out.println(" The required element is present in the array");
		}
		else
		{
			System.out.println(" The required element is not  present in the array");
		}
		
	}
	
	public static void forEachLoopEx2()
	{
		/*
		 * For loop can be used to simple iterate for x no of cycles
		 * For Each loop cant be used for simple iterations, it is always used to iterate over Arrays and collections
		 * 
		 * We can start the counter form any value , it depends on the user
		 * For each loop will always start from 0 and will run till the length of the Array or collection....
		 * 
		 * 
		 */
		
		int[] x = {10,20,30,40};
		
		
		for(int i = 2; i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
		System.out.println("==========================");
		
		for(int m : x)
		{
			System.out.println(m);
		}
	}
	
	public static void forEachLoopExDifferentArrayTypes()
	{

		int[] x = {10,20,30,40};
		
		for(int i=0; i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
		System.out.println("=======================");
		// iterating using the for each loop or enhanced for loop
		for(int j : x)
		{
			System.out.println(j);
		}
		
		System.out.println("=======================");
		
		String[] s = {"java","Selenium","Automaion"};
		
		for(String m : s)
		{
			System.out.println(m);
		}
		
		System.out.println("=======================");
		
		char[] c = {'a','b','c','d'};
		
		for(char m : c)
		{
			System.out.println(m);
		}
		
		Sample s1 = new Sample();		
		Sample s2 = new Sample();		
		Sample s3 = new Sample();
		
		Sample[] sArray = new Sample[3];  // Creating an array of the type Sample to store all the Sample class objects..
		
		sArray[0] = s1;
		sArray[1] = s2;
		sArray[2] = s3;
		
		Sample[] sArray2 = {s1,s2,s3};
		
		
		for(Sample m : sArray)
		{
			System.out.println(m);
		}
		
		
		
		
	}

}
