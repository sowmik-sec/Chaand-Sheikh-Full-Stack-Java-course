package com.sowmik.arrays;

public class App {
	public static void main(String args[]) {
		int[] intVariable = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//intVariable[5] = 10;
		System.out.println(intVariable[5]);
		
		float[] floatVariableArray = {1.3f, 43.23f, 34.34f};
		
		for(float var : floatVariableArray) {
			System.out.println(var);
		}
		
		String[] st = {"Ahsan", "Habib", "Sowmik"};
		
		for(String s : st) {
			System.out.println(s);
		}
	}
}
