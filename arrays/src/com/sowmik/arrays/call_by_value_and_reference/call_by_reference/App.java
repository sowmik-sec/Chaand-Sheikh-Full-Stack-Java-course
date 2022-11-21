package com.sowmik.arrays.call_by_value_and_reference.call_by_reference;

public class App {
	public static void main(String args[]) {
		String[] names = {"Ahsan", "Habib", "Sowmik"};
		App app = new App();
		app.displayNames(names);
		System.out.println(names);
		System.out.println("**************");
		for(String name : names) {
			System.out.println(name);
		}
	}
	
	void displayNames(String[] names) {
		names[0] = "Volga";
		for(String name : names) {
			System.out.println(name);
		}
	}
	
}
