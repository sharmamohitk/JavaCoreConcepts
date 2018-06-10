package com.test.naukri;

public class SwapNumber {

	/** swap number and string without third variable **/
	public static void main(String[] args) {
		
		int x = 10;
		int y = 9;
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println(x);
		System.out.println(y);
		
		String test1="test1";
		String test2 = "test2";
		
		test1 = test1.concat(test2);
		test2 = test1.substring(0,test1.length()-test2.length());
		test1 = test1.substring(test2.length());
		
		System.out.println(test1);
		System.out.println(test2);
		
		
	}
	
}
