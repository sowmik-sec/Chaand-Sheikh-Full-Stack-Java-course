package com.sowmik.method;

import java.util.Scanner;

public class Prime {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Which number do you want to check prime or not: ");
		double n = in.nextDouble();
		Calculate cal = new Calculate();
		if(cal.isPrime(n)==true) {
			System.out.println("This is a prime number");
		}
		else System.out.println("This is not a prime number");
	}

	
}
