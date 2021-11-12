package com.qa.vehicle;

public abstract class Vehicle {
	
	private int numWheels;
	private int id;
	private String colour;
	private int maxSpeed;
	private String type;
	
	

	public Vehicle(int numWheels, int id, String colour, int maxSpeed, String type) {
		super();
		this.numWheels = numWheels;
		this.id = id;
		this.colour = colour;
		this.maxSpeed = maxSpeed;
		this.type = type;
	}
	
	
	
	public int getNumWheels() {
		return numWheels;
	}





	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getColour() {
		return colour;
	}





	public void setColour(String colour) {
		this.colour = colour;
	}





	public int getMaxSpeed() {
		return maxSpeed;
	}





	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}





	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public abstract double calculateBill();
}
