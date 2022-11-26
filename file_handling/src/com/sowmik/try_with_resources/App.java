package com.sowmik.try_with_resources;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)) {
			int a = in.nextInt();
			System.out.println(a);
		}
		
		
	}
}
