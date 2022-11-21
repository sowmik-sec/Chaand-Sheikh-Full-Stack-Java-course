package com.sowmik.static_elements;

public class TestStatic {
	private static int staticVariable;

	public int getStaticVariable() {
		return staticVariable;
	}

	public void setStaticVariable(int staticVariable) {
		TestStatic.staticVariable = staticVariable;
	}
	
}
