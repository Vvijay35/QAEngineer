package com.corejava.exceptions;

import java.io.File;
import java.io.IOException;

public class Sept21_ExceptionHandling {

	public static void main(String[] args)  {
		
		
		
				
	
	}
	
	// Finally block will run will at any case, whether the exceptions comes or not
	public static void finallyBlockEx()
	{
		try {
			System.out.println("Inside the try block...");
			int[] x = {10,20,30,40};
			System.out.println(x[10]);
		}
		catch(Exception e)
		{
			System.out.println("Inside the catch block...");
			e.printStackTrace();
			
		}
		finally {
			System.out.println("Inside the finally block...");
			System.out.println(" This code will run for sure ..");
		}
		
	}
	
	
	

//	public static void main(String[] args) throws IOException {		
	//checkExceptionEx2();
	/*
	try {
		checkExceptionEx2();
	} catch (IOException e) {			
		e.printStackTrace();
	}
	System.out.println("==================");
	*/
	public static void checkExceptionEx2() throws IOException {
	
		File f = new File("E:\\Sample.txt");	
		f.createNewFile();
	
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	/*
	try {
		unCheckedEx2();
	}catch(ArrayIndexOutOfBoundsException ae)
	{
		ae.printStackTrace();
	}
	*/
	public static void unCheckedEx2() throws ArrayIndexOutOfBoundsException
	{
		int[] m = {10,20,30,40};
		System.out.println(m[10]);
	
	}
	
	
	//unCheckedEx1();
	//System.out.println("===============");
	public static void unCheckedEx1()
	{
		int[] m = {10,20,30,40};
		try {
			System.out.println(m[10]);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//createAnewFile
	public static void createAnewFile()
	{
		File f = new File("D:\\Sample.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		
	}
	
	public static void multipleCatchBlcoksEx2()
	{
		try {
			System.out.println(" Inside the try block...");
			int x = 10;
			int y = 1;
			int z = x/y;	
			System.out.println(z);
			int[] m = {10,20,30,40};
			System.out.println(m[10]);
			}
			catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println(" Inside the catch block...");
				ae.printStackTrace();
			}	
			catch(Exception e)
			{
				System.out.println(" Inside the catch block...");
				e.printStackTrace();
			}
		
		// The catch block for Exception should be always at the bottom ... other catch blocks can
		// be above the exception catch block...
			/*
			 * catch(ArrayIndexOutOfBoundsException ae) {
			 * System.out.println(" Inside the catch block..."); ae.printStackTrace(); }
			 */
				
		System.out.println("After the try catch block...");
	}
	
	public static void mulipleCatchBlocksForOneTryBlockEx()
	{
		try {
			System.out.println(" Inside the try block...");
			int x = 10;
			int y = 1;
			int z = x/y;	
			System.out.println(z);
			int[] m = {10,20,30,40};
			System.out.println(m[10]);
			}
			catch(ArithmeticException ae)
			{
				System.out.println(" Inside the catch block...");
				ae.printStackTrace();
			}
			catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println(" Inside the catch block...");
				ae.printStackTrace();
			}		
		System.out.println("After the try catch block...");
			
	}
	
	
	public static void multipleTryCatchBlocks()
	{
		try {
			System.out.println(" Inside the try block...");
			int x = 10;
			int y = 0;
			int z = x/y;	
			System.out.println(z);
			}
			catch(ArithmeticException ae)
			{
				ae.printStackTrace();
			}
			
			try {			
				int[] m = {10,20,30,40};
				System.out.println(m[10]);
				
			}		
			catch(ArrayIndexOutOfBoundsException ae)
				{
					System.out.println(" Inside the catch block...");
					ae.printStackTrace();
				}		
			System.out.println("after the try catch block..code continues....");

	
	}
}
