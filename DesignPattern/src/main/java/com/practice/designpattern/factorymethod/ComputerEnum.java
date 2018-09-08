package com.practice.designpattern.factorymethod;

public enum ComputerEnum {

	PC("PC"),SERVER("SERVER");
	
	private final String val;
	
	private ComputerEnum(String val) {
		this.val = val;
	}
	
	public String getVal() {
		return val; 
	}
	
}
