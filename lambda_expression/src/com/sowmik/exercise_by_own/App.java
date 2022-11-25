package com.sowmik.exercise_by_own;

interface Lambda {
	public int demo(int a);
}

public class App {
	public static void main(String[] args) {
		Lambda lambda = (int a) -> a;
		System.out.println(lambda.demo(7));
	}
}
