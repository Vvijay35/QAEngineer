package com.corejava.practice;

public class Aug3_DataTypes {
	
	static int age ; // Global variables need not be initialized and they will carry 
	//default value
	
	static double d3;

	public static void main(String[] args) {
		
		byte b = 15 ;           // Local variables must be initialized before they are used
		//System.out.println(b);
		
		// byte b1 = 150; // Cannot convert from int to byte
		
		short s = 150;
		
		// short s1 = 45000; Cannot convert from int to short 
		
		int x = 100;
		
		int y = 150;
		
		int z = 45000;
		
		//int a = 78787878542;// The literal is out of the range of int
		
		long a = 78787878542L;  // suffix L or l to store the number explicitly as long
		
		long c = 150;
		
		double d = 50.75;
		
		float f = 10.50F; // suffix F or f to store a decimal value explicitly as float
		
		// August 4 th Session
		
		char c2 = 'a';
		
		char c3 = 98;
		
		System.out.println(c3);
		
		boolean b1 = true;
		
		boolean b2 = false;
		
		
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(age);
		
		System.out.println(d3);
		
		int m = 'a';  // Implict type casting a will be converted in to 97 by the compiler
		System.out.println(m);
		
		double dm = 50; 
		//Implict type casting dm will be converted in to 50.0 by the compiler
		
		System.out.println(dm);
		
		
		byte bx = (byte)150; // Explicit Type casting 150 will be forced to save as byte  will get -106 
		
		System.out.println(bx);
		
		
		String cf = "12121@##daddd";  // String is a class and not a data type in Java , its sequence of characters stored
		//in double quotes	
		
		

	}
	
	public static void  test()
	{
		int x = 100;
		System.out.println(age);
		
	}

}
