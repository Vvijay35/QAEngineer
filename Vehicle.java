package com.corejava.oops;

public class Vehicle {
	
	/*
	 *  INHERITANCE :
	 *  -----------
	 
		When a class extends another class we say the child class extends the parent class or the sub class extends the super class..
		This is inheritance. it is achieved using extends keyword
		This is to set the IS-A relationship..
		when a class extends another class, all the public members of the parent class will be inherited to the child class.
		We can access the members of the parent class using the child class object .
		Java does supports only multi level inheritance and it does not support multiple inheriance.. 
		A class can only extend one class at a time

		Method Over Riding
		------------------
		Changing the implementation of the method
		( Body of the method ) in the child class , which is inherited from the parent class..

	 */
	
	private String colour;
	private int seatingCapacity;
	
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	
	public void drive()
	{
		System.out.println(" The vehicle of the colour "+colour +" "
				+ "and which is having the seating capacity of "+seatingCapacity +" is been driven");
	}
	
	
	

}
