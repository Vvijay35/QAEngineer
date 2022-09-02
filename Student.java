package com.corejava.practice;

public class Student {

	/*
	1. Constructor is a method like entity
	2. The name of the constructor will be same as the name of the class
	3. It will be invoked whenever we create the object of the class
	4. It may or may not take arguments
	5. It will not have any return type
	6. If we dont write the constructor then the compiler will add the default constructor..
	7. If we write the constructor then the compiler will not add the default constructor...
	8. A class can have any number of constructors....
	To write a constructor go to Source -> Generate Constructors using fields...
*/
	
	
	String sName;
	int std;
	double feesDue;
	boolean isRuralStudent;
	static final String schoolName = "M.G.School";
	boolean homeWorkStatus;
	Address a ;
	
	
	// Default Constructor ,, it will not take any arguments......
	public Student()
	{
		System.out.println(" Inside the default constructor..");
	}
	
	// Parameterized constructor or constructor with arguments
	//public Student(String name, int standard, double d,boolean b,boolean b1,Address a1)
	public Student(String sName, int std, double feesDue,boolean isRuralStudent,boolean homeWorkStatus,Address a)
	{
		// this keyword is used for assigning the values to the current object...
		this.sName = sName;
		this.std = std;
		this.feesDue = feesDue;
		this.isRuralStudent = isRuralStudent;
		this.homeWorkStatus = homeWorkStatus;
		this.a = a;		
		
	}
	
	public Student(String name, int standard, double d)
	{
		sName = name;
		std = standard;
		feesDue = d;
		
	}
	
	
	public void checkStudentFeesStatus()
	{
		System.out.println(" The student has amount " + feesDue + " balace to be paid for fees");
		
	}
	
	public void homeWorkStatus()
	{
		
		System.out.println(" The student by name "+sName +  " Of the class "+std +" who is a rural Student "+isRuralStudent
		+ " has  Pending Home work  "+homeWorkStatus);
	}
	
	public static void attendSchoolPrayer()
	{
		System.out.println(" ALl the students of M.G. School must attend School prayer every day...");
	}
	
	
	public void printAddressDetailsOfStudent()
	{
		System.out.println(" The address details for the student " + sName);
		a.printAddressDetails();
		 
	}
	
	
	
	

}
