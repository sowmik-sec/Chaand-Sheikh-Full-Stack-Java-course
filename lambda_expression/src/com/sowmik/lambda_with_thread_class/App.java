package com.sowmik.lambda_with_thread_class;

public class App {
	public static void main(String[] args) {
		new Thread(()->System.out.println("hello")).start();;
		
	}
}
