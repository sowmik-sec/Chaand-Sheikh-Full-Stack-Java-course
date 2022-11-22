package com.sowmik.arraylist;

import java.util.ArrayList;

public class App {
	static ArrayList<String> list = new ArrayList<>();
	public static void main(String args[]) {
		list.add("Ahsan");
		list.add("Habib");
		list.add("Volga");
		list.add("Asaduzzaman");
		list.add("Abdur Rahman");
		list.add("Shariatullah");
		list.add("Velu");
		
		App obj = new App();
		
		obj.displayList(list);
		
		obj.removeNameByPosition(0);
		
		System.out.println("**************");
		
		obj.displayList(list);
		
		obj.removeNameByString("Volga");
		
		System.out.println("**************");
		
		obj.displayList(list);
		
		System.out.println("**************");
		
		obj.modifyName(2, "Gonai");
		
		obj.displayList(list);
		
		
		int pos = obj.search("Shariatullah");
		if(pos==-1) {
			System.out.println("Invalid entry");
		}
		else {
			System.out.println(pos);
		}
		
	}
	
	void displayList(ArrayList<String> names) {
		for(String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
	}
	
	void removeNameByPosition(int pos) {
		list.remove(pos);
	}
	
	void removeNameByString(String name) {
		list.remove(name);
	}

	void modifyName(int position, String newName) {
		list.set(position, newName);
	}
	
	int search(String name) {
		return list.indexOf(name);
	}

}
