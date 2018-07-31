package com.test.diamondjava8;

public interface InterfaceR extends InterfaceP{

	default void print() {
		System.out.println(" Called InterfaceR !!");
	}
}
