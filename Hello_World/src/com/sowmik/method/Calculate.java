package com.sowmik.method;

public class Calculate {
	public boolean isPrime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	public boolean isPrime(double n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
	}
}
