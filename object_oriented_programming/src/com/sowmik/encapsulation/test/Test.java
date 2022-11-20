package com.sowmik.encapsulation.test;

import com.sowmik.encapsulation.person.Person;

public class Test {
	public static void main(String args[]) {
		Person person = new Person("Sowmik", 27, "Male");
		System.out.println(person);
		Person pooja = new Person("Pooja", 28, "Female");
		System.out.println(pooja);
		pooja.setAge(22);
		System.out.println(pooja);
	}
}
