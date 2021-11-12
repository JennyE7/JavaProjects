package com.qa.garage;

import java.util.List;
import java.util.ArrayList;
import com.qa.vehicle.*;


public class Garage {
	
	

	public static List<Vehicle> vehicles = new ArrayList<>();
	
	
	public static void addToGarage(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	public static void calculateBill() {
		for (Vehicle i : vehicles) {
			System.out.println(i.calculateBill());
		}
	}
	
	public static void removeFromGarage(int id) {
		for (Vehicle i : vehicles) {
			if (i.getId() == id) {
				vehicles.remove(i);
			}
		}
	}
	
	public static void removeFromList(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}
	
	public static void fix(Vehicle vehicle) {
		vehicle.calculateBill();
		vehicles.remove(vehicle);
	}
	
	public static void emptyGarage() {
		for (Vehicle i : vehicles) {
			vehicles.remove(i);
		}
	}
	
	
	public void removeByType(String type) {
		for (Vehicle i : vehicles) {
			if (i.getType() == type) {
				vehicles.remove(i);
			}
		}
	}	

	

}
