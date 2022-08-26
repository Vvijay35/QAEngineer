package com.corejava.practice;

public class Aug26_2DArrays_Scanner_CmdLine_Varargs {
	
	
	// Command line arguments or arguments to main method....
	// The main method is the first method to start and  last method to complete , hence it does not return any return type 
	public static void main(String[] args) {		
	
		System.out.println(args.length);
		
		
		for(int i=0; i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		
		System.out.println("Running  the test cases using  browser "+args[0]);
	
	
		
	}
	
	//varArgsStringEx("Ramu","BE","Chennai","TamilNadu","India");
	public static void varArgsStringEx(String...s)
	{
		for(int i=0; i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
	}
	
	//System.out.println(addNumbers(10,20));		
	//System.out.println(addNumbers(10,20,30));		
	//System.out.println(addNumbers(10,20,30,40,50));

	// This method is accepting variable length arguments or Var agrs... Method with Optional Arguments 
	public static int addNumbers(int...x)
	{
		int sum = 0;
		
		for(int i=0; i<x.length;i++)
		{
			sum = sum+x[i];
		}		
		
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	public static void twoDimStringArrayInOneLine()
	{
			//String[] s = {"Java","Selenium","AUtomation","Testing"};
			
			String[][] s = {{"Java","Selenium"},{"Testing","DataBase","Scripting"},{"Framework","Cucumber","Maven","Jenkins"}};
			
			for(int i=0; i<s.length;i++)
			{
				for(int j=0; j<s[i].length;j++)
				{
					System.out.print(s[i][j]+" , ");
				}
				System.out.println();
			}
				
	}
	
	
	public static void twoDimArrayEx3()
	{
		String[][] s = new String[2][2];
		
		s[0][0] = "Java";
		s[0][1] = "Selenium";
		
		s[1][0] = "Testing";
		s[1][1] = "Framework";
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void twoDimArrayEx2()
	{

		int[][] x = new int[3][];
		
		x[0] = new int[2];
		x[1] = new int[3];
		x[2] = new int[4];
		
		x[0][0] = 100;
		x[0][1] = 200;
		
		x[1][0] = 300;
		x[1][1] = 400;
		x[1][2] = 500;
		
		x[2][0] = 600;
		x[2][1] = 700;
		x[2][2] = 800;
		x[2][3] = 900;
		
		
		for(int i=0; i<x.length;i++)
		{
			for(int j = 0; j<x[i].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void twoDimArrayEx1()
	{
	// int[] x= new int[0]; // it is allowed to create an aray of length zero in java
		
		int[][] x = new int[3][3];
		
		x[0][0] = 10;
		x[0][1] = 20;
		x[0][2] = 30;

		x[1][0] = 40;
		x[1][1] = 50;
		x[1][2] = 60;
		
		x[2][0] = 70;
		x[2][1] = 80;
		x[2][2] = 90;
		
		System.out.println(x[2][1]);
		
		System.out.println(x.length);
		
		System.out.println(x[0].length);
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}

}
