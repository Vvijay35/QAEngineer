package com.corejava.collections;

public class Mobile implements Comparable<Mobile>{
	
	double price ;
	String colour;
	int ram;

	
	public Mobile(double price, String colour, int ram) {		
		this.price = price;
		this.colour = colour;
		this.ram = ram;
	}
	
	public String toString()
	{
		return "Price is "+price+" colour is "+colour +" Ram is "+ram;
				
	}


	public int compareTo(Mobile m) {	
		
		if(this.price < m.price )
			return -1;
		else			
			return 1;
	}
	
	

}
