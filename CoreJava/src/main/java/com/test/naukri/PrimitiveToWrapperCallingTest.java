package com.test.naukri;

public class PrimitiveToWrapperCallingTest {

	public PrimitiveToWrapperCallingTest() {
	}
	
	static void testIntWrapper(int num) {
		System.out.println("primitive called");
	}
	
	static void testIntWrapper(Integer num) {
		System.out.println("Wrapper called");
	}
	static void testIntWrapper(String num) {
		System.out.println(" String Wrapper called");
	}
	
	static void testIntWrapper(Object num) {
		System.out.println(" Object Wrapper called");
	}
	
	
	
	public static void main(String[] args) {
		testIntWrapper(5);
		testIntWrapper("5");
		testIntWrapper(new Integer(4));
		//The method testIntWrapper(Integer) is ambiguous for the type PrimitiveToWrapperCallingTest
		//testIntWrapper(null);
		
	}

}
