package com.sowmik.class_fundamental;

public class Car {
	private String door;
	private String engine;
	private String driver;
	private int speed;
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public String run() {
		if(door.equals("closed") && engine.equals("on") && driver.equals("seated") && speed > 0) {
			return "running";
		}
		return "not running";
	}

	public Car(String door, String engine, String driver, int speed) {
		super();
		this.door = door;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
	
	Car() {
		super();
		this.door = "opened";
		this.engine = "off";
		this.driver = "absent";
		this.speed = 0;
	}

	@Override
	public String toString() {
		return "Car [door=" + door + ", engine=" + engine + ", driver=" + driver + ", speed=" + speed + "]";
	}

	
	
}
