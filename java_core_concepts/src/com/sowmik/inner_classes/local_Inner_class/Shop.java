package com.sowmik.inner_classes.local_Inner_class;

public class Shop {
	public static void main(String args[]) {
		//Door door = new Door();
		if(new Door().isLocked(args[0])) {
			System.out.println("Shop has closed, visit later.");
		}
		else {
			System.out.println("Welcome, we are open.");
		}
		System.out.println(args[2]);
	}
}
