package com.sowmik.polymorphism.phone;

public class Samsung extends Phone{
	
	public Samsung(String model) {
		super(model);
		
	}

	public void features() {
		System.out.println("Flagship phone");
	}
}
