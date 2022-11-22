package com.sowmik.linked_list;

import java.util.LinkedList;

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
		
		new App().printList(countries);
		
		countries.add(1, "Egypt");
		
		new App().printList(countries);
		
		countries.set(4, "Tunisia");
		
		new App().printList(countries);
		
		countries.remove();
		
		new App().printList(countries);
		
		countries.remove(3);
		
		new App().printList(countries);
		
		countries.remove("UAE");
		
		new App().printList(countries);
		
	}
	
	void printList(LinkedList<String> list) {
		for(String temp : list) {
			System.out.println("Country name: "+temp);
		}
		System.out.println("************");
	}
	
}
