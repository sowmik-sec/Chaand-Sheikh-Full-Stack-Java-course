package com.sowmik.nested_loop_exercise;

import java.util.Scanner;

/*
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class NestedLoop {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
