package com.sowmik.inheritance.vehicles;

import com.sowmik.inheritance.parent.Vehicle;

public class Bike extends Vehicle{
	private String handle;

	public Bike() {
		super();
		this.handle = "three part";
	}

	public String getHandle() {
		return handle;
	}

	public Bike(String handle, String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine, wheels, seats, fuelTank, lights);
		this.handle = handle;
	}

	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights()
				+ "]";
	}
	@Override
	public void run() {
		System.out.println("Bike is running");
		System.out.println(toString());
	}
	
}
