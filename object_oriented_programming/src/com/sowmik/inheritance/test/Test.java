package com.sowmik.inheritance.test;

import com.sowmik.inheritance.vehicles.Bike;
import com.sowmik.inheritance.vehicles.Car;
import com.sowmik.inheritance.vehicles.Truck;

public class Test {
	public static void main(String args[]) {
		Bike bike = new Bike("pipe", "octen", 4, 2, 15, "LED");
		Car car = new Car();
		Truck truck = new Truck();
		bike.run(); 
	}
}
