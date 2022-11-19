package com.sowmik.nested_loop_exercise;

import java.util.Scanner;

public class SumOfDegits {
	public static void main(String args[]) {
		System.out.print("Please enter a number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		while(n>0) {
			sum += n%10;
			n/=10;
		}
		System.out.println(sum);
	}
}
