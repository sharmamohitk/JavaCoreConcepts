package com.practice.designpattern.factorymethod;

public abstract class Computer {

	public Computer() {
	}
	
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();

	@Override
	public String toString() {
		return "Computer [getRAM()=" + getRAM() + ", getHDD()=" + getHDD() + ", getCPU()=" + getCPU() + "]";
	}
 }
