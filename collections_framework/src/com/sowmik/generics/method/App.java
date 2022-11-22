package com.sowmik.generics.method;

import java.util.ArrayList;
import java.util.List;

class Data {
	public <E> void printListData(List<E> list ) {
		for(E element : list) {
			System.out.println(element);
		}
	}
	
	public <E> void printArrayData(E[] arrayData) {
		for(E element : arrayData) {
			System.out.println(element);
		}
	}
	
}

public class App {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Data data = new Data();
		data.printListData(list);
		
		List<String> list2 = new ArrayList<>();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("four");
		data.printListData(list2);
		
		String[] arr = {"Huzaifa", "Fatema", "Ayesha"};
		data.printArrayData(arr);
		
		Integer[] arr2 = {4,513,52423,523,42,4};
		data.printArrayData(arr2);
		
	}
}
