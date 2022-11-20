package com.sowmik.inheritance.exercise.parent;

public class Animal {
	protected double height;
	protected double weight;
	protected String animalType;
	protected String bloodType;
	public Animal() {
		this.height = 0;
		this.weight = 0;
		this.animalType = "imaginary";
		this.bloodType = "X";
	}
	public Animal(double height, double weight, String animalType, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public String getAnimalType() {
		return animalType;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void showInfo() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Animal [height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}
	
}
