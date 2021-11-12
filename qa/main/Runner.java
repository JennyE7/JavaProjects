package com.qa.main;

import com.qa.vehicle.*;
import com.qa.garage.*;

public class Runner {
	
	public static void main(String[] args) {
		
		Vehicle car = new Car(4, 1, "grey", 120, "Car", false, 3);
		Vehicle bike = new Motorbike(2, 2, "black", 150, "Motorbike", 2);
		Vehicle van = new Van(4, 3, "white", 60, "Van", 3, true);
		
		Garage.addToGarage(car);
		Garage.addToGarage(bike);
		Garage.addToGarage(van);
	
	
		
	}
	
	
	

}
