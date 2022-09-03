package com.corejava.oops;

public class TestCar {

	public static void main(String[] args) {
		Car c = new Car();
		
		//c.colour = "Black";
		c.setColour("Black");
		
		//c.engineCapacity = 100;
		c.setEngineCapacity(1000);
		
		//c.seatingCapacity = -5;
		c.setSeatingCapacity(5);
		
		c.drive();
		c.dropYourFriendsToMovie();
		
		System.out.println(" The engine capacity of the car is "+c.getEngineCapacity());

	}

}
