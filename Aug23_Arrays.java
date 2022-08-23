package com.corejava.practice;

public class Aug23_Arrays {

	public static void main(String[] args) {
		
		int[] x; // declaration
		
		x = new int[4]; // construction
		
		int[] x1 = new int[4]; // both declaration and construction in one line
		

		// Array Initialization
		
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		
		
		// all the 3 steps in one line
		int[] x2 = {10,20,30,40};		
		
		String[] s = {"java","selenim","automation"};
		
		char[] c = {'a','b','c','d','e'};
		
		System.out.println(c.length);
		
		for(int i = 0; i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		
		

	}
	
	public static void arrayEx1()
	{
		Sample s = new Sample();
		System.out.println(s.length);
		
		// Array declaration
		int[] x; // int []x  or int x[]
		
		// Array Construction
		x = new int[5];
		
		// Array initialization
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;	
		
		System.out.println(x.length);
		
		System.out.println(x[4]);  // default value for 4th index is 0 because the array type is int[]
		
		double[] d = new double[3];  //  constructing a double array of length 3
		
		System.out.println(d.length);
		
		System.out.println(d[0]);
		
		char[] c = new char[4]; // declaration and construction done in one line..
		
		System.out.println(c.length);
		
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		c[3] = 'd';
		
		//c[4] = 'e' ; // will get ArrayIndexOutOfBoundsException as the index 4 is not present
		
		String[] s1 ;
		
		s1 = new String[3]; 
		
		String[] s2 = new String[3];  // declaration and construction done in one line..
		
		
		System.out.println(s1.length);
		
		s1[0] = "java";
		s1[1] = "Bhava";
		s1[2] = "Mava";
		
		
		
		
		
	}


	public static void arrayEx2LoopArray()
	{

		
		int[] x = new int[5];
		
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		x[4] = 20; // Arrays can take duplicate values , as everything goes by index....
		
		x[2] = 100; // array values can be overwritten
		
		//System.out.println(x.length);
		
		//System.out.println(x[2]);
		
		for(int i=0; i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
		System.out.println("====================");
		
		String[] s = new String[3];
		
		s[0] = "Java";
		s[1] = "Bhava";
		s[2] = "Mama";
		
		for(int i = 0; i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		
		
	}
}
