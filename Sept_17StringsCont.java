package com.corejava.strings;

import java.util.Arrays;

public class Sept_17StringsCont {

	public static void main(String[] args) {
		
		
		
		
	}
	
	public static void stringConstructors()
	{
		char[] c = {'a','b','c','d'};	
		
		String s1 = new String(c);
		
		System.out.println(s1);
		
		String s2 = new String("Selenium");
		
		StringBuffer sb = new StringBuffer(s2);
	}

	public static void stringBufferMutableEx()
	{

		StringBuffer sb = new StringBuffer("Selenium");
		
		System.out.println(sb.length());
		
		sb.deleteCharAt(2);
		
		System.out.println(sb);
		
		sb.append('b');
		
		System.out.println(sb);
		
		sb.insert(1, 'M');
		
		System.out.println(sb);
		
		sb.insert(2, "automation");
		System.out.println(sb);
		
		sb.setCharAt(2, 'D');
		
		System.out.println(sb);
		
		String s2 = "Selenium";
		
		StringBuffer sb1 = new StringBuffer(s2);
		
		sb1.reverse();
		
		System.out.println(sb1);
		
	}
	
	public static void revNumberEx()
	{
		int x = 1234;
		
		String s = String.valueOf(x);
		String sRev = "";
		
		for(int i=(s.length()-1); i >=0 ; i--)
		{
			sRev = sRev+s.charAt(i);
		}
		
		int y = Integer.parseInt(sRev);
		
		System.out.println(y);
		
	}
	
	
	public static void conversionFromStringToIntAndIntToString()
	{
		int x = 4500;		
		String s = String.valueOf(x);		
		System.out.println(s.length());		
		int y = Integer.parseInt(s);
		
		
	}
	
	public static void findOccranceUsingReplace()
	{
		String s = "selenium";	
		
		String s1 = s.replace("e", "");
		
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println(s.length()-s1.length());
		
		
	}
	
	
	public static void stringToCharArray()
	{
		String s = "selenium";
		
		char[] c = s.toCharArray();
		
		System.out.println(c.length);
	}
	
	public static int findCharOccuranceInString(String s, char e)
	{
		int counter = 0;
		
		for(int x=0; x<s.length();x++)
		{
			char a = s.charAt(x);
			if( e == a)
			{
				counter++;
			}
		
		}
		
		return counter;
		
	}
	
	
	public static  void splitEx()
	{
		String s = "India is a holy country";
		
		String[] s1 = s.split(" ");
		
		for(String m : s1)
		{
			System.out.println(m);
		}
		
		String s2 = "India#is#a#holy#country";
		
		String[] s3 = s2.split("#");
		
		System.out.println(Arrays.toString(s3));
	}
	
	public static void subStringEx()
	{
		String s = "Selenium";
		
		String s1 = s.substring(4);
		
		System.out.println(s1);
		
		String s2 = s.substring(2, 7);
		
		System.out.println(s2);
	}
	
	public static void containsAndReplace()
	{
		String s = "Selenium";		
		System.out.println(s.isEmpty());
		
		s = s.replace('S', 'W');
		
		System.out.println(s);
		
		s = s.replace("We","Se");
		
		System.out.println(s);
	}
	
	
	public static void contrainsMethodEx()
	{
		String s = "selenium";		
		System.out.println(s.contains("se"));
		
		String s1 = "India is a holy country";
		
		System.out.println(s1.contains("holy"));
		
	}
	
	public static void stringConcatinationEx()
{
		String s = "Selenium";
		
		String s1 = "Automation";
		
		System.out.println(s+" "+s1);
		
		System.out.println(s.concat(" ").concat(s1));
	
	
}
	public static void reverseStringEx()
	{
		String s = "Selenium";
		
		String sRev = "";
		
		for(int x = (s.length() -1  ); x >=0 ; x-- )
		{
			sRev = sRev + s.charAt(x);
		}

		System.out.println(sRev);
	}

}
