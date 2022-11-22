package com.sowmik.stack;

import java.util.Stack;

public class App {
	public static void main(String args[]) {
		Stack<Integer> demo = new Stack<>();
		demo.push(0);
		demo.push(1);
		demo.push(2);
		demo.push(3);
		demo.push(4);
		demo.push(5);
		demo.push(6);
		
		demo.pop();
		
		for(int temp : demo) {
			System.out.println(temp);
		}
		
		System.out.println("************");
		
		System.out.println(demo.peek());
		
		System.out.println("************");
		
		if(demo.isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Stack is not empty");
		}
		
	}
}
