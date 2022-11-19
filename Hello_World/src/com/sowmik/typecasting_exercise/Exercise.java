package com.sowmik.typecasting_exercise;

import java.util.Scanner;

public class Exercise {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		float b = in.nextFloat();
		double ans = (a*a) + 2*a*b + (b*b);
		System.out.println(ans);
	}
}
