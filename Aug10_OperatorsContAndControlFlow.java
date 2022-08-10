package com.corejava.practice;

public class Aug10_OperatorsContAndControlFlow {

	public static void main(String[] args) {
		
	
	}
	
	public static void assignmentOperators()
	{
		int t = 10 ; // simple assignment
		
		// chained assignment
		int m,n,o,p;
		m=n=o=p=100;
		
		m=200;
		
		// compound assignment
		int a = 10;
		a += 20;
		
		System.out.println(a);
		
		int x = 10;
		x -= 5;
		
		System.out.println(x);
		
		int y = 50;
		y *= 2;
		System.out.println(y);
		
		int b = 100;
		b /= 2;
		
		System.out.println(b);
		
		
		
	}
	
	public static void newAndInstanceOfEx()
	{

		Aug10_OperatorsContAndControlFlow s = new Aug10_OperatorsContAndControlFlow();
		Sample s1 = new Sample();
		
		System.out.println((s instanceof Aug10_OperatorsContAndControlFlow));	
		System.out.println((s1 instanceof Sample));
			
	}
	
	public static void conditionalOperator()
	{
		int x = 50;
		int y = 100;
		
		int z = (x < y )? 500:1000;
		
		System.out.println(z);
		
		if(x > y)
		{
			z = 500;
		}
		else
		{
			z = 1000;
		}
	}
	
	public static void incrementAndDecrementOperators()
	{


		/*
		 * Pre Increment 
		  int x = 10; 
		  System.out.println(" Initial value of x is "+x);
		  int y = ++x;
		  
		   System.out.println(" The value of y is "+y);
		   System.out.println("Final value of x is "+x);
		  */
		 
		/*
		 * Post Increment
		  int x = 10; 
		  System.out.println(" Initial value of x is "+x);
		  int y = x++;
		  
		   System.out.println(" The value of y is "+y);
		   System.out.println("Final value of x is "+x);
		 */
		
		
		/*
		  //Pre Decrement 
		  int x = 10; 
		  System.out.println(" Initial value of x is "+x);
		  int y = --x;
		  
		   System.out.println(" The value of y is "+y);
		   System.out.println("Final value of x is "+x);
		  */
		
		/*
		  //Post Decrement 
		  int x = 10; 
		  System.out.println(" Initial value of x is "+x);
		  int y = x--;
		  
		   System.out.println(" The value of y is "+y);
		   System.out.println("Final value of x is "+x);
		   */
	}
	
	public static void logicalOperatorsEx()
	{
		int x = 50;
		int y = 100;
		
		boolean result = ((x < y ) && (y > x));
				
		System.out.println(result);
		
		boolean orResult = ((x < y ) || (y > 200));
		
		System.out.println(orResult);
		
		boolean notResult = !(x < y);
		System.out.println(notResult);
	}

}
