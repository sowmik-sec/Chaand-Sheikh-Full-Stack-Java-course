package com.sowmik.static_elements;

public class App {
	public static void main(String args[]) {
		TestStatic obj1 = new TestStatic();
		System.out.println(obj1.getStaticVariable());
		obj1.setStaticVariable(1);
		System.out.println(obj1.getStaticVariable());
		TestStatic obj2 = new TestStatic();
		obj2.setStaticVariable(2);
		System.out.println(obj2.getStaticVariable());
		TestStatic obj3 = new TestStatic();
		System.out.println(obj3.getStaticVariable());
	}
}
