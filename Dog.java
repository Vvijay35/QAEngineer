package com.corejava.interfaces;

public class Dog extends Memal implements Animal,Pet{
	
	int age;

	
	public void eat() {
		System.out.println(" The dog of the age "+age+" is eating.....");
		
	}

	
	public void sleep() {
		System.out.println(" The dog is sleeping.....");
		
	}

	
	public void drink() {
		System.out.println(" The dog is Drinking........");
		
	}
	
	public void bark()
	{
		System.out.println(" The dog of the age "+age+" is barking bow bow.....");
	}



	public void showSuperPowersOfAnimal() {
		System.out.println(" Show the super powers that Dog has");
		
	}


	
	public void recognizeOwner() {
		System.out.println(" The dog can recognize its owner and moves the tail when wner comes...");
		
	}


	
	public void hasMagicalPowers() {
		System.out.println(" The Dog has Magical Powers");
		
	}
	
	public void walk()
	{
		System.out.println(" The dog is walking...");
	}
	
	// Overridden toString() method 
	public String toString()
	{
		return "This is the overriden toString Method from Dog Class";
	}
	
	// Overridden int method
	public int hashCode()
	{
		return this.age;
	}
	
	  public boolean equals(Object obj) {
	      
		  Dog d1 = (Dog)obj;
		  
		  if(this.age == d1.age)
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
		  
		  
	    }

}
