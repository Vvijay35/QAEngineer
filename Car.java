package com.corejava.practice;

public class Car {
	
	int noOfGears;
	String colour;
	int seatingCapacity;
	String fuelType;
	boolean isAutomatic;
	static int noOfWheels = 4;
	
	
	public void drive()
	{
		int x = 20;	
		//System.out.println(noOfWheels);
		// Non static methods can access both static and non static
		// variables and methods..
		System.out.println(" The car of the colour "+colour +" no of gears are "+noOfGears +
				"which has the seating capacity of "+seatingCapacity +" Fuel type "+fuelType + 
				" Which is automatic "+isAutomatic +" is been driven ");
	}
	
	public static void test()
	{
		System.out.println("This is a test method...");
		//System.out.println(colour);
		// Static methods can only acces static global vriables
		// and they can call other static methods.
		// test1();
	}
	
	
	
	

}
