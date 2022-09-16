package com.corejava.strings;

import com.corejava.interfaces.Cat;
import com.corejava.practice.Student;

public class Sept16_Strings {

	/*
	 * 
	 * String is a class in java its not a primitive data type
	 * Sequence of characters enclosed with in the double quotes is String
	 * eg:
	 *  "abcd"
	 * "abcd1234"
	 * "abcd@#$"
	 * "a  b  c"
	 * "123456"
	 * Strings can be created in  2 ways
	 * 1) Using the String Keyword
	 * String s = "Java";
	 * 
	 * 2) Like other Objects
	 * String s1 = new String("Java");
	 * String class extends java.lnag.Object
	 * 
	 * Strings are immutable that is once any String object is created we cant modify the contents of the object
	 * If we modify a new Object is created rather than updating the existing object, and the reference will be made
	 * to point to new Object
	 * 
	 */
	
	public static void main(String[] args) {
		
		String s = "java";		
		String s1 = "selenium";		
		String  s2 = "java";		
		s1 = "testing";		
		
		System.out.println(s);
		System.out.println(s.toString());
		
		System.out.println(s.equals(s2));
		System.out.println(s==s2);
		
		String s3 = new String("java");		
		s3 = new  String("testing");		
		
		String s4 = new String("testing");
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s3.equals(s4));
		
		System.out.println(s4.hashCode());
		
		System.out.println(s3.hashCode());
		
		System.out.println("=================================");
		
		/*
		 * Cat c = new Cat(); System.out.println(c); System.out.println(c.toString());
		 */
		
		String str = "selenium";
		
		System.out.println(str.length());
		
		//str.toUpperCase(); // str will not be changed as Strings are immutable
		
		str = str.toUpperCase();
		System.out.println(str);
		
		
		System.out.println(str.charAt(2));
		
		System.out.println(str.charAt(7));
		
		System.out.println(str.indexOf('S'));
		
		System.out.println(str.indexOf('E'));
		
		System.out.println(str.lastIndexOf('E'));
		
		System.out.println("++++++++++++++++++");
		
		for(int x = 0; x<str.length();x++)
		{
			System.out.println(str.charAt(x));
		}
		
		System.out.println("*****************************");
		
		for(int y = ((str.length())-1); y>=0; y--)
		{
			System.out.println(str.charAt(y));
		}
		
		System.out.println(str.contains("SM"));
		
		System.out.println(str.startsWith("SE"));
		
		System.out.println(str.endsWith("UM"));
		
		String str1 = " automation ";
		
		System.out.println(str1.length());
		
		str1 = str1.trim(); // removes leading and trailing empty spacecs....
		
		System.out.println(str1.length());
		
		
		
		
		


	}

}
