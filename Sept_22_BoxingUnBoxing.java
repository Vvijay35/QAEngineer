package com.corejava.collections;

public class Sept_22_BoxingUnBoxing {
	
	
	public static void main(String[] args) {
		
		int x = 20;
		
		// Boxing or Wrapping is the process of converting primitive to its corresponding object with the help of wrapper classes
		Integer xObj = new Integer(x);
		
		
		// Un Boxing or Un Wrapping is the process of converting Object to its corresponding primitive value
		int y = xObj.intValue();
		
		char c = 'a';
		
		Character cObj = new Character(c); // boxing 
		
		cObj.charValue();// unboxing
		
		int[] xArray = {10,20,30,40};
		
		
		Integer m = 20; // AutomBoxing
		
		int n = m; // Auto Unboxing..
		
		
		
	}

}
