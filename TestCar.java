package com.corejava.practice;

import java.util.Arrays;

public class TestCar {

	public static void main(String[] args) {
		
		
		// A Class is a blue print or Templete 
		// A class is a userdefined Data Type
		
		//An Oject is an instance of the class , this is real entity
		
		
		Car c = new Car();
		
		System.out.println(c.noOfGears);
		
		c.noOfGears = 5;
		c.colour = "White";
		c.seatingCapacity = 5;
		c.fuelType = "Petrol";
		c.isAutomatic = true;
		System.out.println(c.noOfWheels);
		System.out.println(Car.noOfWheels);
		
		c.drive();
		
		Car c1 = new Car();
		c1.noOfGears = 7;
		c1.colour = "Black";
		c1.seatingCapacity = 8;
		c1.fuelType = "Diesel";
		c1.isAutomatic = false;
		
		c1.drive();
		System.out.println(c1.noOfWheels);
		System.out.println(Car.noOfWheels);
		
		c=c1;
		// The garbage collector is part of JVM , which will delete all the objects which
		// are not referred by any reference variables
		// In the above example the object which was pointed by c will be garbage collected....
		
		System.out.println("++++++++++++++++++++++++++");
		
		
		System.out.println(c.colour);
		System.out.println(c1.colour);
		
		c= null;
		
		System.out.println(c.colour);
		
		Car.test();
		// Arrays.sort(null);  Arrays is a class and sort is  a static method.
		
		
		/*
		
		//Car[] cArray = new Car[2];
		 * 
		 * String[] s = {"java","Selenium","Automation"};
		
		// We can create the Arrays of Car type to store Car Objects
		
		System.out.println("====================");
		
		Car[] cArray = {c,c1};
		
		for(Car m : cArray)
		{
			System.out.println(m.colour);
			m.drive();
		}
		
		*/
		
		
		

	}

}
