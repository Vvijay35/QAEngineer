package com.corejava.practice;

public class Aug9_Operators {

	public static void main(String[] args) {	


	

	}
	
	public static void  naNOperator()
	{
		System.out.println(0/0.0);
		System.out.println(0.0/0);
		System.out.println(-0/0.0);
	}
	
	public static void infinityOperator()
	{
		
		int x = 10;
		double  y = 0.0;
		int m = -10;
		
		//int z = (x/y);
		
		System.out.println(x/y); // Infinity
		
		System.out.println(m/y); // - Infinity
		
		System.out.println(-10/0.0);
	}
	
	public static void stringConcatination()
	{

		
		byte b = 10;
		byte b1 = 20;
		
		
		int b3 = (b+b1) ;
		
		char c = 'a';
		char c1 = 'b';
		
		System.out.println(c+c1);
		
		System.out.println(c+"---"+c1);
		
		int age = 16;
		String name = "Ramu";
		
		System.out.println(name+" "+age);
		
		double d = 10.503;
		
		System.out.println(d+c);
		
		
	}
	
	public static void equalityOperators()
	{
		int x = 10;
		int y = 20;
		
		boolean b = (x == y);
		
		System.out.println(b);
		
		System.out.println(x != y);
		
		char c = 'a';
		char c1 = 'x';
		
		System.out.println(c == c1);
		
		double d = 10.50;
		double d1 = 10.50;
		
		System.out.println(d == d1);
		
		boolean isMarried = true;
		
		boolean isIndian = true;
		
		System.out.println(isMarried == isIndian);
		
		String s = "java";
		
		String s1 = "Java";
		
		String s2 = "JAVA";
		 
		System.out.println(s.equals(s1)); // for comparing the equality of Strings we use equals method..
		
		System.out.println(s.equals(s2));
		
		System.out.println("java".equals("java"));
		
	}
	
	public static void relationalOperators()
	{
		int x = 100;
		int  y = 50;
		boolean b = (x > y); // true
		
		System.out.println(b);
		
		System.out.println(x < y); // false
		
		System.out.println(y > x); // false
		
		System.out.println(x >= y); // true
		
		System.out.println(y <= x); // true
		
		System.out.println(x <= y); // false
		
		System.out.println(y >= x); // false
	}
	
	public static void arithematicOperators()
	{
		int x = 10;
		int y = 20;
		int z = (x+y);
		System.out.println(z);
		
		System.out.println(y-x);
		
		System.out.println(y/x);
		
		System.out.println(x%2);
		
		System.out.println(x%3);
		
		System.out.println(1000+2000);
	}

	
}
