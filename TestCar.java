package com.corejava.practice;

public class TestCar {

	public static void main(String[] args) {
		
		
		// A Class is a blue print or Templete 
		// A class is a userdefined Data Type
		
		//An Oject is an instance of the class , this is real entity
		
		
		Car c = new Car();
		
		c.noOfGears = 5;
		c.colour = "White";
		c.seatingCapacity = 5;
		c.fuelType = "Petrol";
		c.isAutomatic = true;
		
		c.drive();
		
		Car c1 = new Car();
		c1.noOfGears = 7;
		c1.colour = "Black";
		c1.seatingCapacity = 8;
		c1.fuelType = "Diesel";
		c1.isAutomatic = false;
		
		c1.drive();
		
		
		
		
		

	}

}
