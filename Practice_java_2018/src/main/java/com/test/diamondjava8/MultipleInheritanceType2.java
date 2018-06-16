package com.test.diamondjava8;

public class MultipleInheritanceType2 implements InterfaceQ , InterfaceR{

	public MultipleInheritanceType2() {
	}
	
	public static void main(String[] args) {
		MultipleInheritanceType2 multipleInheritanceType2 = new MultipleInheritanceType2();
		multipleInheritanceType2.print();
	}

	@Override
	public void print() {
		InterfaceQ.super.print();
	}
	
	

}
