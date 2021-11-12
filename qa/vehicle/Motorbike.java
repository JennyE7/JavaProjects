package com.qa.vehicle;

public class Motorbike extends Vehicle {
	
	private int numHelmets;

	public Motorbike(int numWheels, int id, String colour, int maxSpeed, String type, int numHelmets) {
		super(numWheels, id, colour, maxSpeed, type);
		this.numHelmets = numHelmets;
	}

	@Override
	public double calculateBill() {
		double cost = (getNumWheels()*50) + (numHelmets*35);
		return cost;
	}

	public int getNumHelmets() {
		return numHelmets;
	}

	public void setNumHelmets(int numHelmets) {
		this.numHelmets = numHelmets;
	}

	
}
