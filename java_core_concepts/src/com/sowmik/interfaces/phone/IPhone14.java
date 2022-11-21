package com.sowmik.interfaces.phone;

public class IPhone14 implements Phone{

	@Override
	public String processor() {
		return "A16";
	}

	@Override
	public String OS() {
		return "IOS";
	}

	@Override
	public int spaceInGB() {
		return 256;
	}

}
