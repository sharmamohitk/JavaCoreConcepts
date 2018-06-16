package com.test.diamondjava8;

public interface InterfaceA {
	
	default void print() {
		System.out.println("Interface A");
	}
	
	default void test() {
		System.out.println("Test A");
	}

}
