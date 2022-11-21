package com.sowmik.arrays.call_by_value_and_reference.call_by_value;

public class App {
	public static void main(String args[]) {
		int value = 10;
		App app = new App();
		app.displayValue(value);
		System.out.println("Current value of variable in main method is "+ value);
	}
	
	void displayValue(int value) {
		System.out.println("Current value of variable in displayValue method is "+ value);
		value = 20;
		System.out.println("Current value of variable in displayValue method is "+ value);
		
	}
	
}
