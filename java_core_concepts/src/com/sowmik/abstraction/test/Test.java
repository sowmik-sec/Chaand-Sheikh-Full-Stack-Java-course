package com.sowmik.abstraction.test;

import com.sowmik.abstraction.person.NonVegan;
import com.sowmik.abstraction.person.Person;
import com.sowmik.abstraction.person.Vegan;

public class Test {
	public static void main(String args[]) {
		Person john = new Vegan();
		john.speak();
		john.eat();
		System.out.println("************");
		Person mia = new NonVegan();
		mia.speak();
		mia.eat();
		john.message();
	}
}
