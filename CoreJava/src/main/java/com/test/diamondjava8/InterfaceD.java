package com.test.diamondjava8;

public interface InterfaceD extends InterfaceC{
	
	default void print() {
		System.out.println("Interface D");
	}
	
	}
