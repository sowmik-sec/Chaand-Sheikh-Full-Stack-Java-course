package com.sowmik.list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");
		
		new ListInterface().printList(list1);
		
		List<String> list2 = new LinkedList<>();
		
		list2.add("Bangla");
		list2.add("Arabic");
		list2.add("Hindi");
		list2.add("Urdu");
		
		new ListInterface().printList(list2);
		
		
	}
	
	public void printList(List<String> list) {
		for(String tem : list) {
			System.out.println(tem);
		}
		System.out.println("************");
	}

}
