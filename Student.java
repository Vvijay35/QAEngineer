package com.corejava.practice;

public class Student {

	String sName;
	int std;
	double feesDue;
	boolean isRuralStudent;
	static final String schoolName = "M.G.School";
	boolean homeWorkStatus;
	Address a ;
	
	
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
