package com.corejava.oops;

public class Van extends Vehicle{
	
	// Overridden drive method.....
	public void drive()
	{
		System.out.println(" The Van of the colour "+ getColour() +" And which is havingseating capacity of  "
				+ getSeatingCapacity() +" which can be driven upto a speed of 200 KMPH");
		
	}
	
	// Over loaded drive method..
	public void drive(String  fuelType)
	{
		System.out.println(" The Van of the colour "+ getColour() +" And which is havingseating capacity of  "
				+ getSeatingCapacity() +" which is having fuel type as "+fuelType + " This is a over loaded driver method..");
		
	}
	
	
	

}
