package com.sowmik.class_fundamental;

public class Test {
	public static void main(String args[]) {
		 Car car = new Car("closed", "on", "seated", 13);
		//Car car = new Car();
		
		/*
		car.setSpeed(142);
		car.setDoor("closed");
		car.setDriver("seated");
		car.setEngine("on");
		*/
		
		System.out.println(car.run());
	}
}
