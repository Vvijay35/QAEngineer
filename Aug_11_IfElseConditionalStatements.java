package com.corejava.practice;

public class Aug_11_IfElseConditionalStatements {

	public static void main(String[] args) {
		
		int month = 2;
		
		switch(month)
		{
			case 1:
			{
				System.out.println(" you are born in Jan");
				break;
			}
			case 2:
			{
				System.out.println(" you are born in Feb");
				break;
			}
			case 3:
			{
				System.out.println(" you are born in March");
				break;
			}
			case 4:
			{
				System.out.println(" you are born in April");
				break;
			}
			default:
			{
				System.out.println(" Please enter correct value for month..");
				break;
			}
			

		}
		
		System.out.println(" after all the cases...");

	}
	
	public static void ifElseIfElseIfElseEx()
	{
		int month = 15;
		
		if( month == 1)
		{
			System.out.println(" You are born in Jan , you will be rich..");
		}
		else if( month == 2)
		{
			System.out.println(" You are born in Feb , you will be famous..");
		}
		else if(month == 3)
		{
			System.out.println(" You are born in March , you will be inteligent..");
		}
		else if (month == 4)
		{
			System.out.println(" You are very smart...");
		}
		else
		{
			System.out.println(" please enter correct value for month....");
		}
		System.out.println(" after all the if else statements.");
		
	}
	
	public static void ifElseEx()
	{
		int a = 100;
		int b = 50;
		int c = 150;
		
		if( a > b)
		{
			if( a > c)
			{
				System.out.println(" A is biggest");
			}
			else
			{
				System.out.println(" C is the biggest");
			}
		}
		else
		{
			if( b > c)
			{
				System.out.println(" B is the biggest");
			}
			else
			{
				System.out.println(" C is the biggest");
			}
		}
	
	//======================================
	
	if( (a > b ) && (a > c))
	{
		System.out.println(" A is biggest");
	}
	if((b > a )  && (b > c ))
	{
		System.out.println(" B is biggest");
	}
	if((c > a ) && (c > b))
	{
		System.out.println(" C is biggest");
	}
	}
	
	public static void ifElseEx1()
	{
		int age = 20;
		String nationality = "Indian";	
		
		if( (age >=18) && nationality.equals("Indian"))
		{
			System.out.println(" You are eligible to vote");
		}
		else
		{
			System.out.println(" You cant vote for this country....");
		}
		
		System.out.println("after the if else....");
		
		if(age >=18)
		{
			if(nationality.equals("Indian"))
			{
				System.out.println(" You can vote");				
			}
			else
			{
				System.out.println(" you are not indian , you cant vote for this country...");
			}
				
		}
		else
		{
			System.out.println(" you are too young to vote...");
		}
	}
	
	public static void ifStatementEx()
	{
		int x = 10;
		int y = 50;
		
		if(x > y) // takes only true/false
		{
			System.out.println("x is bigger than y ");
		}
		System.out.println(" after the if statement....");
		
		boolean isMarried = true;
		
		if(isMarried == true)
		{
			System.out.println(" The employ is married..");
		}
		System.out.println(" after the if stament.");
		
		if(isMarried)
		{
			System.out.println(" The employ is married..");
		}
		
		boolean result = ((10 > 5) && ( 100 < 500) && (isMarried));
		System.out.println(result);
				
		if(result)
		{
			System.out.println(" The result is true");
		}
		
		String s = "java";
		String s1 = "java";
		
		if (s.equals(s1))
		{
			System.out.println(" The strings are equals");
		}
		System.out.println(" after the if statement...");
		
		if(true)
		{
			System.out.println(" The condition is true");
		}
		
		// flower brackets are optional if there is only one statement in true block..
		if(10 > 5)		
		{
			System.out.println(" 10 is bigger than 5");
		}
		
		
	}

}
