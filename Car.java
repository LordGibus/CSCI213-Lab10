/*
Program Name: Car.java

Author: John Montgomery Rochte
Date: 5/7/2025
Assignment: CSCI-213 Lab 10

Purpose: ???

Status: Incomplete

*/

// Imports

// Class
public class Car extends Vehicle {
	
	// Instance variables
	private int doors;
	private int passengers;
	
	// Constructor
	public Car(String aMake, String aModel, String aPlate, int theDoors, int thePassengers) {
		
		super(aMake, aModel, aPlate);
		this.doors = theDoors;
		this.passengers = thePassengers;
		
	}
	
	// Getter functions
	public int getDoors() {
		return this.doors;
	}
	
	public int getPass() {
		return this.passengers;
	}
	
	// toString function
	@Override
	public String toString() {
		int theDoors = this.getDoors();
		String theString = String.format("%d-door ", theDoors);
		theString = theString + super.toString();
		return theString;
	}
	
	// Equals method
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Car)) {
			return false;
		}
		
		Car other = (Car) obj;
		
		if(super.equals(other)) {
			if(other.getDoors() == this.getDoors()) {
				if(other.getPass() == this.getPass()) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	// Copy method
	public Car copy() {
		String theMake = super.getMake();
		String theModel = super.getModel();
		String thePlate = super.getPlate();
		int theDoors = this.getDoors();
		int thePass = this.getPass();
		
		Car copy = new Car(theMake, theModel, thePlate, theDoors, thePass);
		return copy;
	}
}