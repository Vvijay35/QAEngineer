package com.corejava.exceptions;

import java.io.File;
import java.io.IOException;

// Exceptions are the abnormal scenarios for the JVM to handle
// whenever there is an exception then JVM will try to find to what type of exception category thisbelongs to
// ANd then will create the object of that Exception class and will throw the stack trace to the console
// Whenever there is an exception then the JVM will abruptly stop 
// Exceptions are categorized as checked and unchecked exeptions
// Checked exceptions are checked by the compiler during the compile time and the compiler will force you to handle them
// Unchecked exceptions are not checked by compiler and they will occur only during run time.
// Exceptions can be handled using try catch block or using the throws keyword

public class Sept20_ExceptionsAndHandling {

	public static void main(String[] args) {
		
		
		
		try {
			
			System.out.println(" inside the try block...");
			int x = 10;
			int y = 0;
			int z = x/y;
			System.out.println(" The value of z is"+z);
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println(" inisde the catch block....");
			ae.printStackTrace();
		}
		
		System.out.println(" Continuing with other lines of code");
		System.out.println(" Continuing with other lines of code");
		System.out.println(" ============================");
		
		
		
	}
	
	public static void method1()
	{
		//System.out.println("Inside method1");
		method2();
	}
	
	public static void method2()
	{
		//System.out.println("Inside method2");
		method1();
	}
	
	
	public static void checkedExceptionEx1() throws IOException
	{
		File f = new File("D:\\sample.txt");
		
		f.createNewFile();
		
	}
	
	public static void exceptionsEx1()
	{
		int x = 10;
		int y = 1;
		int z = x/y;
		
		System.out.println(z);
		System.out.println("============");
		
		int[] m = {10,20,30,40};
		
		System.out.println(m[5]);
		
		System.out.println("============");
	}

}
