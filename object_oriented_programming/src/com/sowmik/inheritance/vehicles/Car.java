package com.sowmik.inheritance.vehicles;

import com.sowmik.inheritance.parent.Vehicle;

public class Car extends Vehicle{
	public String steering;
	public String musicSystem;
	public String airConditioner;
	public String freidge;
	public String entertainmentSystem;
	public Car() {
		super();
		this.steering = "Electronic";
		this.musicSystem = "JBL";
		this.airConditioner = "four zone control";
		this.freidge = "compressor auto-refrigerator";
		this.entertainmentSystem = "Advanced";
	}
	public Car(String steering, String musicSystem, String airConditioner, String freidge, String entertainmentSystem, String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine, wheels, seats, fuelTank, lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.freidge = freidge;
		this.entertainmentSystem = entertainmentSystem;
	}
	public String getSteering() {
		return steering;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public String getAirConditioner() {
		return airConditioner;
	}
	public String getFreidge() {
		return freidge;
	}
	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}
	@Override
	public String toString() {
		return "Car [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getFreidge()=" + getFreidge()
				+ ", getEntertainmentSystem()=" + getEntertainmentSystem() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank()
				+ ", getLights()=" + getLights() + "]";
	}
	
}
