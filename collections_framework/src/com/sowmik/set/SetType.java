package com.sowmik.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetType {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		for(int i=30; i>0;i--) {
			set.add("A"+i);
		}
		for(String i: set) {
			System.out.println(i);
		}
		
		Set<String> set2 = new HashSet<>();
		Set<String> set3 = new LinkedHashSet<>();
	}

}
