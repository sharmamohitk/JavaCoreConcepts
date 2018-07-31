package com.test.diamondjava8;

public class MultipleInheritanceTest implements InterfaceA,InterfaceB{

	public MultipleInheritanceTest() {
	}
	
	@Override
	public void print() {
		System.out.println("do nothing , override version from class");
	}
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("override version from class but calling interfaceb default method");
		InterfaceB.super.test();
	}

	public static void main(String[] args) {
		
		MultipleInheritanceTest testMultipleInterface = new MultipleInheritanceTest();
		testMultipleInterface.print();
		testMultipleInterface.test();
	}

}
