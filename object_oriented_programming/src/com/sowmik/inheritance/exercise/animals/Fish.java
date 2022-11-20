package com.sowmik.inheritance.exercise.animals;

import com.sowmik.inheritance.exercise.parent.Animal;

public class Fish extends Animal{
	private String dwellingPlace;
	private String respiration;
	public Fish() {
		super();
		animalType = "Fish";
		this.dwellingPlace = "Water";
		this.respiration = "gills";
	}
	public Fish(String dwellingPlace, String respiration, double height, double weight, String animalType, String bloodType) {
		super(height, weight, animalType, bloodType);
		this.dwellingPlace = dwellingPlace;
		this.respiration = respiration;
	}
	public String getDwellingPlace() {
		return dwellingPlace;
	}
	public String getRespiration() {
		return respiration;
	}
	public void showInfo() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Fish [getDwellingPlace()=" + getDwellingPlace() + ", getRespiration()=" + getRespiration()
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}
	
}
