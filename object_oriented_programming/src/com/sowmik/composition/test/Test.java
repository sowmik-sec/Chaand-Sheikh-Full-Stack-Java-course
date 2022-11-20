package com.sowmik.composition.test;

import com.sowmik.composition.laptop.Laptop;
import com.sowmik.composition.laptop.component.GraphicsCard;
import com.sowmik.composition.laptop.component.Processor;

public class Test {
	public static void main(String args[]) {
//		Laptop lappy = new Laptop();
//		System.out.println(lappy.getProcessor().getMaxFrequency());
		Processor processor = new Processor("intel", "i5 7200u", 7 , 4, 4, "3 MB", "2.5 GHz", "1.2 GHz", "3.1 GHz" );
		GraphicsCard graphicsCard = new GraphicsCard("Nvidia", 1050, "4 GB");
		Laptop gamingLaptop = new Laptop(16.1f, processor, "DDR4" , "1 TB", graphicsCard, null, "backlit");
		System.out.println(gamingLaptop);
		gamingLaptop.gamingMode();
		System.out.println("Gaming mode on!");
		System.out.println("Current frequency: "+gamingLaptop.getProcessor().getFrequency());
	}
}
