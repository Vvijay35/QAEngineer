package com.corejava.practice;

public class Aug5_MembersOfClassStaticNonStatic {	
	int age =25;
	static double salalry = 5000.50;	

	public static void main(String[] args) {		
		int x; // Declaration
		double salalry = 10000.75;
				
		// System.out.println(x); // we cant print local variables without initializing them
		x = 100; // Initialization
		int y = 250 ; // Both declaration and initialization in same line...
		// Local variables must be initialized and they dont carry any default values.
				
		System.out.println(" Inside the main method");
		System.out.println(x);
		//System.out.println(age); // Cant access a non static global variable inside a static method..
		System.out.println(salalry); // can access a static global variable inside the static method...
		testMethod();	
		
		// Creating object of this class using the object we can access non static members
		//classname referenceVariableName = new classname();
		
		Aug5_MembersOfClassStaticNonStatic obj = new Aug5_MembersOfClassStaticNonStatic();
		obj.nonStaticMethod();
		System.out.println(obj.age);
		
		
	}
	
	public static void testMethod()
	{
		int y = 200;
		
		final int x = 150;
		//x = 500;		
		
		System.out.println(" Inside the test Method...");
		System.out.println(x);
		System.out.println(salalry);// can access a static global variable inside the static method...
		//System.out.println(age); // Cant access a non static global variable inside a static method..	
	}
	
	public void nonStaticMethod()
	{
		int z = 500;
		System.out.println("Inside the non static method..");
		System.out.println(age);
		System.out.println(salalry);
		
	}

}
