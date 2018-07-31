package com.test.diamondjava8;

public interface InterfaceB {
	
	default void print() {
		System.out.println("Interface B");
	}
	default void test() {
		System.out.println("Test B");
	}

}
