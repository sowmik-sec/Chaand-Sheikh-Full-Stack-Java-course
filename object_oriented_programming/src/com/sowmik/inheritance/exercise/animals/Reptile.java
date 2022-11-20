package com.sowmik.inheritance.exercise.animals;

import com.sowmik.inheritance.exercise.parent.Animal;

public class Reptile extends Animal{
	protected String skinType;
	protected String egg;
	protected String backbone;
	public Reptile() {
		super();
		height = 5;
		weight = 20;
		animalType = "Reptile";
		bloodType = "Cold";
		this.skinType = "scratchy";
		this.backbone = "has backbone";
		this.egg = "soft shelled";
	}
	public Reptile(String skinType, String backbone, double height, double weight, String animalType, String bloodType) {
		super(height, weight, animalType, bloodType);
		this.skinType = skinType;
		this.backbone = backbone;
	}
	
	
	@Override
	public String toString() {
		return "Reptile [skinType=" + skinType + ", egg=" + egg + ", backbone=" + backbone + ", height=" + height
				+ ", weight=" + weight + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	public String getSkinType() {
		return skinType;
	}
	public String getBackbone() {
		return backbone;
	}
	public void showInfo() {
		System.out.println(toString());
	}
	
}
