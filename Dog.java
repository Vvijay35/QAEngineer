package com.corejava.collections;

public class Dog implements Comparable<Dog>{

	int age;
	String colour;
	
	public void eat()
	{
		System.out.println(" The Dog of the age "+age+" of the colour "+colour +" is eating");
	}

	
	public String toString()
	{
		return "Age "+age+" colour "+colour;
	}
	
	public int compareTo(Dog o) {
	
		if(this.age < o.age)
			return -1;
		else			
			return 1;
	}
}
