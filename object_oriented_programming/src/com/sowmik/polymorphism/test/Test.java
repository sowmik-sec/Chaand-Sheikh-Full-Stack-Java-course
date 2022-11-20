package com.sowmik.polymorphism.test;

import com.sowmik.polymorphism.phone.Nokia;
import com.sowmik.polymorphism.phone.Phone;
import com.sowmik.polymorphism.phone.Samsung;

public class Test {
	public static void main(String args[]) {
//		Phone phone = new Phone("Zelta");
//		System.out.println(phone.getModel());
//		phone.features();
//		SamsungS22Ultra s22ultra = new SamsungS22Ultra("S 22 Ultra");
//		System.out.println(s22ultra.getModel());
//		s22ultra.features();
		
		Phone nokia3310 = new Test().phone(1);
		System.out.println(nokia3310.getModel());
		nokia3310.features();
		
		Phone s22ultra = new Test().phone(2);
		
		System.out.println(s22ultra.getModel());
		s22ultra.features();
		
		
		
	}
	
	public Phone phone(int dailyDriver) {
		switch(dailyDriver) {
		case 1: return new Nokia("3310");
		case 2: return new Samsung("S 22 Ultra");
		}
		return null;
	}
	
}
