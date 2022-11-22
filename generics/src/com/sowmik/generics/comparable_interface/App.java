package com.sowmik.generics.comparable_interface;

class Data<T extends Comparable> implements Comparable<T>{
	private T myVariable;

	public Data(T myVariable) {
		super();
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}

	@Override
	public int compareTo(T o) {
		return o.compareTo(getMyVariable());
	}
	
}

public class App {
	public static void main(String args[]) {
		Data<Integer> data = new Data<Integer>(1); // part 1
		System.out.println(data.compareTo(0));
	}	
}
