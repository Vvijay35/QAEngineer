package com.corejava.practice;

public class Aug8_MembersAndAccessControllers {	
	private static int personAge = 15;
	//final boolean canVote = false;  // Final global variables cant be modified
	boolean canVote = false;
	static int y; // Declaration
	public static double salary = 5000.50;
	
	public static void main(String[] args) {
		int personAge ; // Declaration
		personAge = 25; // initialization
		final int x = 30; // both declaration and initialization in one line..
		// x = 45; // final variables cant be modified..
		System.out.println(personAge);
		personAge=50;
		System.out.println(" The default value of Y is "+y);
		Aug8_MembersAndAccessControllers.testStatic();		
		Aug8_MembersAndAccessControllers obj = new Aug8_MembersAndAccessControllers();
		System.out.println(obj.canVote);
		obj.canVote = true;
		obj.testNonStatic();
	}
	
	public void testNonStatic()
	{
		System.out.println(" Inside the non static method...");
		System.out.println(canVote);
		System.out.println(personAge);
		testStatic();
	}
	
	public static void testStatic()
	{
		System.out.println(" inside the static method..");
		System.out.println(personAge);
		personAge = 80;
	}
	
	
	
	
	

}
