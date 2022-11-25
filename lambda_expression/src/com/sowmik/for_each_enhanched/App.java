package com.sowmik.for_each_enhanched;

import java.util.ArrayList;
import java.util.List;

class Data {
	private String name;

	public Data(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

	public String getName() {
		return name;
	}
	
}

public class App {
	public static void main(String[] args) {
		List<Data> list = new ArrayList<>();
		list.add(new Data("Habib"));
		list.add(new Data("Ahsan"));
		list.add(new Data("Sowmik"));
		list.add(new Data("Volga"));
		list.forEach(temp ->{
				if(temp.getName().equals("Volga")) {
					System.out.println("Grand father gave me this name "+temp.getName());
				}
				else if(temp.getName().equals("Sowmik")) {
					System.out.println("My nickname is "+temp.getName());
				}
				else {
					System.out.println(temp.getName()+" is my other name ");
				}
			}
		);
	}
}
