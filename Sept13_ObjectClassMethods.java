package com.corejava.interfaces;

public class Sept13_ObjectClassMethods {

	public static void main(String[] args) {
		
		
	
		

	}
	
	public static void equalsMethodEx()
	{
		Dog d = new Dog();
		
		d.age = 10;
		
		
		Dog d1 = new Dog();
		d1.age = 10;
		
		System.out.println(d.equals(d1));
	}
	
	public static void getClassEx()
	{

		Dog d = new Dog();
		
		// Runtime class of the current Object 
		System.out.println(d.getClass());
	}
	
	public static void hashCodeMethodEx()
	{
		Dog d = new Dog();	
		d.age = 10;
		System.out.println(d.hashCode());
		
		Dog d1 = new Dog();
		d1.age=15;
		System.out.println(d1.hashCode());
	}
	
	public static void toStringMethodEx()
	{
		Dog d = new Dog();
		
		System.out.println(d);
		
		Dog d1 = new Dog();
		
		System.out.println(d1);
		
		System.out.println(d.toString());
		
		Memal m = new Memal();
		
		System.out.println(m);
		
		System.out.println(m.toString());
	}

}
