package com.corejava.practice;

public class AUg18_MethodsAndMethodOverLoading {

	public static void main(String[] args) {		
		
	}
	
	//System.out.println(findFactorialUsingForLoop(5));
	public static int findFactorialUsingForLoop(int x)
	{
		int fact = 1;
		
		for(int num=x; num>1;num--)
		{
			fact=( fact * num);
		}
		
		return fact;
		
	}
	
	
	
	
	/*
	 * char c = 'a'; char c1 = 'b'; int x = 10; System.out.println(c+x);
	 */
	
	//System.out.println(joinInitialAndAge('M', 25));
	public static int joinInitialAndAge(char c, int age)
	{
		int s = c+age;
		return s;
	}
	
	//System.out.println(joinNameAndInitial("Ramu",'M'));
	public static String joinNameAndInitial(String s, char c)
	{
		String s1 = (s+c);
		return s1;
	}
	
	

	/*
	for(int x = 3; x<=100; x++)
	{
		boolean isPrime = checkNumberPrimeUsingForLoop(x);
		if(isPrime)							
			System.out.println(x);			
	}			
	*/
	//System.out.println(checkNumberPrimeUsingForLoop(53));
	public static boolean checkNumberPrimeUsingForLoop(int num)
	{
		
		boolean isPrime = false;		
		for(int x=2; x<num;x++)
		{
			if(num % x == 0)
			{
				isPrime = false;
				break;
			}
			else
			{
				isPrime = true;
			}
		}
		
		return isPrime;
	}
	
	
	
	//AUg18_MethodsAndMethodOverLoading obj = new AUg18_MethodsAndMethodOverLoading();
	//System.out.println(obj.addEmpDetails("Ramu", 25));			
	public String addEmpDetails(String name, int age)
	{
		return  (name+" "+age);
		
	}
	
	

	
	//int fact = findFactorial(5);
	//System.out.println(fact);
	public static int findFactorial(int num)
	{
		
		int fact = 1;		
		while(num > 1 )
		{
			fact = (fact * num);
			num--;
		}		
		
		return fact;
	}
	
	
	
	//int sum = addNumbers3(102,200);		
	//System.out.println(" The sum of 2 numbers is "+ sum);
	public static int addNumbers3(int x, int y)
	{
		int sum = ( x + y);		
		return sum;
	}
	
	public static void addNumbers2(int x, int y)
	{
		//int x = a;
		//int  y = b;
		
		int sum = ( x + y);
		
		System.out.println(sum);
	}
	
	public static void addNumbers1(int a, int b)
	{
		int x = a;
		int  y = b;
		
		int sum = ( x + y);
		
		System.out.println(sum);
	}
	
	public static void addNumbers0()
	{
		int x = 100;
		int  y = 200;
		
		int sum = ( x + y);
		
		System.out.println(sum);
	}
	
	public static void febSeries()
	{
		int counter = 1;
		int fn = 0;
		int sn = 1;
		
		System.out.print(fn+","+sn+",");
		
		while( counter <=10)
		{
			int sum = (fn+sn);
			System.out.print(sum+",");
			fn=sn;
			sn=sum;
			counter++;
			
		}
		
	}



	
}
