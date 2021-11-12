package com.qa.vehicle;

public class Van extends Vehicle {
	
	private boolean isCamper;
	private int numSeats;

	public Van(int numWheels, int id, String colour, int maxSpeed, String type, int numSeats, boolean isCamper) {
		super(numWheels, id, colour, maxSpeed, type);
		this.numSeats = numSeats;
		this.isCamper = isCamper;
	}

	@Override
	public double calculateBill() {
		double cost = getNumWheels()*100;
		
		if (isCamper) {
			cost+=500;
		}		
		return cost;
	}

	
	public boolean isCamper() {
		return isCamper;
	}

	public void setCamper(boolean isCamper) {
		this.isCamper = isCamper;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	
}
