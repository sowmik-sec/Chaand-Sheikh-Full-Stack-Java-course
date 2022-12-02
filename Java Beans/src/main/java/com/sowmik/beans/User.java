package com.sowmik.beans;

public class User {
	private String firstName, lastName;

	public User() {
		this.firstName = "John";
		this.lastName = "Doe";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
