package com.sowmik.interfaces.phone;

public class OnePlus10 implements Phone{

	@Override
	public String processor() {
		return "Snapdragon 8 Gen 1";
	}

	@Override
	public String OS() {
		return "OxygenOS";
	}

	@Override
	public int spaceInGB() {
		return 256;
	}
	
}
