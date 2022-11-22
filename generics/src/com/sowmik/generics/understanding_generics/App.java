package com.sowmik.generics.understanding_generics;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T> {
	private T myVariable;

	public Data(T myVariable) {
		super();
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}
	
}


public class App {
	public static void main(String args[]) {
		List<Data<Object>> elements = new LinkedList<>();
		
		elements.add(new Data<Object>("some string"));
		elements.add(new Data<Object>(3));
		elements.add(new Data<Object>(52.14d));
		elements.add(new Data<Object>(true));
		elements.add(new Data<Object>(779.34f));
		elements.add(new Data<Object>('%'));
		
		
		App app = new App();
		app.printList(elements);
		
		
	}
	
	void printList(List<Data<Object>> list) {
		ListIterator<Data<Object>> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Element: "+iterator.next().getMyVariable());
		}
		System.out.println("************");
	}
}
