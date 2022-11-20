package com.sowmik.inheritance.exercise.animals;

import com.sowmik.inheritance.exercise.parent.Animal;

public class Birds extends Animal{
	private boolean hasFeather;
	private String fly;
	public Birds() {
		super();
		height = 2;
		weight = 2;
		animalType = "Bird";
		bloodType = "Hot";
		this.hasFeather = true;
		this.fly = "Birds can fly";
	}
	public Birds(String hasFeather, String fly, double height, double weight, String animalType, String bloodType) {
		super(height, weight, animalType, bloodType);
		this.hasFeather = true;
		this.fly = fly;
	}
	public boolean isHasFeather() {
		return hasFeather;
	}
	public String getFly() {
		return fly;
	}
	public void showInfo() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Birds [isHasFeather()=" + isHasFeather() + ", getFly()=" + getFly() + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType() + ", getBloodType()="
				+ getBloodType() + "]";
	}
	
}
