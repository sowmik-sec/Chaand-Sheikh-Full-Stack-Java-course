package com.sowmik.sort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {
	public static void main(String args[]) {
		LinkedList<String> countries = new LinkedList<>();
		countries.add("Bangladesh");
		countries.add("Pakistan");
		countries.add("Qatar");
		countries.add("UAE");
		countries.add("KSA");
		countries.add("Iraq");
		countries.add("Syria");
		countries.add("Morocco");
		countries.sort(null);
		
		new App().printList(countries);
		
		Collections.reverse(countries);
		
		new App().printList(countries);
		
	}
	
	void printList(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Element: "+iterator.next());
		}
		System.out.println("************");
	}
}
