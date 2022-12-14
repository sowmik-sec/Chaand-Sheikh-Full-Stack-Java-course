package com.sowmik.encapsulation.person;

public class Person {
	private String name = "John";
	private int age = 25;
	private String gender = "Male";
	
	public Person() {
		this.name = "John Doe";
		this.age = 25;
		this.gender = "Male";
	}

	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public boolean setAge(int age) {
		if(age>0 && age<100) {
			this.age = age;
			return true;
		}
		else return false;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
