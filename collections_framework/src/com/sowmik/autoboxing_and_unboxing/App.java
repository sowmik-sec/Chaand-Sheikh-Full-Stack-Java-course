package com.sowmik.autoboxing_and_unboxing;

import java.util.ArrayList;

class intWrapper {
	public int intValue;
	
	public intWrapper(int intValue) {
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	
}

public class App {
	public static void main(String args[]) {
		/*
		ArrayList<Integer> studentNumber = new ArrayList<>();
		studentNumber.add(25);
		System.out.println(studentNumber.get(0));
		
		ArrayList<intWrapper> studentNumber = new ArrayList<>();
		studentNumber.add(new intWrapper(13));  // boxing
		
		System.out.println(studentNumber.get(0).getIntValue());  // unboxing
		*/
		
		ArrayList<Double> demoList = new ArrayList<>();
		demoList.add(23.23);
		// demoList.add(new Double(11.235));
		demoList.add(Double.valueOf(97.632));
		
		System.out.println(demoList.get(0));
		
	}
}
