package com.qa.vehicle;

public class Car extends Vehicle {
	
	private boolean hasRadio;
	private int numDoors;

	public Car(int numWheels, int id, String colour, int maxSpeed, String type, boolean hasRadio, int numDoors) {
		super(numWheels, id, colour, maxSpeed, type);
		this.hasRadio = hasRadio;
		this.numDoors = numDoors;
		
	}

	@Override
	public double calculateBill() {
		double cost = getNumWheels()*50;
		
		if (hasRadio) {
			cost+=30;
		}	
		return cost;
	}
	

	public boolean isHasRadio() {
		return hasRadio;
	}

	public void setHasRadio(boolean hasRadio) {
		this.hasRadio = hasRadio;
	}

	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}
	

	
	


}
