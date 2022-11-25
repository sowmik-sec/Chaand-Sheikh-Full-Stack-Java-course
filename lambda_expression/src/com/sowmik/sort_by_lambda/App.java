package com.sowmik.sort_by_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data {
	private String name;

	public Data(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}
	
}

public class App {
	public static void main(String[] args) {
		List<Data> list = new ArrayList<>();
		list.add(new Data("Ahsan"));
		list.add(new Data("Habib"));
		list.add(new Data("Sowmik"));
		list.add(new Data("Volga"));
		list.add(new Data("Ginnie"));
		
		/*
		 * Collections.sort(list, new Comparator<Data>() {
		 * 
		 * @Override public int compare(Data o1, Data o2) { return
		 * o1.getName().compareTo(o2.getName()); } });
		 */
		/*
		Collections.sort(list, (Data d1, Data d2)->
				d1.getName().compareTo(d2.getName())
				);
		
		*/
		
		Collections.sort(list, (Data o1, Data o2)-> {
					if(o1.getName().length()<o2.getName().length()) {
						return -1;
					}
					else if(o1.getName().length()>o2.getName().length()) {
						return 1;
					}
					else return 0;
				}
			);
		for(Data temp : list) {
			System.out.println(temp.getName());
		}
		
	}
}
