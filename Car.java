package com.corejava.oops;

public class Car {
	
	// Data Hiding = Hide your data members from out side code by declaring them as private
	// Encapsulation = Write public getters and setters  and bind the data members with corresponding setters/getters
	
	private String colour;
	private int seatingCapacity;
	private int engineCapacity;
	
	public void setColour(String colour)
	{
		String[] colours = {"Black","White","Yellow","Grey"};
		
		if( ( colour.equalsIgnoreCase("black")) || (colour.equalsIgnoreCase("white")))
			{
					this.colour = colour;
			}
		else
		{
			System.out.println(" The colour cant be set to the car...");
		}
	}
	
	public String getColour()
	{
		return colour;
	}
	
	
	
	
	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		if((seatingCapacity == 5) || (seatingCapacity == 8 ))
		{
			this.seatingCapacity = seatingCapacity;
		}
		else
		{
			System.out.println(" Please enter valid seating capacity....");
		}
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		
		if( (engineCapacity > 800) && (engineCapacity < 1500))
		{
			this.engineCapacity = engineCapacity;
		}
		else
		{
			System.out.println(" Please enter the valid seating capcity..");
		}
	}

	public void dropYourFriendsToMovie()
	{
		System.out.println(" I have a "+ colour + " car I can drop only "+seatingCapacity +" Friends" );
		
	}

	public void drive()
	{
		if( engineCapacity > 800)
		{
			System.out.println(" The car of the colour "+ colour +" can be driven up to 150 KPMH");
		}
	}

}
