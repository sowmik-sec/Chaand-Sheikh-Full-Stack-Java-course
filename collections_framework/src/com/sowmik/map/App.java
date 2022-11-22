package com.sowmik.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class App {
	public static void main(String[] args) {
		Map<Integer, String> student = new HashMap<>();
		student.put(1, "Ahsan");
		student.put(2, "Habib");
		student.put(3, "Sowmik");
		student.put(3, "Volga");
		student.put(4, "Chaand");
		student.put(5, "Chad");
		student.put(6, "Maqbul");
		
		/*
		for(Map.Entry<Integer, String> entry: student.entrySet()) {
			System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
		}
		*/
		
		/*
		for(Integer key: student.keySet()) {
			System.out.println("key: "+key+" value: "+student.get(key));
		}
		*/
		
		Iterator<Entry<Integer, String>> entry = student.entrySet().iterator();
		while(entry.hasNext()) {
			Entry<Integer, String> temp = entry.next();
			System.out.println("key: "+temp.getKey() + " value: "+temp.getValue());
		}
		
	}
}
