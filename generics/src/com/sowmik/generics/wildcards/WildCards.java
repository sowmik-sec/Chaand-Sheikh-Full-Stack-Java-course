package com.sowmik.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
	private int VehicleId;

	public Vehicle(int vehicleId) {
		super();
		VehicleId = vehicleId;
	}

	public int getVehicleId() {
		return VehicleId;
	}

	@Override
	public String toString() {
		return "VehicleId = " + VehicleId;
	}
	
	void info() {
		System.out.println("Vehicle ID is "+getVehicleId());
	}
	
}

class Car extends Vehicle {
	private String carModel;

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + "]";
	}

	public String getCarModel() {
		return carModel;
	}

	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		this.carModel = carModel;
	}
	
	@Override
	void info() {
		System.out.println("Car ID is "+getCarModel());
	}
	
}

public class WildCards {
	public static void main(String[] args) {
		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Vehicle(14));
		list.add(new Car(7, "BMW X7"));
		
		display(list);
	}
	
	public static void display(List<? extends Vehicle> list) {
		for(Vehicle element : list) {
			element.info();
		}
	}
	
}
