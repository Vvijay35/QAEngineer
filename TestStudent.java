package com.corejava.practice;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.sName = "Ramu";
		s1.std = 5;
		s1.feesDue = 4000.50;
		s1.isRuralStudent = true;
		s1.homeWorkStatus = false;
		
		Address a1 = new Address();
		
			a1.flatNo = 1550;
			a1.area = "BTM layout";
			a1.city = "Bangalore";
			a1.pinCode = 560075;
			
			s1.a = a1;
			
		System.out.println(Student.schoolName);
		
		//s1.schoolName = " M. G Schol of Champions";
		// school name cant me mdofied as it is final.
		
		s1.checkStudentFeesStatus();
		
		s1.homeWorkStatus();
		
		Student.attendSchoolPrayer();
		
		s1.printAddressDetailsOfStudent();
		
		
		
		System.out.println("=================");
		
		Address a2 = new Address();
		
		a2.flatNo = 420;
		a2.area = "Kacheguda";
		a2.city = "Hyderabad";
		a2.pinCode = 56000;
		
		//Student s2 = new Student("Shamu",4, 4000.50, false, true, a2);
		
		Student s2 = new Student("Shamu",4, 4000.50, false, true, a2);
			
		
		s2.printAddressDetailsOfStudent();
		
		
		System.out.println("++++++++++++++");
		
		Student s3 = new Student("Raheem", 6, 400.50);
		
		//s3.a = a2;
		
		//3.printAddressDetailsOfStudent();
		
		s3.checkStudentFeesStatus();
		

	}

}
