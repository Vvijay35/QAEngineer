package com.corejava.collections;

public class Laptop {
	
	double price ;
	String colour;
	int ram;

	
	public Laptop(double price, String colour, int ram) {		
		this.price = price;
		this.colour = colour;
		this.ram = ram;
	}
	
	public String toString()
	{
		return "Price is "+price+" colour is "+colour +" Ram is "+ram;
				
	}


}
