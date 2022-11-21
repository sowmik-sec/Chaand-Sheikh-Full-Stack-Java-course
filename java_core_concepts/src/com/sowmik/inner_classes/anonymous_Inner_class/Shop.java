package com.sowmik.inner_classes.anonymous_Inner_class;

public class Shop {
	public static void main(String args[]) {
		Door door = new Door();
		//door.getLock().test();
		if(door.getLock().isUnlocked(args[0])) {
			System.out.println("Welcome, we are open");
		}
		else {
			System.out.println("We are closed now, please visit later.");
		}
	}
}
