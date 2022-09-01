package com.corejava.practice;

public class Address {
	
	int flatNo;
	String area;
	String city;
	int pinCode;
	static String country = "India";
	
	
	public void printAddressDetails()
	{
		System.out.println("The flat no is "+flatNo + 
				" The area is "+area + "vThe city is "+city + " Pin code is "+pinCode);
		
	}

}
