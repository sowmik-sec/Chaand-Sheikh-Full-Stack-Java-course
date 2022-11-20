package com.sowmik.inheritance.exercise.animals;

public class Eagle extends Birds{
	public void showInfo() {
		System.out.println(toString());
	}

	public Eagle() {
		super();
		
	}

	@Override
	public String toString() {
		return "Eagle [isHasFeather()=" + isHasFeather() + ", getFly()=" + getFly() + ", toString()=" + super.toString()
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}
}
