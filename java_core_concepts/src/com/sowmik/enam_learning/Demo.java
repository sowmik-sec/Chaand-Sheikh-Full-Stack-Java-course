package com.sowmik.enam_learning;

public class Demo {
	public static void main(String args[]) {
		Learning learn = Learning.JSPANDSERVLETS;
		switch(learn) {
		case COREJAVA:
			System.out.println("Step 1: learning Core Java.");
			break;
		case COLLECTIONS:
			System.out.println("Step 2: learning Collections framework.");
			break;
		case GENERICS:
			System.out.println("Step 1: learning Generics.");
			break;
		case JSPANDSERVLETS:
			System.out.println("Step 1: learning Jsp and Servlet.");
			break;
		case MULTITHREADING:
			System.out.println("Step 1: learning Multithreading.");
			break;
		default:
			break;
		
		}
	}
}
