package com.sowmik.abstraction.person;

import com.sowmik.interfaces.multiple_inheritance.IsAlive;
import com.sowmik.interfaces.multiple_inheritance.LiveLife;

public abstract class Person implements LiveLife, IsAlive{
	public void speak() {
		System.out.println("Share his/her thoughts.");
	}
	
	@Override
	public void breathe() {
		System.out.println("be alive, remain living.");
	}
	
	@Override
	public void message() {
		System.out.println("life is journey, keep moving and meet new person.");
	}
	public abstract void eat();
}
