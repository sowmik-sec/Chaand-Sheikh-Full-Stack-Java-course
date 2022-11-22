package com.sowmik.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class App {
	public static void main(String args[]) {
		List<String> list1 = new ArrayList<>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");
		
		new App().printList(list1);
		
	}
	
	void printList(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Element: "+iterator.next());
		}
	}
	
}
