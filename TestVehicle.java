package com.corejava.oops;

public class TestVehicle {

	public static void main(String[] args) {
		
		Van v1 = new Van();
		
		v1.setColour("White");
		v1.setSeatingCapacity(5);
		
		
		v1.drive();
		v1.drive("CNG");
		
		
		System.out.println("================");
		
		Bus b1 = new Bus();
		b1.setColour("Red");
		b1.setSeatingCapacity(50);
		
		b1.drive();
		b1.stackLuggageOnTop();
		
	}

}
