package com.corejava.collections;

import java.util.*;

import com.corejava.ploy.Dog;
import com.corejava.practice.Student;


/*
 * 1.  boolean add(Object obj)
	2. boolean remove(Object obj)
	3. boolean contains(Object obj)
	4. int size();
	5. boolean isEmpty();
	6. void clear();
	7. boolean addAll(Collection c1);- c.addAll(c1);
	8. boolean removeAll(Collection c1) -- c.removeAll(c1)
	9. boolean retainAll(Collection c1) -- c.retainAll(c2);
	10. Object[] toArray();
	11. Iterator iterator();
 */


public class Sept23_CollectionMethodsAndList {
	
	public static void main(String[] args) {
		
	
		
		
	}
	
	public static void listExample3()
	{
		List<String> list = new ArrayList<String>();
		
		list.add("selenium");
		list.add("java");
		list.add("Automation");
		list.add("selenium");
		list.add(null);
	
		
		System.out.println(list.size());
		System.out.println(list.contains("java"));

		System.out.println(list);
		
		List<String> list1 = new ArrayList<String>();
			list1.add("Testing");
			list1.add("DataBase");
			list1.add("DevOps");
			
			List<String> list2 = new ArrayList<String>();
			
			list2.add("development");
			list2.add("ProductManagement");
			
		
		System.out.println(list1);
			
		list.addAll(list1);
		
		System.out.println(list);
		
		list.removeAll(list1);
		
		System.out.println(list);
		list.addAll(list1);
		list.addAll(list2);
		
		
		System.out.println(list);
		
		list.retainAll(list2);
		
		System.out.println(list);
		
	}
	
	public static void listExampleWithType()
	{
		List<String> list = new ArrayList<String>();
		
		list.add("selenium");
		list.add("java");
		list.add("Automation");
		list.add("selenium");
		list.add(null);
	
		
		System.out.println(list.size());
		System.out.println(list.contains("java"));

		System.out.println(list);
	}
	
	public static void listEx2()
	{
		Student s2 = new Student();
		Dog d = new Dog();		
		String s3 = new String("java");
		
		List list1 = new ArrayList();
		
		list1.add(s2);
		list1.add(d);
		list1.add(s3);
		
		System.out.println(list1.size());
		
		
		Student s1 = new Student();
		Integer i4 = new Integer(500);
		
		List list2 = new ArrayList();
			list2.add(s1);
			list2.add(i4);
			
			System.out.println(list2.size());
		
		List list3 = new ArrayList();
			list3.add("selenium");
			list3.add("java");
			
			System.out.println(list3.size());
			
			list1.addAll(list2);
			System.out.println(list1.size());
			list1.addAll(list3);
			System.out.println(list1.size());
			
			//list1.removeAll(list2);
			System.out.println(list1.size());
			
			//list1.removeAll(list3);
			System.out.println(list1.size());
	}
	
	public static void listEx1()
	{
		Student s1 = new Student();
		Student s2 = new Student();
		Dog d = new Dog();
		Dog d2 = new Dog();
		String s3 = new String("java");
		String s4 = "Selenium";
		Integer i4 = new Integer(500);
		Integer i5 = 1000;		
		
		List list = new ArrayList();		
			list.add(s1);
			list.add(s2);
			list.add(d);
			list.add(d2);
			list.add(s3);
			list.add(s4);
			list.add(i4);
			list.add(i5);
			
			System.out.println(list.size());
			System.out.println(list.isEmpty());
			System.out.println(list.contains(s2));
			System.out.println(list.remove(s4));
			System.out.println(list.size());
			
	}

}

