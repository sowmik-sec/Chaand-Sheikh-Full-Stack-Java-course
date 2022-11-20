package com.sowmik.inheritance.exercise.animals;

public class Eel extends Fish{
	private String specialChar;

	public Eel() {
		super();
		height = 3;
		weight = 5;
		bloodType = "Cold";
		this.specialChar = "Releases electric stock";
	}

	public Eel(String specialChar, String dwellingPlace, String respiration, double height, double weight, String animalType, String bloodType) {
		super(dwellingPlace, respiration, height, weight, animalType, bloodType);
		this.specialChar = specialChar;
	}

	public String isReleaseElectricCharge() {
		return specialChar;
	}
	
	public void showInfo() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Eel [specialChar=" + specialChar + ", height=" + height + ", weight=" + weight + ", animalType="
				+ animalType + ", bloodType=" + bloodType + "]";
	}
	
	
	
}
