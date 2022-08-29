package com.corejava.practice;

public class Car {
	
	int noOfGears;
	String colour;
	int seatingCapacity;
	String fuelType;
	boolean isAutomatic;
	
	
	public void drive()
	{
		System.out.println(" The car of the colour "+colour +" no of gears are "+noOfGears +
				"which has the seating capacity of "+seatingCapacity +" Fuel type "+fuelType + 
				" Which is automatic "+isAutomatic +" is been driven ");
	}
	

}
