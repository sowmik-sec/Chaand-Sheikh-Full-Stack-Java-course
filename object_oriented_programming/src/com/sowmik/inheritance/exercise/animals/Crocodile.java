package com.sowmik.inheritance.exercise.animals;

public class Crocodile extends Reptile{
	
	public void showInfo() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Crocodile [skinType=" + skinType + ", egg=" + egg + ", backbone=" + backbone + ", height=" + height
				+ ", weight=" + weight + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}

	public Crocodile() {
		super();
		egg = "Hard Shelled";
	}
	
}
