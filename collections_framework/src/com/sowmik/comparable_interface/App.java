package com.sowmik.comparable_interface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Names implements Comparable<Names> {

	
	
	private String name;
	public Names(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Names obj) {
		if(name.length()==obj.name.length()) {
			return 0;
		}
		else if(name.length()<obj.name.length()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	@Override
	public String toString() {
		return name;
	}
	
	
}

public class App {
	public static void main(String args[]) {
		List<Object> elements = new LinkedList<>();
		elements.add(new Names("Ahsan"));
		elements.add(new Names("Habib"));
		elements.add(new Names("Sowmik"));
		elements.add(new Names("Volga"));
		elements.add(new Names("Ginnie"));
		elements.add("Some String");
		elements.add(1);
		elements.add(34);
		elements.add(342.66);
		elements.add(true);
		
		
		App app = new App();
		app.printList(elements);
		
		
	}
	
	void printList(List<Object> list) {
		ListIterator<Object> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Element: "+iterator.next());
		}
		System.out.println("************");
	}
}
