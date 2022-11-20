package com.sowmik.inheritance.exercise.test;

import java.util.ArrayList;
import java.util.List;

import com.sowmik.inheritance.exercise.animals.Crocodile;
import com.sowmik.inheritance.exercise.animals.Eagle;
import com.sowmik.inheritance.exercise.animals.Eel;
import com.sowmik.inheritance.exercise.animals.Reptile;
import com.sowmik.inheritance.exercise.parent.Animal;

public class Test {
	public static void main(String args[]) {
//		Eagle eagle = new Eagle();
//		eagle.showInfo();
//		Reptile reptile = new Reptile();
//		reptile.showInfo();
//		
//		Crocodile croc = new Crocodile();
//		croc.showInfo();
		
//		Eel eel = new Eel();
//		eel.showInfo();
		
//		Eagle eagle = new Eagle();
//		eagle.showInfo();
		
		
		List<Animal> animals = new ArrayList<>(); 
		
		Animal animal = new Animal();
		Animal reptile = new Reptile();
		Animal croc = new Crocodile();
		Animal eel = new Eel();
		Animal eagle = new Eagle();
		
		
		animals.add(animal);
		animals.add(reptile);
		animals.add(eel);
		animals.add(croc);
		animals.add(eagle);
		
		listAnimals(animals);
		
	}
	
	public static void listAnimals(List<Animal> animals) {
		for(Animal animal : animals) {
			animal.showInfo();
		}
	}
}
