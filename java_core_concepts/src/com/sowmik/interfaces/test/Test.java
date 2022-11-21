package com.sowmik.interfaces.test;

import com.sowmik.interfaces.phone.IPhone14;
import com.sowmik.interfaces.phone.OnePlus10;
import com.sowmik.interfaces.phone.Phone;

public class Test {
	public static void main(String args[]) {
		Phone phone = new IPhone14();
		System.out.println("Processor: "+phone.processor());
	}
}
