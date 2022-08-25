package com.corejava.practice;

import java.util.Arrays; // fully qualified class name
// Class name with package name is called as FQCN

public class Au_25_ArraysContinued {
	
		
	public static void main(String[] args) {		

		int[] x = {10,6,15,5,8,2,50};		
		String s = Arrays.toString(x);  // Converts an Array in to String
		
		System.out.println(s);
		
		Arrays.sort(x); // Sorts an array in the ascending order
		
		
		System.out.println(Arrays.toString(x));// Converts an Array in to String
		
		int y = Arrays.binarySearch(x, 8);
		System.out.println(y);
		
		
		// Binary search method will take the sorted array as argument
		
		// If the number is present in the array then the binary search method will return o or any possitive number greater than 0
		// If the number is not present , then it will retun a -ve integer...
		
		
		String[] str = {"java","Bhava","Mava"};
		
		System.out.println(Arrays.toString(str));
		
		Arrays.sort(str);
		
		System.out.println(Arrays.binarySearch(str, "Bhava"));
		
	
		
		
		
	}
	

	/*
	 * 
	 * An array with out any reference in called as Anonymous array
	 * These are used for temporary programming needs , we need not create an array and simpley create
	 * these arrays in a Anonymous way
	//int[] x = {10,6,15,5,8,2,50};
	//int[] y= sortIntArray(x);
	
	int[] y= sortIntArray(new int[] {10,6,15,5,8,2,50});
	
	for(int m : y )
	{
		System.out.print(m+" ");
	}
	*/
	
	
	
	/*
	int[] x = {10,6,15,5,8,2,50};
	
	System.out.println(" Array Before sorting....");
	for(int m : x)
	{
		System.out.print(m+" ");
	}
	System.out.println();
	int[] y = sortIntArray(x);
	
	System.out.println(" Array after sorting....");
	for(int m : y)
	{
		System.out.print(m+" ");
	}
	*/
	
	public static int[] sortIntArray(int[] x)
	{	
		int temp = 0;
		
		for( int i=0; i<x.length;i++)
		{
			
			for(int j=i+1; j<x.length;j++)
			{
				// if(x[i] > x[j]) // This will sort in ascending order to sort in descending use < 
					if(x[i] > x[j])
				{
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;					
				}				
			}		
		}		
		return x;
	}
	
	
	
	
	




	
	/*
	char[] c = {'a','b','b','c','b'};
	int count = findOccuranceOfaCharInCharArray(c,'b');
	System.out.println(count);
	*/
		
	public static int findOccuranceOfaCharInCharArray(char[] c, char key)
	{
		
		int counter = 0;		
		
		for(int m : c)
		{
			if(m == key)
			{
				counter++;
			}
		}
		
		return counter;	
		
	}
	
	
	
	//int[] x = {10,30,10,40,10,50};	
		//System.out.println(findOccurancesInArray(x,10));
		
		public static int findOccurancesInArray(int[] x, int key)
		{
			int counter = 0;		
			
			for(int m : x)
			{
				if(m == key)
				{
					counter++;
				}
			}
			
			return counter;	
			
		}
		
		
}
