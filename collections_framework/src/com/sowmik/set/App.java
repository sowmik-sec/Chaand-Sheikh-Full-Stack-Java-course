package com.sowmik.set;

import java.util.HashSet;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Ahsan");
		set.add("Habib");
		set.add("Sowmik");
		set.add("Ahsan");
		set.add("Ahsan");
		set.add("Ahsan");
		
		for(String name: set) {
			System.out.println(name);
		}
	}
}
