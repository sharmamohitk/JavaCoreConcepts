package com.test.diamondjava8;

public interface InterfaceQ extends InterfaceP{

	default void print() {
		System.out.println(" Called InterfaceQ !!");
	}
}
